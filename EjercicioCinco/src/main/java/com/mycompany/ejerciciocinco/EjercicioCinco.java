/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciocinco;

/**
* @author Jordyn Josue Soledispa Urgilez
*/
import java.util.Scanner;
 
public class EjercicioCinco {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
 
       int[] numeros = new int[12];
 
       for (int i = 0; i < 12; i++) {
           System.out.print("Ingrese un numero positivo: ");
           int numero = sc.nextInt();
 
           while (numero <= 0) {
               System.out.print("Ingrese un numero mayor que cero: ");
               numero = sc.nextInt();
           }
 
           numeros[i] = numero + i;
       }
 
       System.out.println("\nArreglo modificado:");
 
       for (int i = 0; i < 12; i++) {
           System.out.println("Posicion " + i + ": " + numeros[i]);
       }
   }
}