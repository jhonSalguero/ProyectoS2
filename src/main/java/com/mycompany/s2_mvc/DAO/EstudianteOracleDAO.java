/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.DAO;

import com.mycompany.s2_mvc.Database.ConnectionOracleDB;
import com.mycompany.s2_mvc.DTO.EstudianteDTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author david
 */
public class EstudianteOracleDAO {

    private static ConnectionOracleDB o_con = ConnectionOracleDB.getInstance();
    private static Connection con = o_con.getConnection();

    private CallableStatement cs = null;

    private static EstudianteOracleDAO estudianteServiceOracle;

    private EstudianteOracleDAO() {
    }

    public static EstudianteOracleDAO getInstance() {
        if (estudianteServiceOracle == null) {
            estudianteServiceOracle = new EstudianteOracleDAO();
        }
        return estudianteServiceOracle;
    }

    public double promedioEstudiante(int codigo) throws SQLException {
        con.createStatement();
        cs = con.prepareCall("{? = call promedio_estudiante(?)}");
        cs.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMERIC);
        cs.setInt(2, codigo);
        cs.execute();
        float resultado = cs.getFloat(1);
        return resultado;
    }

    public EstudianteDTO promedioEstudianteDTO(int codigo) throws SQLException {
        con.createStatement();
        cs = con.prepareCall("{? = call promedio_estudiante(?)}");
        cs.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMERIC);
        cs.setInt(2, codigo);
        cs.execute();
        float resultado = cs.getFloat(1);
        EstudianteDTO est = new EstudianteDTO();
        est.setPromedio(resultado);
        return est;
    }

    public boolean actualizarCorreo() {
        try {
            con.createStatement();
            cs = con.prepareCall("{call actualizar_email()}");
            cs.execute();
            con.commit();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}
