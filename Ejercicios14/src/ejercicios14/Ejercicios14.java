/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package ejercicios14;
import java.util.Scanner;
public class Ejercicios14 {

  
    public static void main(String[] args) {
    
       Scanner leer = new Scanner(System.in);
        
        System.out.println(" ingrese monto en euros");
        double euro = leer.nextDouble();
        
        respuestaDolar(euro);
        respueslibras(euro);
        respuestayenes(euro);
        
       
    }
    
   
     public static void respuestaDolar (  double euro) {
         
         System.out.println(" la cantidad de euros es " + euro + " y el pasaje a dolar seria "+ (euro * 1.2861));
         
     }
     
      public static void respuestayenes ( double euro) {
         
         System.out.println(" la cantidad de euros es " + euro + " y el pasaje a yenes seria "+ (euro * 129.852));
         
     }
      
         public static void respueslibras ( double euro) {
         
         System.out.println(" la cantidad de euros es " + euro + " y el pasaje a libras es seria "+ (euro * 1.28611));
         
     }
}
