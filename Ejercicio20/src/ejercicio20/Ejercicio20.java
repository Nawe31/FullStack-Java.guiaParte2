/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package ejercicio20;

import java.util.Scanner;


public class Ejercicio20 {

  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        
        while ( num < 3){
            System.out.println("ingrese un numero mayor igual que 3");
           
            num = leer.nextInt();
        }
        
        int constM = (num*( num * num + 1))/2;
        
        int [][] matriz = new int [num][num];
        
        System.out.print(" ingrese los numeros");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
              
               matriz [i][j] = leer.nextInt();
                   
            }
          
            
        }
        
        System.out.println("");
        
       for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
              
                System.out.print("["+ matriz[i][j]+"]");
                   
            }
            System.out.println("");
            
        }
        
         int []SumaFila = new int [num];
         int []SumaColumna = new int [num];
        int sumaF = 0;
        int sumaC = 0;
        int sumaD1 = 0;
        int sumaD2 = 0;
        
        
        for (int i = 0; i < num; i++) {
           
             for (int j = 0; j < num; j++) {
                 
                sumaF = sumaF+ matriz[i][j];
                
                if(i == j){
                
                    sumaD1 = sumaD1 + matriz[i][j];                   
                }
            }
             SumaFila[i] = sumaF;
             sumaF=0;
             
            }
        
             for (int j = 0; j < num; j++) {
           
             for (int i = 0; i < num; i++) {
                 
                sumaC = sumaC+ matriz[i][j];
                
               if ( i + j == (num-1)){
               
                    sumaD2 = sumaD2 + matriz[i][j];  
                   
               }
               
            }
             SumaColumna[j] = sumaC;
             sumaC=0;
             
            }
        
       int respuesta = 0;
             
        for (int i = 0; i < num; i++) {
            
            if(SumaFila[i] == constM && sumaD1 == constM && sumaD2 == constM && SumaColumna[i] == constM){
                
              respuesta ++;
                
                
               }
            
        }
        
      
        if ( respuesta == num){
        
            System.out.println(" es una matriz magica ");
            
        }else{
            System.out.println(" no es un cuadrado magico");
        }
        
    }
    
}
