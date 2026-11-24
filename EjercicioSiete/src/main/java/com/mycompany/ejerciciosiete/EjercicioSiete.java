/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosiete;


/**
* @author Jordyn Josue Soledispa Urgilez
*/
import java.util.Scanner;
 
public class EjercicioSiete {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
 
       int[][] matriz = new int[4][4];
       int suma = 0;
 
       for (int i = 0; i < 4; i++) {
           for (int j = 0; j < 4; j++) {
               System.out.print("Ingrese el valor de la fila "
                       + (i + 1) + " columna " + (j + 1) + ": ");
               matriz[i][j] = sc.nextInt();
 
               suma = suma + matriz[i][j];
           }
       }
 
       System.out.println("\nSuma total de los elementos: " + suma);
   }
}