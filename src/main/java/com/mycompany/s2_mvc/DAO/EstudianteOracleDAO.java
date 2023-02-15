/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2_mvc.DAO;

import com.mycompany.s2_mvc.Database.ConnectionOracleDB;
import com.mycompany.s2_mvc.DTO.EstudianteDTO;
import com.mycompany.s2_mvc.modelo.Estudiante;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;

/**
 *
 * @author david
 */
public class EstudianteOracleDAO {

    private static ConnectionOracleDB o_con = ConnectionOracleDB.getInstance();
    private static Connection con = o_con.getConnection();

    private CallableStatement cs = null;

    private static EstudianteOracleDAO estudianteServiceOracle;

    private EstudianteOracleDAO() {
    }

    public static EstudianteOracleDAO getInstance() {
        if (estudianteServiceOracle == null) {
            estudianteServiceOracle = new EstudianteOracleDAO();
        }
        return estudianteServiceOracle;
    }

    public double promedioEstudiante(int codigo) throws SQLException {
        con.createStatement();
        cs = con.prepareCall("{? = call promedio_estudiante(?)}");
        cs.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMERIC);
        cs.setInt(2, codigo);
        cs.execute();

        float resultado = cs.getFloat(1);
        return resultado;
    }

    public EstudianteDTO promedioEstudianteDTO(int codigo) throws SQLException {
        con.createStatement();
        cs = con.prepareCall("{? = call promedio_estudiante(?)}");
        cs.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMERIC);
        cs.setInt(2, codigo);
        cs.execute();

        float resultado = cs.getFloat(1);

        EstudianteDTO est = new EstudianteDTO();
        est.setPromedio(resultado);

        return est;
    }

    public boolean actualizarCorreo() {
        try {
            con.createStatement();
            cs = con.prepareCall("{call actualizar_email()}");
            cs.execute();
            con.commit();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    //Método encargado de buscar un estudiante en oracle
    public EstudianteDTO buscarIdEstudianteOracle(int idEstudiante) {
        EstudianteDTO estudiante = new EstudianteDTO();
        try {
            String consulta = "select * from estudiante where codigo = " + idEstudiante;
            PreparedStatement statement = con.prepareStatement(consulta);
            ResultSet resultado = statement.executeQuery();
            if (resultado.next()) {
                estudiante.setCodigo(resultado.getInt(1));
                estudiante.setNombres(resultado.getString(2));
                estudiante.setApellido1(resultado.getString(3));
                estudiante.setApellido2(resultado.getString(4));
                estudiante.setTelefono(resultado.getString(5));
                estudiante.setPrograma(resultado.getString(6));
                Blob img = resultado.getBlob(7);
                if (img != null) {
                    estudiante.setImagen(img.getBytes(1, (int) img.length()));
                } else {
                    estudiante.setImagen(null);
                }
            }
            resultado.close();
            statement.close();
        } catch (SQLException e) {
            e.getMessage();
        }
        return estudiante;
    }

    //Método encargado de guardar la foto de un estudiante en oracle
    public byte[] guardarFotoBaseOracle(EstudianteDTO estudiante) {
        byte[] img = null;
        InputStream imagen = new ByteArrayInputStream(estudiante.getImagen());

        try {
            String consulta = "update estudiante set imagen = ? where codigo = ?";
            PreparedStatement statement = con.prepareStatement(consulta);
            statement.setBinaryStream(1, imagen);
            statement.setInt(2, estudiante.getCodigo());
            statement.executeUpdate();
            statement.close();
            con.commit();
            img = estudiante.getImagen();
            System.out.println(con);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return img;
    }
}
