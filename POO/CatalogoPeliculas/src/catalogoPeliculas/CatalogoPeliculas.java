package catalogoPeliculas;

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.*;

/**
 *
 * @author Juan
 */
public class CatalogoPeliculas{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
        
        do{
            System.out.println("Elige la opción:");
            System.out.println("1.- Iniciar catálogo de películas/n2"
                    + ".- Agregar película/n"
                    + "3.- Listar películas/n4"
                    + ".- Buscar película/n"
                    + "0.- Salir");
            opcion = Integer.parseInt(scanner.nextLine());
            switch(opcion){
            case 1:
                catalogo.iniciarCatalogoPeliculas();
                break;
            case 2:
                System.out.println("Introduce el nombre de una película a agregar:");
                String nombrePelicula = scanner.nextLine();
                catalogo.agregarPelicula(nombrePelicula);
                break;
            case 3:
                catalogo.listarPelicula();
                break;
            case 4:
                System.out.println("Introduce el nombre de una película que quieres buscar:");
                String buscar = scanner.nextLine();
                catalogo.buscarPelicula(buscar);
                break;
        }
        }while(opcion != 0);
        System.out.println("Muchas gracias por elegirnos.");
    }
    
}
