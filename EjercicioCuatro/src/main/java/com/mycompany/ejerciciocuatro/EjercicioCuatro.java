/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciocuatro;

/**
* @author Jordyn Josue Soledispa Urgilez
*/
import java.util.Scanner;
 
public class EjercicioCuatro {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
 
       int[] numeros = new int[20];
       int cantidadPares = 0;
       int cantidadImpares = 0;
       int sumaPares = 0;
       int sumaImpares = 0;
 
       for (int i = 0; i < 20; i++) {
           System.out.print("Ingrese el numero " + (i + 1) + ": ");
           numeros[i] = sc.nextInt();
 
           if (numeros[i] % 2 == 0) {
               cantidadPares++;
               sumaPares = sumaPares + numeros[i];
           } else {
               cantidadImpares++;
               sumaImpares = sumaImpares + numeros[i];
           }
       }
 
       System.out.println("\nCantidad de pares: " + cantidadPares);
       System.out.println("Cantidad de impares: " + cantidadImpares);
       System.out.println("Suma de pares: " + sumaPares);
       System.out.println("Suma de impares: " + sumaImpares);
   }
}