/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.Controller;

import com.mycompany.s2_mvc.Database.ConnectionSQLServerDB;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author david
 */
public class ElementoServiceSQLServer {

    private ConnectionSQLServerDB con;

    private Statement st = null;
    private ResultSet rs = null;
    private CallableStatement cs = null;

    public ElementoServiceSQLServer() {
        con = new ConnectionSQLServerDB();
    }
}
