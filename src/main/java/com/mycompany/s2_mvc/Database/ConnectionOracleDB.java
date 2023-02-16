/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.Database;

/**
 *
 * @author jhon,wilquer,cristianq
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionOracleDB {

    private static Connection conn;

    private static ConnectionOracleDB o_con;

    private ConnectionOracleDB() {

    }

    public static ConnectionOracleDB getInstance() {
        if (o_con == null) {
            o_con = new ConnectionOracleDB();
        }
        return o_con;
    }

    public static Connection getConnection() {
        try {
            if (conn == null) {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "software2", "software2");
                conn.setAutoCommit(false);
                System.out.println("Conexion Exitosa!");
                System.out.println(conn);
            } else {
                System.out.println(conn);
                return o_con.conn;
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexon Erronea " + e.getMessage());
        }
        return conn;
    }

    public void desconexion() {
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("Error al desconectar " + e.getMessage());
        }
    }
}
