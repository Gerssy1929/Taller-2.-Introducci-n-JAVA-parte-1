/*
Desarrolle un programa en java que lea una cantidad numérica entre cero y mil (0 y 1000) e imprima la cifra
correspondiente a sus unidades, decenas y centenas
 */
package Punto11;

import java.util.Scanner;


public class punto11 {
    
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        
        int num,unidad,decena,centena,resul;
        System.out.print("Ingrese su número de 3 cifras: ");
        num = Integer.parseInt(ingreso.next());
        centena = num /100;
        resul = num - (centena * 100);
        decena = resul / 10;
        unidad = resul- (decena * 10);
        System.out.println("Unidades : "+unidad);
        System.out.println("Decenas : "+decena);
        System.out.println("Centenas : "+centena);
    }
    }
