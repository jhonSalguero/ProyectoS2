/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.Controller;

import com.mycompany.s2_mvc.Service.ElementoServiceOracle;
import java.sql.SQLException;

/**
 *
 * @author david
 */
public class ElementoControllerOracle {

    private static ElementoServiceOracle ele_so = ElementoServiceOracle.getInstance();

    private static ElementoControllerOracle elementoControllerOracle;

    private ElementoControllerOracle() {
    }

    public static ElementoControllerOracle getInstance() {
        if (elementoControllerOracle == null) {
            elementoControllerOracle = new ElementoControllerOracle();
        }
        return elementoControllerOracle;
    }

    public float promedioPrecioElemento(int codigo) throws SQLException {
        return ele_so.promedioPrecioElemento(codigo);
    }
}