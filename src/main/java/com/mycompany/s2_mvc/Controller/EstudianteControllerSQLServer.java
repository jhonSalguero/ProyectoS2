/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.Controller;

import com.mycompany.s2_mvc.Service.EstudianteServiceSQLServer;
import java.sql.SQLException;

/**
 *
 * @author david
 */
public class EstudianteControllerSQLServer {

    private static EstudianteServiceSQLServer ess = EstudianteServiceSQLServer.getInstance();

    private static EstudianteControllerSQLServer estudianteControllerSQLServer;

    private EstudianteControllerSQLServer() {
    }

    public static EstudianteControllerSQLServer getInstance() {
        if (estudianteControllerSQLServer == null) {
            estudianteControllerSQLServer = new EstudianteControllerSQLServer();
        }
        return estudianteControllerSQLServer;
    }

    public double promedioEstudiante(int codigo) throws SQLException {
        return ess.promedioEstudiante(codigo);
    }

    public boolean actualizarCorreo() throws SQLException {
        return ess.actualizarCorreo();
    }
}