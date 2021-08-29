
package Punto1;

/*Escriba un programa en java que lea dos datos de tipo entero, los almacene en dos variables num1 y num2, y ejecute
*las siguientes instrucciones, analice los resultados:
*a) System.out.printf(”x = %d\n", x );
*b) System.out.printf(“El valor de %d + %d es %d\n”, x, x, ( x + x ) );
*c) System.out.printf(“x=%.2f”, x );
*d) System.out.printf("%d - %d\n", ( x + y ), ( y + x ) );
*/

public class Punto1 {
    
    public static void main(String[] args) {
        int num1=8;
        int num2=18;
        
        System.out.printf("El valor de num1 es = %d\n", num1);
        System.out.printf("El valor de %d + %d es: %d\n", num1, num1, ( num1 + num1 ) );
        System.out.printf("%d - %d\n", ( num1 + num2 ), ( num2 + num1 ) );  
    }
}
