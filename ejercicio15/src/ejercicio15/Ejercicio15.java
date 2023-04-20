/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package ejercicio15;
import java.util.Random;
import java.util.Scanner;
 
public class Ejercicio15 {


    public static void main(String[] args) {
        
        int[] vector = new int[100];
        int i,k;
        
        System.out.println("------------VECTOR-------------");
        
        for ( i = 0; i < 100; i++) {
            vector[i] = i+1;
            
            System.out.println( "["+ vector[i]+ "]" );
        }
        System.out.println(" ");
        
         System.out.println("------------VECTOR A LA INVERA-------------");
        
            
        for ( i = vector.length-1; i > -1 ; i--) {
             System.out.println( "["+ vector[i]+ "]" );
        }
        System.out.println("");
        System.out.println("");
    }
         
        }
        
        







