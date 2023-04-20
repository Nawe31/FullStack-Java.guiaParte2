/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejercicios17;
import java.util.Random;
import java.util.Scanner;

public class Ejercicios17 {

    
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        Random azar = new Random();
        
        System.out.println("ingrese el tamaño del vector");
        int num = leer.nextInt();
        
        int [] vector = new  int[num];
        
        int j,z,x,y,a,b;
        j=0;
        z=0; 
        x=0;
        y=0;
        a=0;
        b=0;
        
        for (int i = 0; i < vector.length; i++) {
            
            vector[i] = azar.nextInt(100000);
         
            String cadena = String.valueOf(vector[i]);
            
            int digito = cadena.length();
            
            
            if (digito ==1 ){
                
                j++;
            }
            else if (digito ==2 ){
                
                z++;
            }
            else if (digito ==3 ){
                
                x++;
            }
            else if (digito ==4 ){
                
                y++;
            }
            else if (digito ==5 ){
                
                a++;
            }
            else{
               b++;
            }   
        }
        
        
         System.out.println(" la cantitdad de numeron de un digito son " + j);
         System.out.println(" la cantitdad de numeros con dos digitos " + z);
         System.out.println(" la cantitdad de numeros con tres digitos " + x);
         System.out.println(" la cantitdad de numeros con cuatro digitos " + y);
         System.out.println(" la cantitdad de numeros con cinco digitos  " + a);
         System.out.println(" la cantitdad de numeros mayores a cinco digitos  " + b);
        
       
    }
    
}
