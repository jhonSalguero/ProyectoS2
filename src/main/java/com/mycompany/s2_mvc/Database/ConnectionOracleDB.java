/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.Database;

/**
 *
 * @author david
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionOracleDB{

    ///Creamos un atributo de tipo 'Connection' y lo usamos en vez de retornarlo
    public Connection co_ODB;

    public ConnectionOracleDB() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            this.co_ODB = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "software2", "software2");
            this.co_ODB.setAutoCommit(false);
            System.out.println("Conexion exitosa");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Error en la conexión de la base de datos");
        }
    }
    public void desconectar() throws SQLException {
        this.co_ODB.close();
    }
}
