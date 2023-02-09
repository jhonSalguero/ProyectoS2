/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.modelo;

import com.mycompany.s2_mvc.DAO.EstudianteOracleDAO;
import com.mycompany.s2_mvc.DAO.EstudianteSQLServerDAO;
import com.mycompany.s2_mvc.DTO.EstudianteDTO;

/**
 *
 * @author david
 */
public class Estudiante {

    private EstudianteOracleDAO est_odao = EstudianteOracleDAO.getInstance();
    private EstudianteSQLServerDAO est_ssdao = EstudianteSQLServerDAO.getInstance();

    private int codigo;
    private String nombres;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String programa;

    public double calcular_promedio_Oracle(int codigo) {
        try {
            return est_odao.promedioEstudiante(codigo);
        } catch (Exception e) {
            return 0;
        }
    }

    public EstudianteDTO calcular_promedio_OracleDTO(int codigo) {
        EstudianteDTO est = new EstudianteDTO();
        try {
            est = est_odao.promedioEstudianteDTO(codigo);
            return est;
        } catch (Exception e) {
            return est;
        }
    }

    public boolean actualizar_correo_Oracle() {
        if (est_odao.actualizarCorreo()) {
            return true;
        } else {
            return false;
        }
    }

    public double calcular_promedio_SQLServer(int codigo) {
        try {
            return est_ssdao.promedioEstudiante(codigo);
        } catch (Exception e) {
            return 0;
        }
    }

    public EstudianteDTO calcular_promedio_SQLServerDTO(int codigo) {
        EstudianteDTO est = new EstudianteDTO();
        try {
            est = est_ssdao.promedioEstudianteDTO(codigo);
            return est;
        } catch (Exception e) {
            return est;
        }
    }

    public boolean actualizar_correo_SQLServer() {
        if (est_ssdao.actualizarCorreo()) {
            return true;
        } else {
            return false;
        }
    }
}