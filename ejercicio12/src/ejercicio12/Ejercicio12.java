/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package ejercicio12;
import java.util.Scanner;


public class Ejercicio12 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
         String cadena = "";
         int cont2 = 0;
         int cont3 = 0;
        
        do{
            
            
            System.out.println("ingrese una frace");
            String frace = leer.next();
            cadena = frace;
            
            
            if ( (frace.length() == 5)  && (frace.substring(0,1).equals("x")) && ( frace.substring(4,5).equals("n"))){
                
                cont2 = cont2 + 1; 
            }
            
            else {
            cont3 = cont3 + 1; 
                System.out.println(frace.length()+","+ frace.substring(0,1)+","+ frace.substring(4,5) );
            }
            
            
            
            
        }while(!cadena.equals("&&&&&"));
        
        System.out.println(" la cantidad de fraces postivas son " + cont2);
         System.out.println(" la cantidad de fraces negativas son " + cont3);
        
        
     
    }
    
}
