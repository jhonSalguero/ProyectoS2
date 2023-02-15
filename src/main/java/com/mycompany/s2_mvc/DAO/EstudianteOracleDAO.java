/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.DAO;

import com.mycompany.s2_mvc.Database.ConnectionOracleDB;
import com.mycompany.s2_mvc.DTO.EstudianteDTO;
import com.mycompany.s2_mvc.modelo.Estudiante;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author david
 */
public class EstudianteOracleDAO {

    private static ConnectionOracleDB o_con = ConnectionOracleDB.getInstance();
    private static Connection con = o_con.getConnection();

    private CallableStatement cs = null;

    private static EstudianteOracleDAO estudianteServiceOracle;

    private EstudianteOracleDAO() {
    }

    public static EstudianteOracleDAO getInstance() {
        if (estudianteServiceOracle == null) {
            estudianteServiceOracle = new EstudianteOracleDAO();
        }
        return estudianteServiceOracle;
    }

    public double promedioEstudiante(int codigo) throws SQLException {
        con.createStatement();
        cs = con.prepareCall("{? = call promedio_estudiante(?)}");
        cs.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMERIC);
        cs.setInt(2, codigo);
        cs.execute();

        float resultado = cs.getFloat(1);
        return resultado;
    }

    public EstudianteDTO promedioEstudianteDTO(int codigo) throws SQLException {
        con.createStatement();
        cs = con.prepareCall("{? = call promedio_estudiante(?)}");
        cs.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMERIC);
        cs.setInt(2, codigo);
        cs.execute();

        float resultado = cs.getFloat(1);

        EstudianteDTO est = new EstudianteDTO();
        est.setPromedio(resultado);

        return est;
    }

    public boolean actualizarCorreo() {
        try {
            con.createStatement();
            cs = con.prepareCall("{call actualizar_email()}");
            cs.execute();
            con.commit();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    //Método encargado de buscar un estudiante en oracle
    public EstudianteDTO buscarIdEstudianteOracle(int idEstudiante) {
        EstudianteDTO estudiante = new EstudianteDTO();
        try {
            String consulta = "select * from estudiante where codigo = " + idEstudiante;
            PreparedStatement statement = con.prepareStatement(consulta);
            ResultSet resultado = statement.executeQuery();
            if (resultado.next()) {
                estudiante.setCodigo(resultado.getInt(1));
                estudiante.setNombres(resultado.getString(2));
                estudiante.setApellido1(resultado.getString(3));
                estudiante.setApellido2(resultado.getString(4));
                estudiante.setTelefono(resultado.getString(5));
                estudiante.setPrograma(resultado.getString(6));
                Blob img = resultado.getBlob(7);
                if (img != null) {
                    estudiante.setImagen(img.getBytes(1, (int) img.length()));
                } else {
                    estudiante.setImagen(null);
                }
            }
            resultado.close();
            statement.close();
        } catch (SQLException e) {
            e.getMessage();
        }
        return estudiante;
    }

    //Método encargado de guardar la foto de un estudiante en oracle  
    public void guardarImagenOracle(EstudianteDTO estudiante) {
        //Connection con = null;
        PreparedStatement pstmt = null;

        try {
            // Conexión a la base de datos Oracle
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            //con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "software2", "software2");

            // Abrir el explorador de archivos para seleccionar la imagen
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Seleccionar imagen");
            fileChooser.setFileFilter(new FileNameExtensionFilter("Imágenes", "jpg", "jpeg", "png", "gif"));
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();

                // Preparar la consulta para insertar la imagen en la base de datos
                //String sql = "INSERT INTO imagenes (id, nombre, imagen) VALUES (?, ?, ?)";
                String sql = "update estudiante set imagen = ? where codigo = ?";
                pstmt = con.prepareStatement(sql);
                pstmt.setInt(2, estudiante.getCodigo()); // Cambiar el valor de id por el de la imagen que se está guardando
                //pstmt.setString(2, selectedFile.getName()); // Establecer el nombre del archivo como nombre de la imagen

                // Leer la imagen desde el archivo seleccionado y crear un objeto FileInputStream
                FileInputStream inputStream = new FileInputStream(selectedFile);

                // Establecer el objeto FileInputStream como parámetro de la consulta
                pstmt.setBinaryStream(1, inputStream, inputStream.available());

                // Ejecutar la consulta para insertar la imagen en la base de datos
                pstmt.executeUpdate();

                System.out.println("La imagen se ha guardado correctamente en la base de datos.");
            } else {
                System.out.println("No se ha seleccionado ninguna imagen.");
            }
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
    
    // Metodo para mostrar la imagen almacenada en la base de datos oracle
    public void mostrarImagenOracle(EstudianteDTO estudiante){
        //Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Conexión a la base de datos Oracle
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            //con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "software2", "software2");

            // Consulta para obtener la imagen de la base de datos
            String sql = "SELECT imagen FROM estudiante WHERE codigo = ?";

            // Preparar la consulta
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, estudiante.getCodigo()); // Cambiar el valor de id por el de la imagen que se desea mostrar

            // Ejecutar la consulta y obtener los resultados
            rs = pstmt.executeQuery();
            if (rs.next()) {
                // Obtener la imagen como un array de bytes
                byte[] bytes = rs.getBytes("imagen");

                // Crear un objeto ImageIcon a partir del array de bytes
                ImageIcon imageIcon = new ImageIcon(bytes);

                // Crear un objeto JLabel con la imagen
                JLabel label = new JLabel(imageIcon);

                // Crear una ventana y agregar el objeto JLabel
                JFrame frame = new JFrame("Imagen desde Oracle");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.getContentPane().add(label);
                frame.pack();
                frame.setVisible(true);
            } else {
                System.out.println("No se encontró la imagen en la base de datos");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

//Método encargado de guardar la foto de un estudiante en oracle
//    public byte[] guardarFotoBaseOracle(EstudianteDTO estudiante) {
//        byte[] img = null;
//        InputStream imagen = new ByteArrayInputStream(estudiante.getImagen());
//
//        try {
//            String consulta = "update estudiante set imagen = ? where codigo = ?";
//            PreparedStatement statement = con.prepareStatement(consulta);
//            statement.setBinaryStream(1, imagen);
//            statement.setInt(2, estudiante.getCodigo());
//            statement.executeUpdate();
//            statement.close();
//            con.commit();
//            img = estudiante.getImagen();
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        return img;
//    }
//    public  void mostrarImagen(EstudianteDTO estudiante) {
//        try { 
//            // Crear la consulta SQL para seleccionar la imagen
//            String sql = "SELECT imagen FROM estudiante WHERE codigo = ?";
//            PreparedStatement pstmt = con.prepareStatement(sql);
//
//            // Establecer el nombre de la imagen que deseas leer y mostrar
//            int id = 1; // Cambia el nombre de la imagen que deseas leer y mostrar
//            pstmt.setInt(1, id);
//
//            // Ejecutar la consulta y obtener el resultado
//            ResultSet rs = pstmt.executeQuery();
//
//            // Verificar que se encontró la imagen y leerla
//            if (rs.next()) {
//                // Obtener el objeto BLOB
//                Blob blob = rs.getBlob("imagen");
//
//                // Obtener los bytes de la imagen
//                byte[] bytes = blob.getBytes(1, (int) blob.length());
//
//                // Cerrar el objeto BLOB
//                blob.free();
//                
//                // Crear un ImageIcon a partir de los bytes de la imagen
//                ImageIcon imageIcon = new ImageIcon(bytes);
//                
//                
//                // Mostrar la imagen en un JOptionPane
//                JOptionPane.showMessageDialog(null, new JLabel(imageIcon));
//
//            } else {
//                JOptionPane.showMessageDialog(null, "No se encontró la imagen");
//            }
//
//            rs.close();
//            pstmt.close();
//
//            System.out.println("Imagen mostrada");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "error" + e.getMessage());
//        }
//    }
}
