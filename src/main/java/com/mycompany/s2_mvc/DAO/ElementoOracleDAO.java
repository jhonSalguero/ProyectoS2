/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.DAO;

import com.mycompany.s2_mvc.Database.ConnectionOracleDB;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author jhon,wilquer,cristianq
 */


/**
* Clase elementoOracleDAO
* contiene los metodos para llamar la funcion precioElemento en Oracle y SQL Server y patron singleton
* @author Jhon.Salguero Wilquer.Pulido Cristian.Quintero / Unillanos
* @version 2.0, 2023/02/15
*/
public class ElementoOracleDAO {

    private static ConnectionOracleDB oracle_con = ConnectionOracleDB.getInstance();
    private static Connection con = oracle_con.getConnection();

    private CallableStatement cs = null;

    private static ElementoOracleDAO elementoServiceOracle;

    private ElementoOracleDAO() {
    }

    public static ElementoOracleDAO getInstance() {
        if (elementoServiceOracle == null) {
            elementoServiceOracle = new ElementoOracleDAO();
        }
        return elementoServiceOracle;
    }
    
    /**
     * metodo promedioPrecioElemento
     * metodo promedioPrecioElemento recibe el codigo de elemento para que la funcion en oracle calcule el precio promedio
     */
    public float promedioPrecioElemento(int codigo) throws SQLException {
        con.createStatement();
        cs = con.prepareCall("{? = call promedio_elemento(?)}");
        cs.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMERIC);
        cs.setInt(2, codigo);
        cs.execute();
        float resultado = cs.getFloat(1);
        return resultado;
    }
}
