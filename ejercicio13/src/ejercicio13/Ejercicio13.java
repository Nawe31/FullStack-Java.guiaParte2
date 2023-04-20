/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package ejercicio13;
import java.util.Scanner;

public class Ejercicio13 {

   
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    
        System.out.println(" ingrese un numero");
        int num = leer.nextInt();
        
      
   
           
            
            for (int i = 1; i < num+1; i++) {
                
                for (int j = 1; j < num+1; j++) {
                    
                    
                    
                    if ( i == 1 || i == num || j == 1 || j == num){
                    
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" "); 
                   }
                    
                }
                System.out.println(" ");
            }
          
            
            
           
        
        
         
      
        
   
    }}
    

