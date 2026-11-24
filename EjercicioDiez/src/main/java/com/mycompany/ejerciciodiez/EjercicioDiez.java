/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciodiez;
/**
* @author Jordyn Josue Soledispa Urgilez
*/
import java.util.Scanner;
 
public class EjercicioDiez {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
 
       int[][] matriz = new int[3][5];
 
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 5; j++) {
               System.out.print("Ingrese el valor de la fila "
                       + (i + 1) + " columna " + (j + 1) + ": ");
 
               int numero = sc.nextInt();
 
               matriz[i][j] = numero + ((i + 1) * (j + 1));
           }
       }
 
       System.out.println("\nMatriz modificada:");
 
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 5; j++) {
               System.out.print(matriz[i][j] + "\t");
           }
           System.out.println();
       }
   }
}
