/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.taller;

import java.util.Scanner;


public class Inverso {

    public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = teclado.nextInt();
        }

        System.out.println("Los números en orden inverso son:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        teclado.close();    }
}
