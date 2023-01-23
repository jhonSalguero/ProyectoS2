/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.Controller;

import com.mycompany.s2_mvc.Database.ConnectionOracleDB;
import com.mycompany.s2_mvc.Database.ConnectionSQLServerDB;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author david
 */
public class EstudianteServiceSQLServer {

    private ConnectionSQLServerDB con;

    private Statement st = null;
    private ResultSet rs = null;
    private CallableStatement cs = null;

    public EstudianteServiceSQLServer() {
        con = new ConnectionSQLServerDB();
    }

    public double promedioEstudiante(int codigo) throws SQLException {
        st = con.con_ss.createStatement();
        cs = con.con_ss.prepareCall("{? = call promedio_estudiante(?)}");
        cs.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMERIC);
        cs.setInt(2, codigo);
        cs.execute();
        float resultado = cs.getFloat(1);
        return resultado;
    }
    
    public void actualizarCorreo() throws SQLException {
        st = con.con_ss.createStatement();
        cs = con.con_ss.prepareCall("{call Actualizacion_email_est()}");
        cs.execute();
        con.con_ss.commit();
    }
}
