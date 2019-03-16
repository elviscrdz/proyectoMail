package controlador;

import java.util.Date;
import modelo.Base_Datos;

public class Asistencia{
public Asistencia()
{
    id=0;
    codigo=0;
    fecha=null;
}    
public void crearRegistro()
{
    Base_Datos BaseDatos=new Base_Datos();
    BaseDatos.sentencia_asistenciaNueva(codigo, fecha);
}
public class listaAsistencia extends Asistencia{
    Object objeto=new Object();
    public Object listaAsistencia(){
        Object objeto=new Object();
        return objeto;
    }
}
public int codigo, id;
public Date fecha;
}
