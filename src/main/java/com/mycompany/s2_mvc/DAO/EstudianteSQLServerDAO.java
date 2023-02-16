/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.DAO;

import com.mycompany.s2_mvc.Database.ConnectionSQLServerDB;
import com.mycompany.s2_mvc.DTO.EstudianteDTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author jhon,wilquer,cristianq
 */
public class EstudianteSQLServerDAO {

    private CallableStatement cs = null;

    private static ConnectionSQLServerDB con_ss = ConnectionSQLServerDB.getInstance();

    private static Connection con = con_ss.getConnection();

    private static EstudianteSQLServerDAO estudianteServiceSQLServer;

    private EstudianteSQLServerDAO() {
    }

    public static EstudianteSQLServerDAO getInstance() {
        if (estudianteServiceSQLServer == null) {
            estudianteServiceSQLServer = new EstudianteSQLServerDAO();
        }
        return estudianteServiceSQLServer;
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
            cs = con.prepareCall("{call Actualizacion_email_est()}");
            cs.execute();
            con.commit();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}
