/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.View;

import com.mycompany.s2_mvc.Controller.ElementoServiceOracle;
import com.mycompany.s2_mvc.Controller.EstudianteServiceOracle;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class View {

    public void app() throws SQLException {
        Scanner lectura = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 5) {

            System.out.println("Ingresa un número del 1 al 5:\n"
                    + "1: Promedio del estudiante (Funcion Oracle).\n"
                    + "2: Promedio precio elemento (Funcion Oracle).\n"
                    + "3: Promedio del estudiante (Funcion SQL Server).\n"
                    + "4: .\n"
                    + "5: Salir.\n");
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
            } else if (opcion == 3){
                EstudianteServiceOracle eo = new EstudianteServiceOracle();
                System.out.println("Ingresa El código del estudiante");
                int codigo = lectura.nextInt();
                double prom = eo.promedioEstudiante(codigo);
                System.out.println("El promedio del estudiante es: " + prom);
           }
        }
    }

    public static void main(String[] args) throws SQLException {
        View v = new View();
        v.app();
    }
}
