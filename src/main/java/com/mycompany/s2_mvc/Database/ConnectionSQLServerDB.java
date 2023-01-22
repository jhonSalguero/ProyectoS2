/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSQLServerDB {
 public Connection con_ss;
 
 public  ConnectionSQLServerDB() {
        String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                + "database=software2;"
                + "user=sa;"
                + "password=root;"
                + "encrypt=true;"
                + "trustServerCertificate=true;"
                + "loginTimeout=30;";
        try {
           con_ss = DriverManager.getConnection(conexionUrl);
            
            if (con_ss != null) {
                System.out.println("Conexion Exitosa!");
            } else {
                System.out.println("Error en la conexión de la base de datos");
            }         
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}