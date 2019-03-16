package modelo;

import controlador.Asistencia;
import controlador.Persona;
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Base_Datos {
    
    public static ArrayList consulta_arregloPersonas(String sentenciaSQL, Date fech)
    {
        ArrayList arreglo=new ArrayList();
        try{
            Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/miembros_feya", "root", "");
            Statement sentencia=conexion.createStatement();
            ResultSet resultado=sentencia.executeQuery(sentenciaSQL);
            ResultSetMetaData metaDatos=resultado.getMetaData();
            while(resultado.next()){
                Persona persona=new Persona();
                persona.codigo=resultado.getInt(1);
                persona.nombres=resultado.getString(2);
                persona.apellidos=resultado.getString(3);
                persona.fechaNacimiento=resultado.getDate(4);
                persona.direccion=resultado.getString(5);
                persona.telefono=resultado.getString(6);
                persona.segundoTelefono=resultado.getString(7);
                persona.estado=resultado.getString(8);
                persona.genero=resultado.getString(9);
                persona.correo=resultado.getString(10);
                arreglo.add(persona);
            }
            resultado.close();
            sentencia.close();
            conexion.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return arreglo;
    }
    public void sentencia_asistenciaNueva(int codig, Date fech)
    {
        try{
            Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/miembros_feya", "root", "");
            PreparedStatement sentencia=conexion.prepareStatement("INSERT INTO ASISTENCIA(CODIGO, FECHA) VALUES (?,?)");
            sentencia.setInt(1, codig);
            sentencia.setDate(2, (java.sql.Date) fech);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void sentencia_agregarPersona(Persona persona)
    {
                try{
            Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/miembros_feya", "root", "");
            PreparedStatement sentencia=conexion.prepareStatement("INSERT INTO MIEMBROS (NOMBRES, APELLIDOS, DIRECCION, CORREO_ELECTRONICO,TELEFONO, SEGUNDO_TELEFONO, GENERO, ESTADO,FECHA_NACIMIENTO)VALUES(?,?,?,?,?,?,?,?,?)");
            sentencia.setString(1, persona.nombres);
            sentencia.setString(2, persona.apellidos);
            sentencia.setString(3, persona.direccion);
            sentencia.setString(4, persona.correo);
            sentencia.setString(5, persona.telefono);
            sentencia.setString(6, persona.segundoTelefono);
            sentencia.setString(7, persona.genero);
            sentencia.setString(8, persona.estado);
            sentencia.setDate(9, (java.sql.Date) persona.fechaNacimiento);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        }catch(SQLException e){
                System.out.println(e.getMessage());
        }

    }
    public Persona sentencia_buscarDatosPersona(int codig)
    {
        String consultaBuscar="SELECT * FROM MIEMBROS WHERE CODIGO="+codig+";";
        Persona persona=new Persona();
        try{
        Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/miembros_feya", "root", "");
        Statement sentenciaBuscar=conexion.createStatement();
        ResultSet resultado=sentenciaBuscar.executeQuery(consultaBuscar);
        resultado.first();
        persona.codigo=resultado.getInt(1);
        persona.nombres=resultado.getString(2);
        persona.apellidos=resultado.getString(3);
        persona.fechaNacimiento=resultado.getDate(4);
        persona.direccion=resultado.getString(5);
        persona.telefono=resultado.getString(6);
        persona.segundoTelefono=resultado.getString(7);
        persona.genero=resultado.getString(9);
        persona.estado=resultado.getString(8);
        persona.correo=resultado.getString(10);
        resultado.close();
        sentenciaBuscar.close();
        conexion.close();
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("ERROR EN LA CONSULTA");
        }
        return persona;
    }
    public void setencia_eliminarPersona(int codig)
    {
        try{
            Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/miembros_feya","root","");
            PreparedStatement sentencia=conexion.prepareStatement("DELETE FROM MIEMBROS WHERE CODIGO="+codig+";");
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    public void sentencia_actualizarPersona(Persona person)
    {
        try{
            Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/miembros_feya","root","");
            PreparedStatement sentencia=conexion.prepareStatement("UPDATE MIEMBROS SET NOMBRES =?, APELLIDOS=?, FECHA_NACIMIENTO=?, DIRECCION=?, TELEFONO=?, SEGUNDO_TELEFONO=?, ESTADO=?, GENERO=?, CORREO_ELECTRONICO=? WHERE CODIGO="+person.codigo+";");
            sentencia.setString(1, person.nombres);
            sentencia.setString(2, person.apellidos);
            sentencia.setDate(3, (java.sql.Date) person.fechaNacimiento);
            sentencia.setString(4, person.direccion);
            sentencia.setString(5, person.telefono);
            sentencia.setString(6, person.segundoTelefono);
            sentencia.setString(7, person.estado);
            sentencia.setString(8, person.genero);
            sentencia.setString(9, person.correo);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    public static ArrayList consultaFechas()
    {
        ArrayList arreglo=new ArrayList();
        Asistencia asistencia=new Asistencia();
        Date fecha = new Date();
        try{
            Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/miembros_feya", "root", "");
            Statement sentencia=conexion.createStatement();
            ResultSet resultado=sentencia.executeQuery("SELECT DISTINCTROW FECHA FROM ASISTENCIA ORDER BY FECHA DESC");
            ResultSetMetaData metaDatos=resultado.getMetaData();
            while(resultado.next()){
                asistencia.fecha=resultado.getDate(1);
                arreglo.add(asistencia.fecha.toString());
            }
            resultado.close();
            sentencia.close();
            conexion.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return arreglo;
    }
    public static ArrayList consulta_AsistenciaFecha(JTable tabla, String fecha)
    {
        ArrayList arreglo=new ArrayList();
        String consultaCumpleaños="SELECT FECHA, MIEMBROS.* FROM MIEMBROS INNER JOIN ASISTENCIA ON MIEMBROS.CODIGO = ASISTENCIA.CODIGO WHERE FECHA = '"+fecha+"' ORDER BY NOMBRES; ";
        DefaultTableModel modeloTabla=new DefaultTableModel();
        Object[] filas =new Object[3];
        try{
            Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/miembros_feya", "root", "");
            Statement sentenciaBuscar=conexion.createStatement();
            ResultSet resultado=sentenciaBuscar.executeQuery(consultaCumpleaños);
            while(resultado.next()){
            Persona persona=new Persona();
            persona.codigo=resultado.getInt(2);
                persona.nombres=resultado.getString(3);
                persona.apellidos=resultado.getString(4);
                persona.fechaNacimiento=resultado.getDate(1);//la fecha de nacimiento se sustituye por la fecha de la consulta
                persona.direccion=resultado.getString(6);
                persona.telefono=resultado.getString(7);
                persona.segundoTelefono=resultado.getString(8);
                persona.estado=resultado.getString(9);
                persona.genero=resultado.getString(10);
                persona.correo=resultado.getString(10);
                arreglo.add(persona);
            }
        resultado.close();
        sentenciaBuscar.close();
        conexion.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return arreglo;
    }
    public static ArrayList consulta_AsistenciaNombre(int codig)
    {
        codig=codig;
        
        ArrayList<Date>arreglo=new ArrayList<Date>();
        String consultaSQL="SELECT FECHA FROM ASISTENCIA WHERE CODIGO ="+codig+"; ";
        Object[]filas=new Object[2];
        try{
            Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/miembros_feya","root","");
            Statement sentencia=conexion.createStatement();
            ResultSet resultado=sentencia.executeQuery(consultaSQL);
            while(resultado.next()){
                arreglo.add((Date) resultado.getObject(1));
            }
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR EN LA CONCULTA");
        }
        return arreglo;
    }
    public static HashMap listadeAsistencia()//NOTA:corregir clave del HashMap
    {
        Object fecha=new Date();
        HashMap<Object, String> lista=new HashMap<Object, String>();
        ArrayList<Object> listaAsistencia=new ArrayList<Object>();
        listaAsistencia=consultaFechas();
        for (int i = 0; i < listaAsistencia.size(); i++) {
          fecha=listaAsistencia.get(i);
          lista.put(fecha, "INASISTENCIA");
        }       
        return lista;
    }
}
    