
package Punto6;

import java.util.Scanner;

/*Desarrolle un programa en java que calcule el índice de masa corporal BMI el cual está dado por la formula (pesoenKg
*alturaenmetros*alturaenmetros)
*/

public class punto6 {
  
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Ingrese su peso en Kg: ");
        float p = entrada.nextFloat();
        System.out.print("Ingrese su altura en cm: ");
        float h = entrada.nextFloat();
        
        h= h/100;
        
        System.out.printf("BMI: %.2f%n",calculoBMI(p,h));
    }
        
        public static float calculoBMI(float a, float b){
        return a/(b*b);
    }
        
}

