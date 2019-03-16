package Vista;

import controlador.Asistencia;
import controlador.Persona;
import java.awt.Dimension;
import java.awt.List;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import static modelo.Base_Datos.*;
public class formularioAsistencia extends javax.swing.JPanel {
    public formularioAsistencia() {
        initComponents();
        llenarCalendario();
        llenarTabla();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        fecha1 = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setName("formularioAsistencia"); // NOI18N
        setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setColumns(32);
        jTextField1.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        fecha1.setBackground(new java.awt.Color(0, 204, 204));
        fecha1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fecha1.setName("fecha1"); // NOI18N

        jButton3.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/galeria/buscar.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 277, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fecha1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4);

        add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setText("Nuevo");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setText("jButton2");
        jButton2.setBorderPainted(false);
        jPanel1.add(jButton2);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable1.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionBackground(new java.awt.Color(0, 204, 204));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(1500);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(600);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(600);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel5);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        generarRegistroAsistencia();
        llenarTabla();
        jTextField1.setText("");
        filtrarTabla(jTextField1.getText().toUpperCase(), jTable1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        filtrarTabla(jTextField1.getText().toUpperCase(), jTable1);
    }//GEN-LAST:event_jTextField1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fecha1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
public void llenarTabla()
{
    Persona persona=new Persona();
    ArrayList arreglo=new ArrayList();
    Date fecha = obtenerFechaCalendario();
    String sentenciaSQL="SELECT * FROM MIEMBROS WHERE CODIGO NOT IN(SELECT MIEMBROS.CODIGO FROM MIEMBROS INNER JOIN ASISTENCIA ON MIEMBROS.CODIGO = ASISTENCIA.CODIGO AND FECHA = '"+fecha+"' ) ORDER BY NOMBRES;";
        
    arreglo=consulta_arregloPersonas(sentenciaSQL, fecha);
    DefaultTableModel modeloTabla=new DefaultTableModel();
    modeloTabla.setColumnIdentifiers(new Object[]{"cod","nombres y apellidos","estado","fecha de nacimiento"});
    Object[]fila=new Object[modeloTabla.getColumnCount()];
    for(int i=0;i<arreglo.size();i++){
        persona=(Persona) arreglo.get(i);
        fila[0]=persona.codigo;
        fila[1]=persona.nombres+" "+persona.apellidos;
        fila[2]=persona.estado;
        fila[3]=persona.fechaNacimiento;
        modeloTabla.addRow(fila);
    }
    jTable1.setModel(modeloTabla);
    definirTamañoTabla();
    jTable1.revalidate();
}
public void definirTamañoTabla()
{
    jTable1.setPreferredSize(new Dimension(5000,400));
    jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
    jTable1.getColumnModel().getColumn(1).setPreferredWidth(1200);
    jTable1.getColumnModel().getColumn(2).setPreferredWidth(600);
    jTable1.getColumnModel().getColumn(3).setPreferredWidth(600);
}
public void llenarCalendario()
{
    Calendar fechaActual=new GregorianCalendar();
    fecha1.setCalendar(fechaActual);
}
public Date obtenerFechaCalendario()
{
    Date fecha=new Date(fecha1.getCalendar().get(Calendar.YEAR)-1900,fecha1.getCalendar().get(Calendar.MONTH),fecha1.getCalendar().get(Calendar.DAY_OF_MONTH));
    return fecha;
}
public void generarRegistroAsistencia()
{
    Asistencia asistencia=new Asistencia();
        int[] filas=jTable1.getSelectedRows();
        for(int i:filas){
            asistencia.codigo=(int) jTable1.getValueAt(i, 0);
            asistencia.fecha=obtenerFechaCalendario();
            asistencia.crearRegistro();
        }
    //depurarTabla();
}
public void depurarTabla()
{
    DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
        int[] filas=jTable1.getSelectedRows();
        for(int i=filas.length-1;i>=0;i--){
           modelo.removeRow(filas[i]);            
        }
}
public void filtrarTabla(String nombre, JTable jTable1)
{
    jTable1=jTable1;
        DefaultTableModel modeloTabla = (DefaultTableModel)jTable1.getModel();
        TableRowSorter<DefaultTableModel> fila=new TableRowSorter<>(modeloTabla);
        jTable1.setRowSorter(fila);
        fila.setRowFilter(RowFilter.regexFilter(nombre));
}
}
