
package Punto10;

import java.util.Scanner;

/*Escriba un programa en Java que lea el peso de un objeto (en kilogramos) e imprima su equivalencia en: gramos, libras,
*toneladas.
*/

public class punto10 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Ingrese el peso del objeto en Kg: ");
        Float p = entrada.nextFloat();
        
        System.out.printf("Gramos: %.0f%n",gramos(p));
        System.out.printf("Libras: %.2f%n",libras(p));
        System.out.printf("Toneladas: %.3f%n",toneladas(p));
    }
    
     public static float gramos(float a){
        return a*1000;
    }
    
    public static double libras(double a){
        return a*2.20462;
    }
    
    public static float toneladas(float a){
        return a/1000;
    }
}
