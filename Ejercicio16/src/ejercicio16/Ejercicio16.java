/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package ejercicio16;
import java.util.Scanner;
import java.util.Random;
public class Ejercicio16 {

   
    public static void main(String[] args) {
        
  Scanner leer = new Scanner(System.in);
  
  Random azar = new Random();
        
        System.out.println(" ingrese el tamaño del vector");
        
        int num = leer.nextInt();
  
  
         int[] vector = new int[num];
         
        
        for (int i = 0; i < vector.length; i++) {
            
             vector[i] = azar.nextInt(10);
             
             
             
             System.out.print("["+ vector[i]+"]");
             
           }
        System.out.println(""); 
        
        System.out.println(" ingrese numero a buscar ");
        int num2 = leer.nextInt();
        
        for (int i = 0; i < vector.length; i++) {
            
            
            if ( vector[i] == num2) {
                
                System.out.println( num2 +" se encontro en tal posicion " + i);
                
            }
        }
        
    }
    
}
