/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */
package ejercicio10;
import java.util.Scanner;

public class Ejercicio10 {

    
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
     
        System.out.println("INGRESE EL VALOR MAXIMO");
        int num = leer.nextInt();
        int aux = 0;
        
        do{
            System.out.println("ingrese un numero");
           int num2 = leer.nextInt();
           
           aux = num2 + aux; 
            
        }
        while( num > aux );
        
    }
    
}
