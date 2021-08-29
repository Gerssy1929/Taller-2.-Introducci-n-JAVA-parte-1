
package Punto4;

/*Escriba un programa en Java que le solicite al usuario el valor del radio de una circunferencia y calcule su longitud y 
*área. Imprima los resultados (con dos números decimales)
*/
import java.util.Scanner;


public class punto4 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Ingrese el valor del radio de la circuferencia(m):");
        double r = entrada.nextDouble();
        
        
        System.out.printf("Longitud de la circunferencia(m):%.2f%n",longitud(r));
        System.out.printf("área de la circunferencia(m):%.2f%n",area(r));
        
    }
    
    public static double longitud(double a){
        return (2*3.1415)*a;
    }
    
    public static double area (double a){
        return 3.1415*(a*a);
    }
}
    
    
