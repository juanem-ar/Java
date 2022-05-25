package mx.com.gm.peliculas.domain;

public class Pelicula{
      
//    ATRIBUTOS
    
    private String nombre;
    
//    CONSTRUCTORES

    public Pelicula(){
    }
    
    public Pelicula(String nombre){
        this.nombre = nombre;
    }
    
//    METODOS

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
}
