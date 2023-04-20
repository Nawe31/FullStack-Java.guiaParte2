/*

 */
package ejercicio11;
import java.util.Scanner;

public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       char resp = 'n';

        
        do{
            
            System.out.println("INGRESE UN NUMERO POR PANTALLA");
        int num = leer.nextInt();
        
         System.out.println("INGRESE UN NUMERO POR PANTALLA");
        int num2 = leer.nextInt();
            
              System.out.println("  MENU ");
        System.out.println("  -SUMAR- 1. ");
        System.out.println("  -RESTAR- 2. ");
        System.out.println("  -MULTIPLICAR- 3. ");
        System.out.println("  -DIVIDIR- 4. ");
        System.out.println("  -SALIR- 5.  ");
        System.out.println("  ELIJA OPCION  ");
        
          int respuesta = leer.nextInt();
         
            
       switch (respuesta)
       {
           case 1 :
               System.out.println(" La suma es: " + (num + num2));
               break;
           case 2 :
               System.out.println(" La resta es: " + (num - num2));
               break;
            case 3 :
               System.out.println(" La ultiplicacion es:  " + (num + num2));
               break;
            case 4 :
               System.out.println(" La divicion es: " + (num / num2));
               break;
            case 5 :
                System.out.println(" esta seguiro que sea salir? S/N");
                 	resp=leer.next().charAt(0);
               break;}              
               
                 
       }while( resp =='n' || resp == 'N' );
                 
                      System.out.println(" Hasta luego :D");
                     
       
       }
}
