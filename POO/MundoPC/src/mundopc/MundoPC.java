package mundopc;

import com.gm.mundopc.*;
/**
 *
 * @author Juan
 */
public class MundoPC {
    public static void main(String[] args) {
        
        Teclado tecladoLOGI = new Teclado("CABLE", "LOGI");
        Teclado tecladoGENIUS = new Teclado("USB", "GENIUS");
        
        Raton ratonLOGI = new Raton("CABLE", "LOGI");
        Raton ratonGENIUS = new Raton("USB", "GENIUS");
        
        Monitor monitorHP = new Monitor("HP", 13);
        Monitor monitorLG = new Monitor("LG", 15);
        
        Computadora pc1 = new Computadora("PC Gamer", monitorHP , tecladoLOGI, ratonGENIUS);
        Computadora pc2 = new Computadora("PC Escritorio", monitorLG , tecladoGENIUS, ratonLOGI);
        Computadora pc3 = new Computadora("PC", monitorHP , tecladoLOGI, ratonGENIUS);
        Computadora pc4 = new Computadora("Notebook", monitorLG , tecladoGENIUS, ratonLOGI);
        Computadora pc5 = new Computadora("Nodebook", monitorHP , tecladoLOGI, ratonGENIUS);
        Computadora pc6 = new Computadora("PC All-in", monitorLG , tecladoGENIUS, ratonLOGI);
        Computadora pc7 = new Computadora("PC Yani", monitorHP , tecladoLOGI, ratonGENIUS);
        Computadora pc8 = new Computadora("PC Juan", monitorLG , tecladoGENIUS, ratonLOGI);
        Computadora pc9 = new Computadora("Computadora", monitorLG , tecladoGENIUS, ratonLOGI);
        Computadora pc10 = new Computadora("Compus", monitorHP , tecladoLOGI, ratonGENIUS);
        Computadora pc11 = new Computadora("Super PC", monitorLG , tecladoGENIUS, ratonLOGI);
        
        Orden ordenNueva = new Orden();
        
        ordenNueva.agregarComputadora(pc1);
        ordenNueva.agregarComputadora(pc2);
        ordenNueva.agregarComputadora(pc3);
        ordenNueva.agregarComputadora(pc4);
        ordenNueva.agregarComputadora(pc5);
        ordenNueva.agregarComputadora(pc6);
        ordenNueva.agregarComputadora(pc7);
        ordenNueva.agregarComputadora(pc8);
        ordenNueva.agregarComputadora(pc9);
        ordenNueva.agregarComputadora(pc10);
        
        ordenNueva.mostrarOrden();
        
    }
}
