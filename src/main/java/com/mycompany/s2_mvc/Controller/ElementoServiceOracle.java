/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.Controller;

import com.mycompany.s2_mvc.Database.ConnectionOracleDB;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author david
 */
public class ElementoServiceOracle {

    private Statement st = null;
    private ResultSet rs = null;
    private CallableStatement cs = null;


    public float promedioPrecioElemento(int codigo) throws SQLException {
        st = ConnectionOracleDB.getConnection().createStatement();
        cs = ConnectionOracleDB.getConnection().prepareCall("{? = call promedio_elemento(?)}");
        cs.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMERIC);
        cs.setInt(2, codigo);
        cs.execute();
        float resultado = cs.getFloat(1);
        return resultado;
    }
}
