package controlador;

import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Base_Datos;

public class Persona {
public Persona()
{
    codigo=0;
    nombres=null;
    apellidos=null;
    telefono=null;
    segundoTelefono=null;
    direccion=null;
    estado=null;
    genero=null;
    correo=null;
    fechaNacimiento=null;
}
public void nuevoRegistro()
{
    Base_Datos BaseDatos=new Base_Datos();
    BaseDatos.sentencia_agregarPersona(this);
}
public void actualizarDatos()
{
    Base_Datos BaseDatos=new Base_Datos();
    BaseDatos.sentencia_buscarDatosPersona(codigo);
}
public void eliminarRegistro()
{
    Base_Datos BaseDatos=new Base_Datos();
    BaseDatos.setencia_eliminarPersona(codigo);
}
public void actualizarRegistro()
{
    Base_Datos BaseDatos=new Base_Datos();
    BaseDatos.sentencia_actualizarPersona(this);
}
public Persona consultarDatos(Persona persona)
{
    //Persona persona=new Persona();
    persona=persona;
    Base_Datos BaseDatos=new Base_Datos();
    persona=BaseDatos.sentencia_buscarDatosPersona(persona.codigo);
    return persona;
}
public static void arregloPersonas()//este metodo se hace directo del formulario a la base de datos
{
    //devuelve un arreglo con todas las personas de la base de datos
}
public String nombres, apellidos, telefono, segundoTelefono, direccion, estado, genero, correo;
public Date fechaNacimiento;
public int codigo;
}
