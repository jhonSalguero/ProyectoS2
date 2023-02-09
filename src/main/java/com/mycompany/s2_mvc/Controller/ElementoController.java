/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.Controller;

import com.mycompany.s2_mvc.modelo.Elementos;

/**
 *
 * @author david
 */
public class ElementoController {

    private Elementos elem;

    private static ElementoController elementoControllerOracle;

    private ElementoController() {
        elem = new Elementos();
    }

    public static ElementoController getInstance() {
        if (elementoControllerOracle == null) {
            elementoControllerOracle = new ElementoController();
        }
        return elementoControllerOracle;
    }

    public double promedioPrecioElementoOracle(int codigo) {
        return elem.calcularPromedioElementoOracle(codigo);
    }

    public double promedioPrecioElementoSQLServer(int codigo) {
        return elem.calcularPromedioElementoSQLServer(codigo);
    }
}
