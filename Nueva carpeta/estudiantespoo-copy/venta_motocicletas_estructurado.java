
/**
 * Write a description of class juan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class venta_motocicletas_estructurado
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int CBC = 7000000;
        int CMC = 13000000;
        int CAC = 20000000;
        
        double sumamotos, captotal;

        int A, C, D, E, BC, MC, AC; 
        String B;

        System.out.println("Ingrese el NOMBRE DEL ENCARGADO de ventas del mes:");
        B = scanner.nextLine();
        System.out.println("Ingrese IDENTIFICACIÓN en número sin espacios ni puntos del Encargado de ventas del mes:");
        A = scanner.nextInt();
        System.out.println("Tenga en cuenta que las motocicletas se dividen en:");
        System.out.println("BAJO CILINDRAJE que tienen un costo de 7000000");
        System.out.println("MEDIO CILINDRAJE que tienen un costo de 13000000");
        System.out.println("ALTO CILINDRAJE que tienen un costo de 20000000");
        System.out.println("");
        System.out.println("¿cuántas motocicletas de BAJO CILINDRAJE se vendieron en el mes?");
        C = scanner.nextInt();
        BC = CBC * C;
        System.out.println("El resultado es:" + BC);
         System.out.println("");
        System.out.println("¿cuántas motocicletas de MEDIO CILINDRAJE se vendieron en el mes?");
        D = scanner.nextInt();
        MC = CMC * D;
        System.out.println("El resultado es:" + MC);
         System.out.println("");
        System.out.println("¿cuántas motocicletas de ALTO CILINDRAJE se vendieron en el mes?");
        E = scanner.nextInt();
        AC = CAC * E;
        System.out.println("El resultado es:" + AC);

        sumamotos = C+D+E;
        captotal= BC+MC+AC;
        
        
        

        System.out.println("El total de motocicletas vendidas es: " + sumamotos);
        System.out.println("Nombre del cliente: " + B);
        System.out.println( B+ " el encargado de venta de motocicletas del mes, con identificación "+ A);
        System.out.println("entrega el total de motocicletas vendidas del mes de Junio");
        System.out.println(C+ "motocicleta de bajo cilindraje");
        System.out.println(D+ "motocicleta de medio cilindraje");
        System.out.println(E+ "motocicleta de alto cilindraje");
        System.out.println("");
        System.out.println("El promedio en capital de motocicletas vendidas es de: " +captotal);
        System.out.println(BC+ "en motocicleta de bajo cilindraje");
        System.out.println(MC+ "en motocicleta de medio cilindraje");
        System.out.println(AC+ "en motocicleta de alto cilindraje");
        

     
    
    }
}
