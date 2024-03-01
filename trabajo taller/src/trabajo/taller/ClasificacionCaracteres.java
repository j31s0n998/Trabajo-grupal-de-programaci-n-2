/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.taller;

import java.util.Scanner;


public class ClasificacionCaracteres {


   public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese un caracter (o presione espacio para terminar):");
            char caracter = teclado.next().charAt(0);

            if (caracter == ' ') {
                System.out.println("Programa terminado.");
                break;
            }

            if (esVocal(caracter)) {
                System.out.println("VOCAL");
            } else {
                System.out.println("NO VOCAL");
            }
        }

        teclado.close();
    }

    private static boolean esVocal(char c) {
        c = Character.toUpperCase(c); 

        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}