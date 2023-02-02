/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.Controller;

import com.mycompany.s2_mvc.Service.ElementoServiceSQLServer;
import java.sql.SQLException;

public class ElementoControllerSQLServer {

    private static ElementoServiceSQLServer ele_ss = ElementoServiceSQLServer.getInstance();

    private static ElementoControllerSQLServer elementoControllerSQLServer;

    private ElementoControllerSQLServer() {
    }

    public static ElementoControllerSQLServer getInstance() {
        if (elementoControllerSQLServer == null) {
            elementoControllerSQLServer = new ElementoControllerSQLServer();
        }
        return elementoControllerSQLServer;
    }

    public float promedioPrecioElemento(int codigo) throws SQLException {
        return ele_ss.promedioPrecioElemento(codigo);
    }
}
