
package Punto5;

import java.util.Scanner;

/*Escriba un programa en Java que lea un carácter e imprima su correspondiente valor numérico (utilizar la conversión
*de tipos)
*/

public class punto5 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Ingrese un carácter: ");
        char c = entrada.next().charAt(0);
        
        int numvalor=(int)c;
        System.out.println("Valor númerico: "+numvalor);
        
}
}
