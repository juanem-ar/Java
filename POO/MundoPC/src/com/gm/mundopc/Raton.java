package com.gm.mundopc;

/**
 *
 * @author Juan
 */
public class Raton extends DispositivoEntrada{
    
//    ATRIBUTOS
    private final int idRaton;
    private static int contadorRatones;
    
//    CONSTRUCTOR
    
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }
    
//    METODOS

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + this.idRaton + ", "+ super.toString() +'}';
    }
    
    
}
