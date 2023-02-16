/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
* Clase ConnectionSQLServerDB
* permite la conexion a la base de datos SQL Server
* @author Jhon.Salguero Wilquer.Pulido Cristian.Quintero / Unillanos
* @version 2.0, 2023/02/15
*/
public class ConnectionSQLServerDB {

    private static ConnectionSQLServerDB sqlServer_con;

    private static Connection con_ss;

    private ConnectionSQLServerDB() {
    }

    public static ConnectionSQLServerDB getInstance() {
        if (sqlServer_con == null) {
            sqlServer_con = new ConnectionSQLServerDB();
        }
        return sqlServer_con;
    }
    /**
     * metodo getConnection
     * este metodo permite la conexion a la base de datos validando las credenciales
     */
    public static Connection getConnection() {
        try {
            if (con_ss == null) {
                String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                        + "database=software2;"
                        + "user=sa;"
                        + "password=root;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
                        + "loginTimeout=30;";

                con_ss = DriverManager.getConnection(conexionUrl);

                System.out.println("Conexion Exitosa!");
                System.out.println(con_ss);
            } else {
                System.out.println(con_ss);
                return con_ss;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Conexon Erronea " + ex.getMessage());
        }
        return con_ss;
    }
}
