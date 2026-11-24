/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciouno;

/**
* @author Jordyn Josue Soledispa Urgilez
*/
import java.util.Scanner;
 
public class EjercicioUno {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
 
       int[] numeros = new int[10];
 
       for (int i = 0; i < 10; i++) {
           System.out.print("Ingrese el numero de la posicion " + i + ": ");
           numeros[i] = sc.nextInt();
       }
 
       System.out.println("\nNumeros almacenados:");
 
       for (int i = 0; i < 10; i++) {
           System.out.println("Posicion " + i + ": " + numeros[i]);
       }
   }
}