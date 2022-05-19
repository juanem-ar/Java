package com.gm.mundopc;

/**
 *
 * @author Juan
 */
public class Teclado extends DispositivoEntrada{
    
//    ATRIBUTOS
    private final int idTeclado;
    private static int contadorTeclados;
    
//    CONSTRUCTOR

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }
    
//    METODOS

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + this.idTeclado + ", " + super.toString() + '}';
    }
    
    
    
    
}
