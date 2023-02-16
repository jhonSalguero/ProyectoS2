/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.DAO;

import com.mycompany.s2_mvc.Database.ConnectionSQLServerDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
* Clase ElementoSQLServerDAO
* contiene patron singleton y metodos de promedioPrecioElemento
* @author Jhon.Salguero Wilquer.Pulido Cristian.Quintero / Unillanos
* @version 2.0, 2023/02/15
*/
public class ElementoSQLServerDAO {

    private static ConnectionSQLServerDB con_ss = ConnectionSQLServerDB.getInstance();
    private static Connection con = con_ss.getConnection();

    private CallableStatement cs = null;

    private static ElementoSQLServerDAO elementoServiceSQLServer;

    private ElementoSQLServerDAO() {
    }

    public static ElementoSQLServerDAO getInstance() {
        if (elementoServiceSQLServer == null) {
            elementoServiceSQLServer = new ElementoSQLServerDAO();
        }
        return elementoServiceSQLServer;
    }
    
    /**
     * Funcion promedioPrecioElemento
     * Se llama a la función promedioPrecioElemento contenida en la base de datos
     */
    public float promedioPrecioElemento(int codigo) throws SQLException {

        con.createStatement();
        cs = con.prepareCall("{? = call precio_promedio(?)}");
        cs.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMERIC);
        cs.setInt(2, codigo);
        cs.execute();
        float resultado = cs.getFloat(1);
        return resultado;
    }
}
