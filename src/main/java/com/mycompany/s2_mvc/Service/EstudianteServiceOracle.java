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
public class EstudianteServiceOracle {

    private static ConnectionOracleDB o_con = ConnectionOracleDB.getInstance();
    private static Connection con = o_con.getConnection();

    private Statement st = null;
    private ResultSet rs = null;
    private CallableStatement cs = null;

    private static EstudianteServiceOracle estudianteServiceOracle;

    private EstudianteServiceOracle() {
    }

    public static EstudianteServiceOracle getInstance() {
        if (estudianteServiceOracle == null) {
            estudianteServiceOracle = new EstudianteServiceOracle();
        }
        return estudianteServiceOracle;
    }

    public double promedioEstudiante(int codigo) throws SQLException {
        st = con.createStatement();
        cs = con.prepareCall("{? = call promedio_estudiante(?)}");
        cs.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMERIC);
        cs.setInt(2, codigo);
        cs.execute();
        float resultado = cs.getFloat(1);
        return resultado;
    }

    public boolean actualizarCorreo() {
        try {
            st = con.createStatement();
            cs = con.prepareCall("{call actualizar_email()}");
            cs.execute();
            ConnectionOracleDB.getConnection().commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
