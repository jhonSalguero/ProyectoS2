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

/**
* Clase controtrolador para el elemento
* contiene patron singleton y metodos del controlador
* @author Jhon.Salguero Wilquer.Pulido Cristian.Quintero / Unillanos
* @version 2.0, 2023/02/15
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
    
     /**
     * metodo promedioPrecioElementoOracle
     * llama al metodo calcularPromedioElementoOracle que se encuentra en la clase elemento (Objeto puto)
     */
    public double promedioPrecioElementoOracle(int codigo) {
        return elem.calcularPromedioElementoOracle(codigo);
    }
    
    /**
     * metodo promedioPrecioElementoSQLServer
     * llama al metodo promedioPrecioElementoSQLServer que se encuentra en la clase elemento (Objeto puto)
     */
    public double promedioPrecioElementoSQLServer(int codigo) {
        return elem.calcularPromedioElementoSQLServer(codigo);
    }
}
