/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.modelo;

import com.mycompany.s2_mvc.DAO.ElementoOracleDAO;
import com.mycompany.s2_mvc.DAO.ElementoSQLServerDAO;

/**
 *
 * @author david
 */
public class Elementos {

    private ElementoOracleDAO elem_odao = ElementoOracleDAO.getInstance();
    private ElementoSQLServerDAO elem_ssdao = ElementoSQLServerDAO.getInstance();

    private int codigo;
    private String elemento;
    private String devolucion;
    private String talla;
    private String uso;
    private String materiales;
    private String usos;
    private String norma;
    private String atenuacion;
    private String serial;
    private String tallas;
    private String unidad;
    private String ruta;
    private String vida_util;
    private String precio_actual;
    private String cantidad_elementos;

    public double calcularPromedioElementoOracle(int codigo) {
        try {
            return elem_odao.promedioPrecioElemento(codigo);
        } catch (Exception e) {
            return 0;
        }
    }

    public double calcularPromedioElementoSQLServer(int codigo) {
        try {
            return elem_ssdao.promedioPrecioElemento(codigo);
        } catch (Exception e) {
            return 0;
        }
    }

}
