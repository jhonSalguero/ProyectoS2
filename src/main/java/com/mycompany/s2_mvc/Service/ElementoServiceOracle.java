/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.Service;

import com.mycompany.s2_mvc.Database.ConnectionOracleDB;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author david
 */
public class ElementoServiceOracle {

    private static ConnectionOracleDB oracle_con = ConnectionOracleDB.getInstance();
    private static Connection con = oracle_con.getConnection();

    private Statement st = null;
    private ResultSet rs = null;
    private CallableStatement cs = null;

    private static ElementoServiceOracle elementoServiceOracle;

    private ElementoServiceOracle() {
    }

    public static ElementoServiceOracle getInstance() {
        if (elementoServiceOracle == null) {
            elementoServiceOracle = new ElementoServiceOracle();
        }
        return elementoServiceOracle;
    }

    public float promedioPrecioElemento(int codigo) throws SQLException {
        st = con.createStatement();
        cs = con.prepareCall("{? = call promedio_elemento(?)}");
        cs.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMERIC);
        cs.setInt(2, codigo);
        cs.execute();
        float resultado = cs.getFloat(1);
        return resultado;
    }
}
