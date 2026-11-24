/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciotres;
/**
* @author Jordyn Josue Soledispa Urgilez
*/
import java.util.Scanner;
 
public class EjercicioTres {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
 
       int[] numeros = new int[15];
       int mayor, menor;
       int posicionMayor = 0;
       int posicionMenor = 0;
 
       for (int i = 0; i < 15; i++) {
           System.out.print("Ingrese el numero " + (i + 1) + ": ");
           numeros[i] = sc.nextInt();
       }
 
       mayor = numeros[0];
       menor = numeros[0];
 
       for (int i = 1; i < 15; i++) {
           if (numeros[i] > mayor) {
               mayor = numeros[i];
               posicionMayor = i;
           }
 
           if (numeros[i] < menor) {
               menor = numeros[i];
               posicionMenor = i;
           }
       }
 
       System.out.println("\nNumero mayor: " + mayor);
       System.out.println("Posicion del mayor: " + posicionMayor);
       System.out.println("Numero menor: " + menor);
       System.out.println("Posicion del menor: " + posicionMenor);
   }
}