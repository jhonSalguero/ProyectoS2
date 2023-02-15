/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.View;

/**
 *
 * @author JHON_SALGUERO
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ImagenOracle {
    
    public static void main(String[] args) throws IOException {
       
        
       JFileChooser jf= new JFileChooser();
       jf.showOpenDialog(jf);
       File archivo=jf.getSelectedFile();
       System.out.println("Directorio: "+archivo);
       String filename= String.valueOf(archivo);
       System.out.println("Directorio2: "+filename);

              
        //String filename = "C:\\fotos\\imagen.jpg"; // Cambia la ruta de la imagen que deseas almacenar y ver
        
        try {
            // Crear la conexión a la base de datos
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "software2", "software2");
            
            // Insertar la imagen en la tabla
            insertarImagen(conn, filename);
            
            // Leer la imagen de la tabla y mostrarla
            mostrarImagen(conn);
            
            // Cerrar la conexión
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void insertarImagen(Connection conn, String filename) throws SQLException, IOException {
        // Crear la sentencia preparada para insertar la imagen
        //String sql = "INSERT INTO tabla_imagenes (id, imagen) VALUES (?, ?)";
        String sql = "update tabla_imagenes set imagen = ? where id = ?"; 
        
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        // Establecer el nombre de la imagen
        File file = new File(filename);
        pstmt.setInt(2, 1);
        
        // Leer los bytes de la imagen
        FileInputStream fis = new FileInputStream(file);
        pstmt.setBinaryStream(1, fis, (int) file.length());
        
        // Ejecutar la sentencia y cerrar el stream de entrada
        pstmt.executeUpdate();
        fis.close();
        
        System.out.println("Imagen insertada");
    }
    
    public static void mostrarImagen(Connection conn) throws SQLException {
        // Crear la consulta SQL para seleccionar la imagen
        String sql = "SELECT imagen FROM tabla_imagenes WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        // Establecer el nombre de la imagen que deseas leer y mostrar
        int id = 1; // Cambia el nombre de la imagen que deseas leer y mostrar
        pstmt.setInt(1, id);
        
        // Ejecutar la consulta y obtener el resultado
        ResultSet rs = pstmt.executeQuery();
        
        // Verificar que se encontró la imagen y leerla
        if (rs.next()) {
            // Obtener el objeto BLOB
            Blob blob = rs.getBlob("imagen");
            
            // Obtener los bytes de la imagen
            byte[] bytes = blob.getBytes(1, (int) blob.length());
            
            // Cerrar el objeto BLOB
            blob.free();
            
            // Crear un ImageIcon a partir de los bytes de la imagen
            ImageIcon imageIcon = new ImageIcon(bytes);
            
            // Mostrar la imagen en un JOptionPane
            JOptionPane.showMessageDialog(null, new JLabel(imageIcon));
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró la imagen");
        }
        
        rs.close();
        pstmt.close();
        
        System.out.println("Imagen mostrada");
    }
}

