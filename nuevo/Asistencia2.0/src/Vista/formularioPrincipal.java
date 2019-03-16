package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import modelo.Base_Datos;

public class formularioPrincipal extends javax.swing.JFrame {
    public formularioPrincipal() {
        initComponents();
        definirTamaño();        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSuperior = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        botonReportes = new javax.swing.JButton();
        botonPersona = new javax.swing.JButton();
        botonAsistencia = new javax.swing.JButton();
        botonInicio = new javax.swing.JButton();
        panelCentral = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setName("formularioPrincipal"); // NOI18N
        setUndecorated(true);

        panelSuperior.setBackground(new java.awt.Color(0, 204, 204));
        panelSuperior.setName("panelSuperior"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/galeria/salir.png"))); // NOI18N
        jToggleButton1.setText("salir");
        jToggleButton1.setBorder(null);
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 5, -1, 60));

        botonReportes.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        botonReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/galeria/text-file.png"))); // NOI18N
        botonReportes.setText("Reportes");
        botonReportes.setBorder(null);
        botonReportes.setBorderPainted(false);
        botonReportes.setContentAreaFilled(false);
        botonReportes.setName("botonReportes"); // NOI18N
        botonReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReportesActionPerformed(evt);
            }
        });
        jPanel1.add(botonReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 5, -1, 60));

        botonPersona.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        botonPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/galeria/user-shape.png"))); // NOI18N
        botonPersona.setText("Persona");
        botonPersona.setBorder(null);
        botonPersona.setBorderPainted(false);
        botonPersona.setContentAreaFilled(false);
        botonPersona.setName("botonPersona"); // NOI18N
        botonPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPersonaActionPerformed(evt);
            }
        });
        jPanel1.add(botonPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 5, -1, 60));

        botonAsistencia.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        botonAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/galeria/list-on-window.png"))); // NOI18N
        botonAsistencia.setText("Asistencia");
        botonAsistencia.setBorder(null);
        botonAsistencia.setBorderPainted(false);
        botonAsistencia.setContentAreaFilled(false);
        botonAsistencia.setName("botonAsistencia"); // NOI18N
        botonAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAsistenciaActionPerformed(evt);
            }
        });
        jPanel1.add(botonAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 5, -1, 60));

        botonInicio.setBackground(new java.awt.Color(0, 153, 153));
        botonInicio.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        botonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/galeria/Inicio.png"))); // NOI18N
        botonInicio.setText("Inicio");
        botonInicio.setBorder(null);
        botonInicio.setBorderPainted(false);
        botonInicio.setContentAreaFilled(false);
        botonInicio.setName("botonInicio"); // NOI18N
        botonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioActionPerformed(evt);
            }
        });
        jPanel1.add(botonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 5, -1, 60));

        panelSuperior.add(jPanel1);

        getContentPane().add(panelSuperior, java.awt.BorderLayout.PAGE_START);

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));
        panelCentral.setName("panelCentral"); // NOI18N
        panelCentral.setLayout(new java.awt.BorderLayout());
        getContentPane().add(panelCentral, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAsistenciaActionPerformed
        panelCentral.removeAll();
        formularioAsistencia panelUno=new formularioAsistencia();
        panelCentral.add(panelUno);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_botonAsistenciaActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void botonPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPersonaActionPerformed
        panelCentral.removeAll();
        formularioPersona panelDos=new formularioPersona();
        panelCentral.add(panelDos);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_botonPersonaActionPerformed

    private void botonReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReportesActionPerformed
        panelCentral.removeAll();
        formularioReportes panelTres = null;
        try {
            panelTres = new formularioReportes();
        } catch (SQLException ex) {
            Logger.getLogger(formularioPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        panelCentral.add(panelTres);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_botonReportesActionPerformed

    private void botonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioActionPerformed
        panelCentral.removeAll();
        this.revalidate();
        this.repaint();    
    }//GEN-LAST:event_botonInicioActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formularioPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAsistencia;
    private javax.swing.JButton botonInicio;
    private javax.swing.JButton botonPersona;
    private javax.swing.JButton botonReportes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelSuperior;
    // End of variables declaration//GEN-END:variables
public void definirTamaño()
{
    this.setExtendedState(Frame.MAXIMIZED_BOTH);
    //this.setSize(1200, 600);
    //this.setLocationRelativeTo(null);
 
    this.revalidate();
    this.repaint();
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}