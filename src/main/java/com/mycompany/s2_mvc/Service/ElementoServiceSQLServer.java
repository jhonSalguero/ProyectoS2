/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.Service;

import com.mycompany.s2_mvc.Database.ConnectionSQLServerDB;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author david
 */
public class ElementoServiceSQLServer {

    private static ConnectionSQLServerDB con_ss = ConnectionSQLServerDB.getInstance();
    private static Connection con = con_ss.getConnection();

    private Statement st = null;
    private ResultSet rs = null;
    private CallableStatement cs = null;

    private static ElementoServiceSQLServer elementoServiceSQLServer;

    private ElementoServiceSQLServer() {
    }

    public static ElementoServiceSQLServer getInstance() {
        if (elementoServiceSQLServer == null) {
            elementoServiceSQLServer = new ElementoServiceSQLServer();
        }
        return elementoServiceSQLServer;
    }

    public float promedioPrecioElemento(int codigo) throws SQLException {

        st = con.createStatement();
        cs = con.prepareCall("{? = call precio_promedio(?)}");
        cs.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMERIC);
        cs.setInt(2, codigo);
        cs.execute();
        float resultado = cs.getFloat(1);
        return resultado;
    }
}
