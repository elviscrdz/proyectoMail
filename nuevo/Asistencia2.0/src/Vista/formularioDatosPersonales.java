package Vista;

import controlador.Persona;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class formularioDatosPersonales extends javax.swing.JFrame {
    public formularioDatosPersonales() {
        initComponents();
        persona=new Persona();
        botonEliminar.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonGuardar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textoNombres = new javax.swing.JTextField();
        textoApellidos = new javax.swing.JTextField();
        textoTelefono = new javax.swing.JTextField();
        texto2doTelefono = new javax.swing.JTextField();
        textoCorreo = new javax.swing.JTextField();
        textoDireccion = new javax.swing.JTextField();
        comboCondicion = new javax.swing.JComboBox<>();
        comboGenero = new javax.swing.JComboBox<>();
        fecha1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setFocusCycleRoot(true);

        botonGuardar.setBackground(new java.awt.Color(255, 255, 255));
        botonGuardar.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.setBorderPainted(false);
        botonGuardar.setFocusCycleRoot(true);
        botonGuardar.setName("botonGuardar"); // NOI18N
        botonGuardar.setNextFocusableComponent(botonCancelar);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(botonGuardar);

        botonCancelar.setBackground(new java.awt.Color(255, 255, 255));
        botonCancelar.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.setBorderPainted(false);
        botonCancelar.setFocusCycleRoot(true);
        botonCancelar.setName("botonCancelar"); // NOI18N
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(botonCancelar);

        botonEliminar.setBackground(new java.awt.Color(255, 255, 255));
        botonEliminar.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.setBorderPainted(false);
        botonEliminar.setFocusCycleRoot(true);
        botonEliminar.setName("botonEliminar"); // NOI18N
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(botonEliminar);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel1.setText("nombres");

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel2.setText("apellidos");

        jLabel3.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel3.setText("nacimiento");

        jLabel4.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel4.setText("telefono");

        jLabel5.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel5.setText("telefono");

        jLabel6.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel6.setText("direccion");

        jLabel7.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel7.setText("condicion");

        jLabel8.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel8.setText("genero");

        jLabel9.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel9.setText("correo");

        textoNombres.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        textoNombres.setName("textoNombres"); // NOI18N
        textoNombres.setNextFocusableComponent(textoApellidos);
        textoNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombresActionPerformed(evt);
            }
        });
        textoNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoNombresKeyTyped(evt);
            }
        });

        textoApellidos.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        textoApellidos.setName("textoApellidos"); // NOI18N
        textoApellidos.setNextFocusableComponent(textoTelefono);
        textoApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoApellidosKeyTyped(evt);
            }
        });

        textoTelefono.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        textoTelefono.setName("textoTelefono"); // NOI18N
        textoTelefono.setNextFocusableComponent(texto2doTelefono);
        textoTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoTelefonoKeyTyped(evt);
            }
        });

        texto2doTelefono.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        texto2doTelefono.setName("texto2doTelefono"); // NOI18N
        texto2doTelefono.setNextFocusableComponent(textoCorreo);
        texto2doTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                texto2doTelefonoKeyTyped(evt);
            }
        });

        textoCorreo.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        textoCorreo.setName("textoCorreo"); // NOI18N
        textoCorreo.setNextFocusableComponent(fecha1);
        textoCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoCorreoKeyTyped(evt);
            }
        });

        textoDireccion.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        textoDireccion.setName("textoDireccion"); // NOI18N
        textoDireccion.setNextFocusableComponent(comboCondicion);
        textoDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoDireccionKeyTyped(evt);
            }
        });

        comboCondicion.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        comboCondicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MIEMBRO", "VISITANTE" }));
        comboCondicion.setName("comboCondicion"); // NOI18N
        comboCondicion.setNextFocusableComponent(comboGenero);

        comboGenero.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        comboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MASCULINO", "FEMENINO" }));
        comboGenero.setName("comboGenero"); // NOI18N
        comboGenero.setNextFocusableComponent(botonGuardar);

        fecha1.setBackground(new java.awt.Color(0, 204, 204));
        fecha1.setName("fecha1"); // NOI18N
        fecha1.setNextFocusableComponent(textoDireccion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(10, 10, 10)
                                .addComponent(comboCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(10, 10, 10)
                                .addComponent(textoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(textoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(texto2doTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, Short.MAX_VALUE)
                            .addComponent(jLabel8)
                            .addGap(10, 10, 10)
                            .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(jLabel3)
                    .addComponent(fecha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(textoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2)))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(texto2doTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addGap(0, 86, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
    if(persona.codigo==0)
    {
        if(textoNombres.getText().length()>0 && textoApellidos.getText().length()>0 && fecha1!=null){
        nuevaPersona();
        formularioPersona.formularioDatosPersonalesActivo=false;
        formularioPersona.llenarTabla();
        this.dispose();
    }else
            {
                JOptionPane.showMessageDialog(null, "faltan uno o varios datos necesarios");
            }
    }else{
        actualizarPersona();
        formularioPersona.formularioDatosPersonalesActivo=false;
        formularioPersona.llenarTabla();
        this.dispose();
    }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void textoNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNombresActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.dispose();
        formularioPersona.formularioDatosPersonalesActivo=false;
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void textoNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoNombresKeyTyped
        limiteTexto(textoNombres, 15, evt);
    }//GEN-LAST:event_textoNombresKeyTyped

    private void textoApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoApellidosKeyTyped
        limiteTexto(textoApellidos, 15, evt);
    }//GEN-LAST:event_textoApellidosKeyTyped

    private void textoTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoTelefonoKeyTyped
        limiteTexto(textoTelefono, 11, evt);
        soloNumeros(textoTelefono, evt.getKeyChar(), evt);
    }//GEN-LAST:event_textoTelefonoKeyTyped

    private void texto2doTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto2doTelefonoKeyTyped
        limiteTexto(texto2doTelefono, 11, evt);
        soloNumeros(texto2doTelefono, evt.getKeyChar(), evt);
    }//GEN-LAST:event_texto2doTelefonoKeyTyped

    private void textoCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoCorreoKeyTyped
        limiteTexto(textoCorreo, 25, evt);
    }//GEN-LAST:event_textoCorreoKeyTyped

    private void textoDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoDireccionKeyTyped
        limiteTexto(textoDireccion, 25, evt);
    }//GEN-LAST:event_textoDireccionKeyTyped

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        eliminarPersona();
        formularioPersona.llenarTabla();
    }//GEN-LAST:event_botonEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JComboBox<String> comboCondicion;
    private javax.swing.JComboBox<String> comboGenero;
    private com.toedter.calendar.JDateChooser fecha1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField texto2doTelefono;
    private javax.swing.JTextField textoApellidos;
    private javax.swing.JTextField textoCorreo;
    private javax.swing.JTextField textoDireccion;
    private javax.swing.JTextField textoNombres;
    private javax.swing.JTextField textoTelefono;
    // End of variables declaration//GEN-END:variables
public Persona definirDatos()
{
        persona.nombres=textoNombres.getText();
        persona.apellidos=textoApellidos.getText();
        persona.telefono=textoTelefono.getText();
        persona.segundoTelefono=texto2doTelefono.getText();
        persona.direccion=textoDireccion.getText();
        persona.correo=textoCorreo.getText();
        persona.estado=comboCondicion.getSelectedItem().toString();
        persona.genero=comboGenero.getSelectedItem().toString();
        persona.fechaNacimiento=new Date(fecha1.getCalendar().get(Calendar.YEAR)-1900,fecha1.getCalendar().get(Calendar.MONTH),fecha1.getCalendar().get(Calendar.DAY_OF_MONTH)); 
    return persona;
    
}
public void limiteTexto(JTextField objetoTexto, int limite, KeyEvent e)
{
        if(objetoTexto.getText().length()== limite){
            e.consume();
        }
    }
public void soloNumeros(JTextField objetoTexto, char variable, KeyEvent e)
{
        if(((variable<'0')||(variable>'9'))&&(variable!='-')){
            e.consume();
        }
    }
public void nuevaPersona()
{
    persona=definirDatos();
    persona.nuevoRegistro();
}
public void eliminarPersona()
{
    persona.eliminarRegistro();
    formularioPersona.formularioDatosPersonalesActivo=false;
    this.dispose();
}
public void actualizarPersona()
{
    persona=definirDatos();
    persona.actualizarRegistro();
}
public void llenarFormulario(Persona person)
{
    persona=person;
    textoNombres.setText(persona.nombres);
    textoApellidos.setText(persona.apellidos);
    textoCorreo.setText(persona.correo);
    textoDireccion.setText(persona.direccion);
    textoTelefono.setText(persona.telefono);
    texto2doTelefono.setText(persona.segundoTelefono);
    if(persona.genero.equals("MASCULINO")){
        comboGenero.setSelectedIndex(0);
    }else
        {comboGenero.setSelectedIndex(1);
    }
    if(persona.estado.equals("MIEMBRO")){
        comboCondicion.setSelectedIndex(0);
    }else{
        comboCondicion.setSelectedIndex(1);
    }
    fecha1.setDate(persona.fechaNacimiento);
    botonEliminar.setVisible(true);
    this.revalidate();
    this.repaint();
}
public void setPersona(Persona persona)
{
        this.persona = persona;
    }
public Persona persona;
}
