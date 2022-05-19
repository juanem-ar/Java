package com.gm.mundopc;

/**
 *
 * @author Juan
 */
public class Monitor {
    
//    ATRIBUTOS
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;
    
//    CONSTRUCTORES
    
    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    
    public Monitor(String marca, double tamanio){
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }
    
//    MÉTODOS
    
    public int getIdMonitor() {
        return this.idMonitor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public void setTamaño(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + this.idMonitor + ", marca=" + this.marca + ", tama\u00f1o=" + this.tamanio + '}';
    }
    
}
