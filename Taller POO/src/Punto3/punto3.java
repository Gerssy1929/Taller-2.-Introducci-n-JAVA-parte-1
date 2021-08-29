
package Punto3;

/*Escriba una aplicación que reciba tres valores decimales del usuario y muestre la suma, promedio, producto, cociente 
*y modulo. Los resultados se deben imprimir en formato decimal con dos cifras significativas.
*/
import java.util.Scanner;


public class punto3 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Ingrese el primer número:");
        float num1 = entrada.nextFloat();
        System.out.print("Ingrese el segundo número:");
        float num2 = entrada.nextFloat();
        System.out.print("Ingrese el tercer número:");
        float num3 = entrada.nextFloat();
        
        System.out.printf("Suma:%.2f%n",suma(num1,num2,num3));
        System.out.printf("Promedio:%.2f%n",promedio(num1,num2,num3));
        System.out.printf("Producto:%.2f%n",producto(num1,num2,num3));
        System.out.printf("Cociente:%.2f%n",cociente(num1,num2,num3));
        System.out.printf("Módulo:%.2f%n",modulo(num1,num2,num3));
    }
    
    public static float suma(float a, float b, float c){
        return a + b + c;
    }
    
    public static float promedio(float a, float b, float c){
        return (a+b+c)/3;
    }
    
    public static float producto (float a, float b, float c){
        return a * b * c;
    }
    
    public static float cociente (float a, float b, float c){
        return a / b / c;
    }
    
    public static float modulo (float a, float b, float c){
        return a % b % c;
    }
}
