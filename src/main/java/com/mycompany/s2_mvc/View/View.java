/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.View;

import com.mycompany.s2_mvc.Controller.*;
import com.mycompany.s2_mvc.DTO.EstudianteDTO;
import java.io.File;

import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author jhon,wilquer,cristianq
 */
public class View {

    EstudianteController est = EstudianteController.getInstance();
    ElementoController elem = ElementoController.getInstance();

    public void app() throws SQLException {
        Scanner lectura = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 10) {

            System.out.println("Ingresa un número del 1 al 5:\n"
                    + "1: Promedio del estudiante (Funcion Oracle).\n"
                    + "2: Promedio precio elemento (Funcion Oracle).\n"
                    + "3: Promedio del estudiante (Funcion SQL Server).\n"
                    + "4: Promedio precio elemento (Funcion SQL Server).\n"
                    + "5: Actualizar Correo (Procedimiento Oracle).\n"
                    + "6: Actualizar Correo (Procedimieto SQL Server).\n"
                    + "7: Consultar Estudiante.\n"
                    + "8: Carga o Cambiar foto del estudiante.\n"
                    + "9: Mostrar foto del estudiante.\n"
                    + "10: Salir.\n");
            opcion = lectura.nextInt();

            if (opcion == 1) {
                System.out.println("Ingresa El código del estudiante");
                int codigo = lectura.nextInt();
                double prom = est.promedioEstudiante_Oracle(codigo);
                System.out.println("El promedio del estudiante es: " + prom + "\n");
            } else if (opcion == 2) {
                System.out.println("Ingresa el código del elemento");
                int codigo = lectura.nextInt();
                double prom = elem.promedioPrecioElementoOracle(codigo);
                System.out.println("El promedio del precio del elemento es: " + prom + "\n");
            } else if (opcion == 3) {
                System.out.println("Ingresa El código del estudiante");
                int codigo = lectura.nextInt();
                double prom = est.promedioEstudiante_SQLServer(codigo);
                System.out.println("El promedio del estudiante es: " + prom + "\n");
            } else if (opcion == 4) {
                System.out.println("Ingresa el código del elemento");
                int codigo = lectura.nextInt();
                double prom = elem.promedioPrecioElementoSQLServer(codigo);
                System.out.println("El promedio del precio del elemento es: " + prom + "\n");
            } else if (opcion == 5) {
                est.actualizarCorreo_Oracle();
                System.out.println("Actualizacion realizada... \n");
            } else if (opcion == 6) {
                est.actualizarCorreo_SQLServer();
                System.out.println("Actualizacion realizada... \n");
            } else if (opcion == 7) {
                System.out.println("Ingresa el código del estudiante");
                int codigo = lectura.nextInt();
                EstudianteDTO estdto = est.buscarEstudiante_Oracle(codigo);
                System.out.println("Codigo: " + estdto.getCodigo());
                System.out.println("Nombres: " + estdto.getNombres());
                System.out.println("Apellido1: " + estdto.getApellido1());
                System.out.println("Apellido2: " + estdto.getApellido2());
                System.out.println("Telefono: " + estdto.getTelefono());
                System.out.println("Programa: " + estdto.getPrograma());
                System.out.println("Imagen: " + estdto.getImagen());

            } else if (opcion == 8) {
                System.out.println("Ingresa el código del estudiante");
                int codigo = lectura.nextInt();
                EstudianteDTO estdto = est.buscarEstudiante_Oracle(codigo);
                est.guardarFotoOracle(estdto);

            } else if (opcion == 9) {
                System.out.println("Ingresa el código del estudiante");
                int codigo = lectura.nextInt();
                EstudianteDTO estdto = est.buscarEstudiante_Oracle(codigo);
                est.mostrarImagenOracle(estdto);
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        View v = new View();
        v.app();
    }
}
