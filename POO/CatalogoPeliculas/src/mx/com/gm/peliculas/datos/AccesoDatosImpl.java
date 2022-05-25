package mx.com.gm.peliculas.datos;

import java.io.*;
import java.util.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;
/**
 *
 * @author Juan
 */
public class AccesoDatosImpl implements IAccesoDatos{

    @Override
    public boolean existe(String nombreArchivo)// throws AccesoDatosEx 
    {
        
        File archivo = new File(nombreArchivo);
        
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
        
        File archivo = new File(nombreArchivo);
        List<Pelicula> pelis =new ArrayList<>();
        
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = entrada.readLine();
            while(linea!= null){
                Pelicula pelicula = new Pelicula(linea);
                pelis.add(pelicula);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al listar peliculas: " +ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al listar peliculas: " +ex.getMessage());
        }
         return pelis;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, Boolean anexar) throws EscrituraDatos {
        
        File archivo = new File(nombreArchivo);
        
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("Se ha escrito informacion al archivo: " + pelicula);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new EscrituraDatos("Excepcion al escribir peliculas");
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
        
        File archivo = new File(nombreArchivo);
        String resultado = null;
        try {
            
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura= entrada.readLine();
            int indice = 1;
            while ( lectura != null){
                if(buscar != null && buscar.equalsIgnoreCase(lectura)){
                    resultado = "La Película encontrada es: " + lectura + " y su índice es: " + indice;
                    break;
                }else{
                  lectura = entrada.readLine();
                  indice++;
                }
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al listar peliculas: " +ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al listar peliculas: " +ex.getMessage());
        }
        return resultado;

    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo.");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            throw new AccesoDatosEx("Excepcion al crear el archivo: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new AccesoDatosEx("Excepcion al crear el archivo: " + ex.getMessage());
        }
    }

    @Override
//    al no arrojar una excepcion el metodo, se puede obviar desde la declaración del método.
    public void borrar(String nombreArchivo) //throws AccesoDatosEx 
    {
        File archivo = new File(nombreArchivo);
        if (archivo.exists())
            archivo.delete();
        System.out.println("Se ha borrado el archivo.");
        
    }
    
}
