import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;



public class Main1 {
    
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // Conexión a la base de datos Oracle
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "software2", "software2");

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
                pstmt = conn.prepareStatement(sql);
                pstmt.setInt(2, 1); // Cambiar el valor de id por el de la imagen que se está guardando
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
        } catch (ClassNotFoundException | SQLException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // Cerrar la conexión y liberar los recursos
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


































//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class Main1 {
//    public static void main(String[] args) {
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//
//        try {
//            // Conexión a la base de datos Oracle
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "software2", "software2");
//
//            // Preparar la consulta para insertar la imagen en la base de datos
//            //String consulta = "update estudiante set imagen = ? where codigo = ?";
//            //String sql = "INSERT INTO imagenes (id, nombre, imagen) VALUES (?, ?, ?)";
//            
//            String sql = "update estudiante set imagen = ? where codigo = ?";
//            pstmt = conn.prepareStatement(sql);
//            pstmt.setInt(2, 2); // Cambiar el valor de id por el de la imagen que se está guardando
//            //pstmt.setString(2, "imagen1.jpg"); // Cambiar el nombre de la imagen según corresponda
//
//            // Leer la imagen desde un archivo y crear un objeto FileInputStream
//            FileInputStream inputStream = new FileInputStream("C:\\Users\\JHON_SALGUERO\\Downloads\\imagen1.jpg");
//
//            // Establecer el objeto FileInputStream como parámetro de la consulta
//            pstmt.setBinaryStream(1, inputStream, inputStream.available());
//
//            // Ejecutar la consulta para insertar la imagen en la base de datos
//            pstmt.executeUpdate();
//
//            System.out.println("La imagen se ha guardado correctamente en la base de datos.");
//        } catch (ClassNotFoundException | SQLException | FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                // Cerrar la conexión y liberar los recursos
//                if (pstmt != null) {
//                    pstmt.close();
//                }
//                if (conn != null) {
//                    conn.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
