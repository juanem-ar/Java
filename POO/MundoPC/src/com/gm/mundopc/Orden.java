package com.gm.mundopc;

/**
 *
 * @author Juan
 */
public class Orden {
    
//    ATRIBUTOS
    
    private int idOrden;
    private Computadora computadoras[];
    private int contadorComputadoras;
    private final static int MAX_COMPUTADORAS = 10;
    private static int contadorOrdenes;
    
//    CONSTRUCTORES
    
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
//    METODOS
    
    public void agregarComputadora(Computadora computadora){
        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        }else{
            System.out.println("Se ha alcanzado el límite máximo de computadoras.\nLímite: " + Orden.MAX_COMPUTADORAS);
        }
    }
    
    public void mostrarOrden(){
        System.out.println("Id de Orden: " + this.idOrden + "\nDetalle de Computadoras:\n\n");
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println("Computadora n°" + (i+1) + ": " + computadoras[i].toString());
        }
    }
}
