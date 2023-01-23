/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.View;

import com.mycompany.s2_mvc.Controller.*;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author JHON
 */
public class View {

    public void app() throws SQLException {
        Scanner lectura = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 7) {

            System.out.println("Ingresa un número del 1 al 5:\n"
                    + "1: Promedio del estudiante (Funcion Oracle).\n"
                    + "2: Promedio precio elemento (Funcion Oracle).\n"
                    + "3: Promedio del estudiante (Funcion SQL Server).\n"
                    + "4: Promedio precio elemento (Funcion SQL Server).\n"
                    + "5: Actualizar Correo (Procedimiento Oracle).\n"
                    + "6: Actualizar Correo (Procedimieto SQL Server).\n"
                    + "7: Salir.\n");
            opcion = lectura.nextInt();

            if (opcion == 1) {
                EstudianteServiceOracle eo = new EstudianteServiceOracle();
                System.out.println("Ingresa El código del estudiante");
                int codigo = lectura.nextInt();
                double prom = eo.promedioEstudiante(codigo);
                System.out.println("El promedio del estudiante es: " + prom);
            } else if (opcion == 2) {
                ElementoServiceOracle elem = new ElementoServiceOracle();
                System.out.println("Ingresa el código del elemento");
                int codigo = lectura.nextInt();
                double prom = elem.promedioPrecioElemento(codigo);
                System.out.println("El promedio del precio del elemento es: " + prom);
            } else if (opcion == 3) {
                EstudianteServiceSQLServer eo = new EstudianteServiceSQLServer();
                System.out.println("Ingresa El código del estudiante");
                int codigo = lectura.nextInt();
                double prom = eo.promedioEstudiante(codigo);
                System.out.println("El promedio del estudiante es: " + prom);
            } else if (opcion == 4) {
                ElementoServiceSQLServer elem = new ElementoServiceSQLServer();
                System.out.println("Ingresa el código del elemento");
                int codigo = lectura.nextInt();
                double prom = elem.promedioPrecioElemento(codigo);
                System.out.println("El promedio del precio del elemento es: " + prom);
            } else if (opcion == 5) {
                EstudianteServiceOracle elem = new EstudianteServiceOracle();
                elem.actualizarCorreo();
                System.out.println("Actualizacion realizada... ");
            } else if (opcion == 6) {
                EstudianteServiceSQLServer elem = new EstudianteServiceSQLServer();
                elem.actualizarCorreo();
                System.out.println("Actualizacion realizada... ");
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        View v = new View();
        v.app();
    }
}
