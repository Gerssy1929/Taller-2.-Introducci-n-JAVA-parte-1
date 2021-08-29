
package Punto2;

/*Escriba una aplicación que pida al usuario que escriba dos enteros, que obtenga los números del usuario e imprima la 
*suma, producto, diferencia de los números.
*/
import java.util.Scanner;

public class punto2 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Ingrese el primer número:");
        int num1 = entrada.nextInt();
        System.out.print("Ingrese el segundo número:");
        int num2 = entrada.nextInt();
        
        System.out.printf("Suma:%d%n",suma(num1,num2));
        System.out.printf("Producto:%d%n",producto(num1,num2));
        System.out.printf("Diferencia:%d%n",diferencia(num1,num2));
        
    }
    
    
    public static int suma(int a, int b){
        return a + b;
    }
    
    public static int producto(int a, int b){
        return a * b;
    }
    
    public static int diferencia(int a, int b){
        return a - b;
    }
    
    }
 
