/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.s2_mvc.View;

import com.mycompany.s2_mvc.Controller.ElementoController;
import com.mycompany.s2_mvc.Controller.EstudianteController;
import com.mycompany.s2_mvc.DTO.EstudianteDTO;
import java.awt.event.KeyEvent;

/**
 *
 * @author JHON_SALGUERO
 */

/**
* Clase InterfazGrafica
* contiene la logica de la interfaz grafica labels,botones y cajas de entrada texto
* @author Jhon.Salguero Wilquer.Pulido Cristian.Quintero / Unillanos
* @version 2.0, 2023/02/15
*/
public class InterfazGrafica extends javax.swing.JFrame {

    private static EstudianteController estudiante = EstudianteController.getInstance();
    private static ElementoController elemento = ElementoController.getInstance();

    /**
     * Creates new form InterfazGrafica
     */
    public InterfazGrafica() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    /**
     * metodos de la funcionalidad interfaz grafica
     * recibe el codigo por estudiante y llama los metodos por cada funcion de la interfaz grafica
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        PEstudianteOracle = new javax.swing.JLabel();
        PEstudianteSQLServer = new javax.swing.JLabel();
        promedioO = new javax.swing.JTextField();
        promedioS = new javax.swing.JTextField();
        PElementoOracle = new javax.swing.JLabel();
        precioO = new javax.swing.JTextField();
        PElementoSQLServer = new javax.swing.JLabel();
        precioS = new javax.swing.JTextField();
        Separacion = new javax.swing.JSeparator();
        CorreoOracle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        CorreoSQLServer = new javax.swing.JLabel();
        actualizarO = new javax.swing.JButton();
        actualizarS = new javax.swing.JButton();
        consultar1 = new javax.swing.JButton();
        consultar2 = new javax.swing.JButton();
        consultar3 = new javax.swing.JButton();
        consultar4 = new javax.swing.JButton();
        rta1 = new javax.swing.JLabel();
        rta2 = new javax.swing.JLabel();
        rta3 = new javax.swing.JLabel();
        rta4 = new javax.swing.JLabel();
        rta5 = new javax.swing.JLabel();
        rta6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dto1 = new javax.swing.JTextField();
        dto2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        consultar5 = new javax.swing.JButton();
        consultar6 = new javax.swing.JButton();
        rta7 = new javax.swing.JLabel();
        rta8 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        titulo = new javax.swing.JLabel();
        consultar7 = new javax.swing.JButton();
        rta9 = new javax.swing.JLabel();
        consultar8 = new javax.swing.JButton();
        imgC = new javax.swing.JTextField();
        consultar9 = new javax.swing.JButton();
        imgM = new javax.swing.JTextField();
        imgE = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setText("Oracle / SQL Server");

        PEstudianteOracle.setText("Promedio del estudiante (Funcion Oracle)");

        PEstudianteSQLServer.setText("Promedio del estudiante (Funcion SQL Server)");

        promedioO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                promedioOKeyReleased(evt);
            }
        });

        promedioS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                promedioSKeyReleased(evt);
            }
        });

        PElementoOracle.setText("Promedio precio elemento (Funcion Oracle)");

        precioO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                precioOKeyReleased(evt);
            }
        });

        PElementoSQLServer.setText("Promedio precio elemento (Funcion SQL Server)");

        precioS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                precioSKeyReleased(evt);
            }
        });

        CorreoOracle.setText("Actualizar Correo (Procedimiento Oracle)");

        CorreoSQLServer.setText("Actualizar Correo (Procedimieto SQL Server)");

        actualizarO.setText("Actualizar");
        actualizarO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarOActionPerformed(evt);
            }
        });

        actualizarS.setText("Actualizar");
        actualizarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarSActionPerformed(evt);
            }
        });

        consultar1.setText("Consultar");
        consultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar1ActionPerformed(evt);
            }
        });

        consultar2.setText("Consultar");
        consultar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar2ActionPerformed(evt);
            }
        });

        consultar3.setText("Consultar");
        consultar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar3ActionPerformed(evt);
            }
        });

        consultar4.setText("Consultar");
        consultar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar4ActionPerformed(evt);
            }
        });

        jLabel1.setText(" ID:");

        jLabel2.setText("ID:");

        jLabel3.setText("ID:");

        jLabel4.setText("ID:");

        jLabel5.setText("Promedio del estudiante DTO (Funcion Oracle)");

        jLabel6.setText("Promedio del estudiante DTO (Funcion SQL Server)");

        dto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dto1KeyReleased(evt);
            }
        });

        dto2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dto2KeyReleased(evt);
            }
        });

        jLabel7.setText("ID:");

        consultar5.setText("Consultar");
        consultar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar5ActionPerformed(evt);
            }
        });

        consultar6.setText("Consultar");
        consultar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar6ActionPerformed(evt);
            }
        });

        jLabel8.setText("ID:");

        titulo.setText("IMAGEN");

        consultar7.setText("Consultar Estudiante");
        consultar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar7ActionPerformed(evt);
            }
        });

        consultar8.setText("Carga o Cambiar foto del estudiante");
        consultar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar8ActionPerformed(evt);
            }
        });

        consultar9.setText("Mostrar foto del estudiante");
        consultar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar9ActionPerformed(evt);
            }
        });

        jLabel9.setText("ID:");

        jLabel10.setText("ID:");

        jLabel11.setText("ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Separacion)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(117, 117, 117)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dto2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dto1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(consultar6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rta8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(consultar5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rta7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rta9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(consultar7)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(imgE, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(consultar8)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(imgC, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(imgM, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(consultar9)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(PEstudianteOracle)
                                            .addComponent(PEstudianteSQLServer)
                                            .addComponent(PElementoOracle)
                                            .addComponent(PElementoSQLServer)
                                            .addComponent(CorreoOracle)
                                            .addComponent(CorreoSQLServer))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(9, 9, 9)
                                                        .addComponent(jLabel3))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel1)
                                                            .addComponent(jLabel2)))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel4)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(precioO)
                                                    .addComponent(promedioS, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                                    .addComponent(precioS))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(consultar4)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(rta4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(consultar3)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(rta3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(consultar2)
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(rta1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(rta2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(actualizarS)
                                                    .addComponent(actualizarO))
                                                .addGap(14, 14, 14)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(rta6, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                                    .addComponent(rta5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Titulo)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(19, 19, 19)
                                                        .addComponent(promedioO, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(consultar1))))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(279, 279, 279)
                                        .addComponent(titulo)))
                                .addGap(0, 119, Short.MAX_VALUE)))
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Titulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PEstudianteOracle)
                    .addComponent(promedioO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultar1)
                    .addComponent(rta1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PEstudianteSQLServer)
                    .addComponent(promedioS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultar2)
                    .addComponent(rta2)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separacion, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PElementoOracle)
                    .addComponent(precioO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultar3)
                    .addComponent(rta3)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PElementoSQLServer)
                    .addComponent(consultar4)
                    .addComponent(rta4)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CorreoOracle)
                    .addComponent(actualizarO)
                    .addComponent(rta5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CorreoSQLServer)
                    .addComponent(actualizarS)
                    .addComponent(rta6))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(consultar6)
                        .addComponent(rta8)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(consultar5)
                            .addComponent(rta7))
                        .addGap(28, 28, 28)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultar7)
                    .addComponent(consultar8)
                    .addComponent(consultar9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imgE, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(rta9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void consultar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar6ActionPerformed
        try {
            int codigo = Integer.parseInt(dto2.getText());
            EstudianteDTO est = estudiante.promedioEstudiante_SQLServerDTO(codigo);
            rta8.setText(String.valueOf(est.getPromedio()));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_consultar6ActionPerformed

    private void consultar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar5ActionPerformed
        try {
            int codigo = Integer.parseInt(dto1.getText());
            EstudianteDTO est = estudiante.promedioEstudiante_OracleDTO(codigo);
            rta7.setText(String.valueOf(est.getPromedio()));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_consultar5ActionPerformed

    private void consultar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar4ActionPerformed
        try {
            int codigo = Integer.parseInt(precioS.getText());
            String rta = String.valueOf(elemento.promedioPrecioElementoSQLServer(codigo));
            rta4.setText(rta);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_consultar4ActionPerformed

    private void consultar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar3ActionPerformed
        try {
            int codigo = Integer.parseInt(precioO.getText());
            String rta = String.valueOf(elemento.promedioPrecioElementoOracle(codigo));
            rta3.setText(rta);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_consultar3ActionPerformed

    private void consultar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar2ActionPerformed
        try {
            int codigo = Integer.parseInt(promedioS.getText());
            String rta = String.valueOf(estudiante.promedioEstudiante_SQLServer(codigo));
            rta2.setText(rta);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_consultar2ActionPerformed

    private void consultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar1ActionPerformed
        try {
            int codigo = Integer.parseInt(promedioO.getText());
            String rta = String.valueOf(estudiante.promedioEstudiante_Oracle(codigo));
            rta1.setText(rta);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_consultar1ActionPerformed

    private void actualizarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarSActionPerformed
        try {
            if (estudiante.actualizarCorreo_SQLServer()) {
                rta6.setText("Actualizacion realizada...");
            } else {
                rta5.setText("Error al actualizar ;(");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_actualizarSActionPerformed

    private void actualizarOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarOActionPerformed
        try {
            if (estudiante.actualizarCorreo_Oracle()) {
                rta5.setText("Actualizacion realizada...");
            } else {
                rta5.setText("Error al actualizar ;(");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_actualizarOActionPerformed

    private void precioSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioSKeyReleased
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                int codigo = Integer.parseInt(precioS.getText());
                String rta = String.valueOf(elemento.promedioPrecioElementoSQLServer(codigo));
                rta4.setText(rta);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_precioSKeyReleased

    private void precioOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioOKeyReleased
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                int codigo = Integer.parseInt(precioO.getText());
                String rta = String.valueOf(elemento.promedioPrecioElementoOracle(codigo));
                rta3.setText(rta);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_precioOKeyReleased

    private void promedioSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_promedioSKeyReleased
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                int codigo = Integer.parseInt(promedioS.getText());
                String rta = String.valueOf(estudiante.promedioEstudiante_SQLServer(codigo));
                rta2.setText(rta);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_promedioSKeyReleased

    private void promedioOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_promedioOKeyReleased
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                int codigo = Integer.parseInt(promedioO.getText());
                String rta = String.valueOf(estudiante.promedioEstudiante_Oracle(codigo));
                rta1.setText(rta);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_promedioOKeyReleased

    private void dto1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dto1KeyReleased
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                int codigo = Integer.parseInt(dto1.getText());
                EstudianteDTO est = estudiante.promedioEstudiante_OracleDTO(codigo);
                rta7.setText(String.valueOf(est.getPromedio()));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_dto1KeyReleased

    private void dto2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dto2KeyReleased
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                int codigo = Integer.parseInt(dto2.getText());
                EstudianteDTO est = estudiante.promedioEstudiante_SQLServerDTO(codigo);
                rta8.setText(String.valueOf(est.getPromedio()));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_dto2KeyReleased

    private void consultar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar7ActionPerformed
        try {
            int codigo = Integer.parseInt(imgE.getText());
            EstudianteDTO rta = estudiante.buscarEstudiante_Oracle(codigo);
            
            String datos = "Codigo: " + rta.getCodigo()
               +"  Nombres:" + rta.getNombres()
               +" Apellido1: " + rta.getApellido1()
               +" Apellido2: " + rta.getApellido2()
               +" Telefono: " + rta.getTelefono()
               +" Programa: " + rta.getPrograma()
               +" Imagen: " + rta.getImagen();
            
            rta9.setText(datos);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_consultar7ActionPerformed

    private void consultar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar8ActionPerformed
        try {
            int codigo = Integer.parseInt(imgC.getText());
            EstudianteDTO rta = estudiante.buscarEstudiante_Oracle(codigo);
            estudiante.guardarFotoOracle(rta);
            imgC.setText("");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_consultar8ActionPerformed

    private void consultar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar9ActionPerformed
        try {
            int codigo = Integer.parseInt(imgM.getText());
            EstudianteDTO rta = estudiante.buscarEstudiante_Oracle(codigo);
            estudiante.mostrarImagenOracle(rta);
            imgM.setText("");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_consultar9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CorreoOracle;
    private javax.swing.JLabel CorreoSQLServer;
    private javax.swing.JLabel PElementoOracle;
    private javax.swing.JLabel PElementoSQLServer;
    private javax.swing.JLabel PEstudianteOracle;
    private javax.swing.JLabel PEstudianteSQLServer;
    private javax.swing.JSeparator Separacion;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton actualizarO;
    private javax.swing.JButton actualizarS;
    private javax.swing.JButton consultar1;
    private javax.swing.JButton consultar2;
    private javax.swing.JButton consultar3;
    private javax.swing.JButton consultar4;
    private javax.swing.JButton consultar5;
    private javax.swing.JButton consultar6;
    private javax.swing.JButton consultar7;
    private javax.swing.JButton consultar8;
    private javax.swing.JButton consultar9;
    private javax.swing.JTextField dto1;
    private javax.swing.JTextField dto2;
    private javax.swing.JTextField imgC;
    private javax.swing.JTextField imgE;
    private javax.swing.JTextField imgM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField precioO;
    private javax.swing.JTextField precioS;
    private javax.swing.JTextField promedioO;
    private javax.swing.JTextField promedioS;
    private javax.swing.JLabel rta1;
    private javax.swing.JLabel rta2;
    private javax.swing.JLabel rta3;
    private javax.swing.JLabel rta4;
    private javax.swing.JLabel rta5;
    private javax.swing.JLabel rta6;
    private javax.swing.JLabel rta7;
    private javax.swing.JLabel rta8;
    private javax.swing.JLabel rta9;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
