/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.Controller;

import com.mycompany.s2_mvc.Service.EstudianteServiceOracle;
import java.sql.SQLException;

/**
 *
 * @author JHON
 */
public class EstudianteControllerOracle {

    private static EstudianteServiceOracle eso = EstudianteServiceOracle.getInstance();

    private static EstudianteControllerOracle estudianteControllerOracle;

    private EstudianteControllerOracle() {
    }

    public static EstudianteControllerOracle getInstance() {
        if (estudianteControllerOracle == null) {
            estudianteControllerOracle = new EstudianteControllerOracle();
        }
        return estudianteControllerOracle;
    }

    public double promedioEstudiante(int codigo) throws SQLException {
        return eso.promedioEstudiante(codigo);
    }

    public boolean actualizarCorreo() {
        return eso.actualizarCorreo();
    }
}