
package Punto9;

import java.util.Scanner;

/*Se desea construir un programa en java que permita calcular el costo total de un viaje que tiene una duración en días.
*Para ello, se requiere los siguientes datos: Número de días del viaje, Total de kilómetros conducidos por día, costo por
*litro de gasolina, promedio de kilometro por litro de gasolina, pago por estacionamiento por día, pago de peajes por día.
*Imprima en consola el resultado.
*/

public class punto9 {
    
    public static void main(String[] args) {
        
        int gasoldia, adic;
        float kml = 12;
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Ingrese el N° de dias de viaje: ");
        int dias = entrada.nextInt();
        System.out.print("Ingrese los Km conducidos por día: ");
        float km = entrada.nextFloat();
        System.out.print("Ingrese el costo del litro de gasolina: ");
        int gaso = entrada.nextInt();
        System.out.print("Km recorridos por litro de gasolina: 12\n");
        System.out.print("Ingrese el costo de estacionamiento por día: ");
        int est = entrada.nextInt();
        System.out.print("Ingrese el costo de peaje por día: ");
        int peaje = entrada.nextInt();
        
        gasoldia= (int) ((km/kml)*gaso);
        adic=est+peaje;
        
        System.out.printf("El costo total del viaje es de :%d%n",costoviaje(dias,gasoldia,adic));
     }
    
   public static int costoviaje (int a, int g, int h){
        return (g+h)*a;
}
}
