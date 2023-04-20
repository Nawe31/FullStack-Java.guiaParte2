/*

 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa).

 */

package ejercicio18;
import java.util.Random;
import java.util.Scanner;


public class Ejercicio18 {

     public static void main(String[] args) {
         
         Random azar = new Random();
         
         int [][] matriz = new int [4][4];
         
         for (int i = 0; i < 4; i++) {
             
             for (int j = 0; j < 4; j++) {
                 
                 matriz [i][j] = azar.nextInt(9);
                 
                 System.out.print("["+ matriz[i][j]+"]");
             }
             
             System.out.println("");
             
         }
         
          System.out.println("");
         
         for (int j = 0; j < 4; j++) {
         
             for (int i = 0; i < 4; i++) {
                 
                 
             System.out.print("["+ matriz[i][j]+"]");
                 
             }
             
              System.out.println("");
             
         }
         
 
    }
    
}
