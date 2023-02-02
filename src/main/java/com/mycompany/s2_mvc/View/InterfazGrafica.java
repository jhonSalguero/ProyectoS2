/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.s2_mvc.View;

import com.mycompany.s2_mvc.Controller.ElementoControllerOracle;
import com.mycompany.s2_mvc.Controller.ElementoControllerSQLServer;
import com.mycompany.s2_mvc.Controller.EstudianteControllerOracle;
import com.mycompany.s2_mvc.Controller.EstudianteControllerSQLServer;
import java.awt.event.KeyEvent;

/**
 *
 * @author JHON_SALGUERO
 */
public class InterfazGrafica extends javax.swing.JFrame {

    private static EstudianteControllerOracle estudiante_oracle = EstudianteControllerOracle.getInstance();
    private static ElementoControllerOracle elemento_oracle = ElementoControllerOracle.getInstance();

    private static EstudianteControllerSQLServer estudiante_sqlserver = EstudianteControllerSQLServer.getInstance();
    private static ElementoControllerSQLServer elemento_sqlserver = ElementoControllerSQLServer.getInstance();

    /**
     * Creates new form InterfazGrafica
     */
    public InterfazGrafica() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addComponent(Separacion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
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
                                    .addComponent(precioS)
                                    .addComponent(precioO)
                                    .addComponent(promedioS, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addComponent(consultar1)))))
                        .addGap(0, 107, Short.MAX_VALUE)))
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
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar1ActionPerformed
        try {
            int codigo = Integer.parseInt(promedioO.getText());
            String rta = String.valueOf(estudiante_oracle.promedioEstudiante(codigo));
            rta1.setText(rta);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_consultar1ActionPerformed

    private void consultar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar2ActionPerformed
        try {
            int codigo = Integer.parseInt(promedioS.getText());
            String rta = String.valueOf(estudiante_sqlserver.promedioEstudiante(codigo));
            rta2.setText(rta);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_consultar2ActionPerformed

    private void consultar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar3ActionPerformed
        try {
            int codigo = Integer.parseInt(precioO.getText());
            String rta = String.valueOf(elemento_oracle.promedioPrecioElemento(codigo));
            rta3.setText(rta);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_consultar3ActionPerformed

    private void consultar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar4ActionPerformed
        try {
            int codigo = Integer.parseInt(precioS.getText());
            String rta = String.valueOf(elemento_sqlserver.promedioPrecioElemento(codigo));
            rta4.setText(rta);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_consultar4ActionPerformed

    private void promedioOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_promedioOKeyReleased
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                int codigo = Integer.parseInt(promedioO.getText());
                String rta = String.valueOf(estudiante_oracle.promedioEstudiante(codigo));
                rta1.setText(rta);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_promedioOKeyReleased

    private void actualizarOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarOActionPerformed
        try {
            if (estudiante_oracle.actualizarCorreo()) {
                rta5.setText("Actualizacion realizada...");
            } else {
                rta5.setText("Error al actualizar ;(");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_actualizarOActionPerformed

    private void actualizarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarSActionPerformed
        try {
            if (estudiante_sqlserver.actualizarCorreo()) {
                rta6.setText("Actualizacion realizada...");
            } else {
                rta5.setText("Error al actualizar ;(");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_actualizarSActionPerformed

    private void promedioSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_promedioSKeyReleased
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                int codigo = Integer.parseInt(promedioS.getText());
                String rta = String.valueOf(estudiante_sqlserver.promedioEstudiante(codigo));
                rta2.setText(rta);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_promedioSKeyReleased

    private void precioOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioOKeyReleased
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                int codigo = Integer.parseInt(precioO.getText());
                String rta = String.valueOf(elemento_oracle.promedioPrecioElemento(codigo));
                rta3.setText(rta);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_precioOKeyReleased

    private void precioSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioSKeyReleased
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                int codigo = Integer.parseInt(precioS.getText());
                String rta = String.valueOf(elemento_sqlserver.promedioPrecioElemento(codigo));
                rta4.setText(rta);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_precioSKeyReleased

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
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
    // End of variables declaration//GEN-END:variables
}
