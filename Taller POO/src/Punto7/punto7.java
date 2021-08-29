
package Punto7;

import java.util.Scanner;

/*Juan conoce el precio de compra y de venta de unos de los productos de su tienda y requiere conocer cuál es su % de
*utilidad. Desarrolle un programa en java que lo ayude con ese cálculo.
*/

public class punto7 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Ingrese el precio de compra del producto: ");
        int p1 = entrada.nextInt();
        System.out.print("Ingrese el precio de venta del producto: ");
        int p2 = entrada.nextInt();
        int p3=(int) (p2-p1);
        
    
        System.out.printf("El porcentaje de utilidad del producto es del: %.2f%n",porcentajeutil(p2,p3));
        
    }
        public static float porcentajeutil(float b, float c){
        return (c/b)*100;
        
        
}
}