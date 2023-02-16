/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.Controller;

import com.mycompany.s2_mvc.DTO.EstudianteDTO;
import com.mycompany.s2_mvc.modelo.Estudiante;

/**
 *
 * @author JHON
 */
public class EstudianteController {

    private Estudiante est;

    private static EstudianteController estudianteControllerOracle;

    private EstudianteController() {
        est = new Estudiante();
    }

    public static EstudianteController getInstance() {
        if (estudianteControllerOracle == null) {
            estudianteControllerOracle = new EstudianteController();
        }
        return estudianteControllerOracle;
    }

    //Funcion promedio estudiante Oracle
    public double promedioEstudiante_Oracle(int codigo) {
        return est.calcular_promedio_Oracle(codigo);
    }

    //Procedimiento actualizar correo Oracle
    public boolean actualizarCorreo_Oracle() {
        return est.actualizar_correo_Oracle();
    }

    //Funcion promedio estudiante SQLServer
    public double promedioEstudiante_SQLServer(int codigo) {
        return est.calcular_promedio_SQLServer(codigo);

    }

    //Procedimiento actualizar correo SQLServer
    public boolean actualizarCorreo_SQLServer() {
        return est.actualizar_correo_SQLServer();
    }

    //DTOs
    public EstudianteDTO promedioEstudiante_OracleDTO(int codigo) {
        return est.calcular_promedio_OracleDTO(codigo);
    }

    public EstudianteDTO promedioEstudiante_SQLServerDTO(int codigo) {
        return est.calcular_promedio_SQLServerDTO(codigo);
    }

    public EstudianteDTO buscarEstudiante_Oracle(int codigo) {
        return est.buscarEstudiante(codigo);
    }

    public void guardarFotoOracle(EstudianteDTO estudiante) {
        est.guardarImagenOracle(estudiante);
    }

    public void mostrarImagenOracle(EstudianteDTO estudiante) {
        est.mostrarImagenOracle(estudiante);

    }
}
