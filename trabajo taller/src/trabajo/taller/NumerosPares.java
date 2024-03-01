/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.taller;

import java.util.Scanner;


public class NumerosPares {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int numero1 = teclado.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = teclado.nextInt();

        System.out.println("Números pares entre " + numero1 + " y " + numero2 + ":");
        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        teclado.close();
    }
}