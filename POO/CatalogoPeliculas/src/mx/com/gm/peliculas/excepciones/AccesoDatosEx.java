package mx.com.gm.peliculas.excepciones;

/**
 *
 * @author Juan
 */
public class AccesoDatosEx extends Exception{
//    CREAMOS EL CONSTRUCTOR PROPAGANDO EL MENSAJE A LA CLASE PADRE
    public AccesoDatosEx(String mensaje){
        super(mensaje);
    }
    
}
