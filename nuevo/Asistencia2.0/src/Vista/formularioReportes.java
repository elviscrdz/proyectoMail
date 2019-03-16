package Vista;

//import static Vista.formularioPersona.tamañoTabla;
import controlador.Persona;
import java.awt.Color;
import java.sql.SQLException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Base_Datos;

public class formularioReportes extends javax.swing.JPanel {
    public formularioReportes() throws SQLException {
        initComponents();
        llenarTablaCumplea();
        llenarTablaCumpleaños2();
        llenarLista();
        llenarTablaCuatro();
        tamañoTabla();
        //llenarListaAsistencia();
        jScrollPane4.getViewport().setBackground(Color.WHITE);
        this.repaint();
        this.revalidate();
        //Base_Datos.listadeAsistencia();
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        scroll3 = new javax.swing.JScrollPane();
        tabla3 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        scroll4 = new javax.swing.JScrollPane();
        tabla4 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista2 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setName("formularioAsistencia"); // NOI18N
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(null);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setName("jScrollPane4"); // NOI18N

        tabla2.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tabla2.setGridColor(new java.awt.Color(255, 255, 255));
        tabla2.setRowHeight(30);
        tabla2.setSelectionBackground(new java.awt.Color(0, 255, 255));
        jScrollPane4.setViewportView(tabla2);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(null);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setName("jScrollPane3"); // NOI18N

        tabla1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tabla1.setGridColor(new java.awt.Color(255, 255, 255));
        tabla1.setRowHeight(30);
        tabla1.setSelectionBackground(new java.awt.Color(0, 255, 255));
        jScrollPane3.setViewportView(tabla1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionBackground(new java.awt.Color(0, 204, 204));
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        scroll3.setBackground(new java.awt.Color(255, 255, 255));
        scroll3.setBorder(null);
        scroll3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll3.setName("scroll3"); // NOI18N

        tabla3.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        tabla3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tabla3.setName("tabla3"); // NOI18N
        tabla3.setRowHeight(30);
        tabla3.setSelectionBackground(new java.awt.Color(0, 255, 255));
        scroll3.setViewportView(tabla3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll3, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(scroll3, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        scroll4.setBackground(new java.awt.Color(255, 255, 255));
        scroll4.setBorder(null);
        scroll4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll4.setName("scroll4"); // NOI18N

        tabla4.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        tabla4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tabla4.setName("tabla4"); // NOI18N
        tabla4.setRowHeight(30);
        tabla4.setSelectionBackground(new java.awt.Color(0, 255, 255));
        tabla4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla4MouseClicked(evt);
            }
        });
        scroll4.setViewportView(tabla4);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);

        lista2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lista2.setName("lista2"); // NOI18N
        lista2.setSelectionBackground(new java.awt.Color(0, 204, 204));
        lista2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lista2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lista2);

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scroll4, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        llenarTablaAsistenciaFecha();
    }//GEN-LAST:event_jList1MouseClicked

    private void lista2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lista2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lista2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
   
    }//GEN-LAST:event_jButton1MouseClicked

    private void tabla4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla4MouseClicked
        llenarLista2();
    }//GEN-LAST:event_tabla4MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> lista2;
    private javax.swing.JScrollPane scroll3;
    private javax.swing.JScrollPane scroll4;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tabla2;
    private javax.swing.JTable tabla3;
    private javax.swing.JTable tabla4;
    // End of variables declaration//GEN-END:variables
public void llenarTablaCumplea() throws SQLException    //inferior izquierda
{
    Persona persona=new Persona();
    ArrayList arreglo=new ArrayList();
    String sentenciaSQL="SELECT * FROM MIEMBROS WHERE MONTH( FECHA_NACIMIENTO ) = MONTH( CURDATE( ) ) AND DAY( FECHA_NACIMIENTO ) >= DAY( DATE_SUB( CURDATE( ) , INTERVAL 1 WEEK ) ) AND DAY( FECHA_NACIMIENTO ) <= DAY( CURDATE( ) ) ORDER BY DAY( FECHA_NACIMIENTO )";
    arreglo=Base_Datos.consulta_arregloPersonas(sentenciaSQL, null);
    DefaultTableModel modeloTabla=new DefaultTableModel();
    //modeloTabla.setColumnIdentifiers(new Object[]{"cod","nombres y apellidos","estado","fecha de nacimiento"});
    modeloTabla.setColumnIdentifiers(new Object[]{"cumpleaños de la semana"});
    Object[]fila=new Object[modeloTabla.getColumnCount()];
    for(int i=0;i<arreglo.size();i++){
        persona=(Persona) arreglo.get(i);
        /*fila[0]=persona.codigo;
        fila[1]=persona.nombres+" "+persona.apellidos;
        fila[2]=persona.estado;
        fila[3]=persona.fechaNacimiento;*/
        fila[0]="( "+persona.fechaNacimiento+" ) "+persona.nombres+" "+persona.apellidos;
        modeloTabla.addRow(fila);
    }
    tabla1.setModel(modeloTabla);
    //tamañoTabla(tabla1);
    jScrollPane3.getViewport().setBackground(Color.WHITE);
    tabla1.revalidate();
}
public void llenarTablaCumpleaños2() throws SQLException    //inferior derecha
{
    Persona persona=new Persona();
    ArrayList arreglo=new ArrayList();
    String sentenciaSQL="SELECT * FROM MIEMBROS WHERE MONTH( FECHA_NACIMIENTO ) = MONTH( CURDATE( ) ) AND DAY( FECHA_NACIMIENTO ) <= DAY( DATE_ADD( CURDATE( ) , INTERVAL 1 WEEK ) ) AND DAY( FECHA_NACIMIENTO ) > DAY( CURDATE( ) ) ORDER BY DAY( FECHA_NACIMIENTO )";
    arreglo=Base_Datos.consulta_arregloPersonas(sentenciaSQL, null);
    DefaultTableModel modeloTabla=new DefaultTableModel();
    //modeloTabla.setColumnIdentifiers(new Object[]{"cod","nombres y apellidos","estado","fecha de nacimiento"});
    modeloTabla.setColumnIdentifiers(new Object[]{"cumpleaños proxima semana"});
    Object[]fila=new Object[modeloTabla.getColumnCount()];
    for(int i=0;i<arreglo.size();i++){
        persona=(Persona) arreglo.get(i);
        fila[0]="( "+persona.fechaNacimiento+" ) "+persona.nombres+" "+persona.apellidos;
        modeloTabla.addRow(fila);
    }
    tabla2.setModel(modeloTabla);
    //tamañoTabla(tabla2);
    jScrollPane4.getViewport().setBackground(Color.WHITE);
    tabla2.revalidate();
}
public void llenarLista()   //muestra las fechas para la consulta por fechas en un jList
{
    ArrayList lista=new ArrayList();
    Base_Datos BaseDatos=new Base_Datos();
    DefaultListModel modeloLista=new DefaultListModel();
    lista=BaseDatos.consultaFechas();
    for (int i=0;i<lista.size();i++){
        modeloLista.addElement(lista.get(i).toString());
    }
    jList1.setModel(modeloLista);
}
public void llenarTablaAsistenciaFecha() //llena la tabla de la lista de fechas
{
    String texto=jList1.getSelectedValue();
    Persona persona=new Persona();
    ArrayList arreglo=new ArrayList();
    arreglo=Base_Datos.consulta_AsistenciaFecha(tabla3, texto);
    DefaultTableModel modeloTabla=new DefaultTableModel();
    modeloTabla.setColumnIdentifiers(new Object[]{"fecha","codigo","datos"});
    Object[]fila=new Object[modeloTabla.getColumnCount()];
    
    for(int i=0;i<arreglo.size();i++){
        persona=(Persona) arreglo.get(i);
        for(int j=1;j<=3;j++){
                  if(j==1){
                      fila[0]=persona.fechaNacimiento;//la fecha de nacimiento se cambio por la fecha de la consulta
                  }else if(j==2){
                      fila[1]=persona.codigo;
                  }else if(j==3){
                      fila[2]=persona.nombres+" "+persona.apellidos;
                  }
        }
        modeloTabla.addRow(fila);
    }
    //tamañoTabla(tabla3);
    tabla3.setModel(modeloTabla);
    //tamañoTabla(tabla1);
    scroll3.getViewport().setBackground(Color.WHITE);
    tabla1.revalidate();
}
public void llenarTablaCuatro() //llena la tabla con datos de persona, para la busqueda por nombre
{
         String texto=new String("SELECT * FROM MIEMBROS ORDER BY NOMBRES");
        ArrayList arreglo=new ArrayList();
        arreglo=Base_Datos.consulta_arregloPersonas(texto, null);
        Persona persona=new Persona();
        DefaultTableModel modeloTabla=new DefaultTableModel();
        modeloTabla.setColumnIdentifiers(new Object[]{"cod","nombres y apellidos"});
        Object[]fila=new Object[modeloTabla.getColumnCount()];
        for(int i=0;i<arreglo.size();i++)
        {
            persona=(Persona) arreglo.get(i);
            fila[0]=persona.codigo;
            fila[1]=persona.nombres+" "+persona.apellidos;
            modeloTabla.addRow(fila);
        }
        //tamañoTabla(tabla4);
        tabla4.setModel(modeloTabla);
        tabla4.revalidate();
}
public void llenarLista2()
{
    int codig=0;
        ArrayList<String> mostrar=new ArrayList<String>();
        DefaultListModel modeloLista=new DefaultListModel();
        ArrayList<Date> arreglo=new ArrayList<Date>();
        Map<Object, String> tupla=new TreeMap<Object, String>();
        tupla=Base_Datos.listadeAsistencia();
        codig=(int)tabla4.getValueAt(tabla4.getSelectedRow(), 0);
                arreglo=Base_Datos.consulta_AsistenciaNombre(codig);
        //DefaultListModel modeloLista=new DefaultListModel();
    //lista2.setModel(modeloLista);
    Object valor=new Date();
    Iterator<Date> it=arreglo.iterator();
            while(it.hasNext()){
            valor = it.next();
            //tupla.put(valor, "ASISTENCIA");
            }
     Iterator<Object> iterador=tupla.keySet().iterator();
        while (iterador.hasNext()) {
            Object clave=iterador.next();
            //System.out.println(clave+" - "+tupla.get(clave));
            String texto=clave+" - "+tupla.get(clave);
            modeloLista.addElement(texto);
        }
    //
    lista2.setModel(modeloLista);
}
public void tamañoTabla()
{
    tabla1.getTableHeader().setBackground(new Color(0,204,204));
    tabla2.getTableHeader().setBackground(new Color(0,204,204));
    tabla4.getTableHeader().setBackground(new Color(0,204,204));
    tabla3.getTableHeader().setBackground(new Color(0,204,204));
    scroll3.getViewport().setBackground(Color.WHITE);
    jScrollPane4.getViewport().setBackground(Color.WHITE);
    jScrollPane3.getViewport().setBackground(Color.WHITE);
}
}