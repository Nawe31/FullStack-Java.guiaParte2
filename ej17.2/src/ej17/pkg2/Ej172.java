/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej17.pkg2;

import java.util.Random;

/**
 *
 * @author nahue
 */
public class Ej172 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        int N = 1000; // tamaño del vector
        int[] numeros = new int[N];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10000); // generamos un número aleatorio de hasta 5 dígitos
        }

        int[] cantidades = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            int cantidadDigitos = String.valueOf(numero).length();
            if (cantidadDigitos <= 5) {
                cantidades[cantidadDigitos-1]++;
            }
        }

        for (int i = 0; i < cantidades.length; i++) {
            System.out.println("Cantidad de numeros de " + (i+1) + " digitos: " + cantidades[i]);
        }
    }
}

