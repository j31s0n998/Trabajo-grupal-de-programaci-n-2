/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.taller;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class MaximoMinimo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        // Leer los números por teclado y encontrar el máximo y el mínimo
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = teclado.nextInt();
            maximo = Math.max(maximo, numeros[i]);
            minimo = Math.min(minimo, numeros[i]);
        }

        // Mostrar los números junto con "máximo" y "mínimo"
        System.out.println("Números introducidos:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i]);
            if (numeros[i] == maximo) {
                System.out.print(" máximo");
            } else if (numeros[i] == minimo) {
                System.out.print(" mínimo");
            }
            System.out.println();
        }

        teclado.close();    }
}