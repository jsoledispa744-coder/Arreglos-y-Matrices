/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciodos;

/**
* @author Jordyn Josue Soledispa Urgilez
*/
import java.util.Scanner;
 
public class EjercicioDos {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
 
       double[] numeros = new double[10];
       double suma = 0;
       double promedio;
 
       for (int i = 0; i < 10; i++) {
           System.out.print("Ingrese el numero " + (i + 1) + ": ");
           numeros[i] = sc.nextDouble();
 
           suma = suma + numeros[i];
       }
 
       promedio = suma / 10;
 
       System.out.println("\nSuma total: " + suma);
       System.out.println("Promedio: " + promedio);
   }
}