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

    private static EstudianteControllerOracle estudiante_oracle = EstudianteControllerOracle.getInstance();
    private static ElementoControllerOracle elemento_oracle = ElementoControllerOracle.getInstance();

    private static EstudianteControllerSQLServer estudiante_sqlserver = EstudianteControllerSQLServer.getInstance();
    private static ElementoControllerSQLServer elemento_sqlserver = ElementoControllerSQLServer.getInstance();

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
                System.out.println("Ingresa El código del estudiante");
                int codigo = lectura.nextInt();
                double prom = estudiante_oracle.promedioEstudiante(codigo);
                System.out.println("El promedio del estudiante es: " + prom + "\n");
            } else if (opcion == 2) {
                System.out.println("Ingresa el código del elemento");
                int codigo = lectura.nextInt();
                double prom = elemento_oracle.promedioPrecioElemento(codigo);
                System.out.println("El promedio del precio del elemento es: " + prom + "\n");
            } else if (opcion == 3) {
                System.out.println("Ingresa El código del estudiante");
                int codigo = lectura.nextInt();
                double prom = estudiante_sqlserver.promedioEstudiante(codigo);
                System.out.println("El promedio del estudiante es: " + prom + "\n");
            } else if (opcion == 4) {
                System.out.println("Ingresa el código del elemento");
                int codigo = lectura.nextInt();
                double prom = elemento_sqlserver.promedioPrecioElemento(codigo);
                System.out.println("El promedio del precio del elemento es: " + prom + "\n");
            } else if (opcion == 5) {
                estudiante_oracle.actualizarCorreo();
                System.out.println("Actualizacion realizada... \n");
            } else if (opcion == 6) {
                estudiante_sqlserver.actualizarCorreo();
                System.out.println("Actualizacion realizada... \n");
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        View v = new View();
        v.app();
    }
}
