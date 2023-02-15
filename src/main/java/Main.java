import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Conexión a la base de datos Oracle
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "software2", "software2");

            // Consulta para obtener la imagen de la base de datos
            String sql = "SELECT imagen FROM estudiante WHERE codigo = ?";

            // Preparar la consulta
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, 1); // Cambiar el valor de id por el de la imagen que se desea mostrar

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
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(label);
                frame.pack();
                frame.setVisible(true);
            } else {
                System.out.println("No se encontró la imagen en la base de datos");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Cerrar la conexión y liberar los recursos
                if (rs != null) {
                    rs.close();
                }
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
