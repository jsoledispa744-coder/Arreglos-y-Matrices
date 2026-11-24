/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioocho;

/**
* @author Jordyn Josue Soledispa Urgilez
*/
import java.util.Scanner;
 
public class EjercicioOcho {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
 
       int[][] matriz = new int[4][4];
       int suma = 0;
 
       for (int i = 0; i < 4; i++) {
           for (int j = 0; j < 4; j++) {
               System.out.print("Ingrese el valor de la fila "
                       + (i + 1) + " columna " + (j + 1) + ": ");
               matriz[i][j] = sc.nextInt();
           }
       }
 
       System.out.println("\nDiagonal principal:");
 
       for (int i = 0; i < 4; i++) {
           System.out.println(matriz[i][i]);
           suma = suma + matriz[i][i];
       }
 
       System.out.println("Suma de la diagonal principal: " + suma);
   }
}
