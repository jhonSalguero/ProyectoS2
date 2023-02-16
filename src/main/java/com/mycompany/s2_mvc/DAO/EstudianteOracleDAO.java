/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.DAO;

import com.mycompany.s2_mvc.Database.ConnectionOracleDB;
import com.mycompany.s2_mvc.DTO.EstudianteDTO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author wilquer,jhon,cristianq
 */

/**
* Frase corta descriptiva
* Descripción de la clase
* @author Nombre Apellido / Empresa
* @version 0.1, 2004/05/30
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

    
    /**
     * Frase corta descriptiva Descripción del método. Mención al
     * uso{@link es.loquesea.$app.util.Otra#unMetodo unMetodo}.
     *
     * @param param1 descripción del parámetro.
     * @return qué devuelve el método.
     * @exception tipo de excepción que lanza el método y en qué caso
     * @see paquete.Clase#metodo Código al que se hace referencia
     * @throws IllegalArgumentException el param1 no tiene el formato deseado
     */
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

    //Método encargado de buscar un estudiante en  la base de datos oracle
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
        PreparedStatement pstmt = null;

        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Seleccionar imagen");
            fileChooser.setFileFilter(new FileNameExtensionFilter("Imágenes", "jpg", "jpeg", "png", "gif"));
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();

                String sql = "update estudiante set imagen = ? where codigo = ?";
                pstmt = con.prepareStatement(sql);
                pstmt.setInt(2, estudiante.getCodigo());

                FileInputStream inputStream = new FileInputStream(selectedFile);

                pstmt.setBinaryStream(1, inputStream, inputStream.available());

                pstmt.executeUpdate();

                con.commit();

                System.out.println("La imagen se ha guardado correctamente en la base de datos.");

                File saveFile = new File("src/img/" + selectedFile.getName());
                Files.copy(selectedFile.toPath(), saveFile.toPath());
                System.out.println("Imagen guardada en la carpeta");
                JOptionPane.showMessageDialog(null, "Imagen guardada en Oracle");
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
    public void mostrarImagenOracle(EstudianteDTO estudiante) {
        //Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT imagen FROM estudiante WHERE codigo = ?";

            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, estudiante.getCodigo());

            rs = pstmt.executeQuery();
            if (rs.next()) {
                byte[] bytes = rs.getBytes("imagen");
                if (bytes != null) {
                    ImageIcon imageIcon = new ImageIcon(bytes);

                JLabel label = new JLabel(imageIcon);

                JFrame frame = new JFrame("Imagen desde Oracle");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.getContentPane().add(label);
                frame.pack();
                frame.setVisible(true);
                }else{
                JOptionPane.showMessageDialog(null, "No se encontró la imagen en la base de datos");
                }   
            } else {
                System.out.println("No se encontró la imagen en la base de datos");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
