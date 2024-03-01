/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.taller;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinarNumero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        
        int numeroAdivinar = random.nextInt(100) + 1;
        int intentos = 10;

        System.out.println("Bienvenido al juego de adivinar el número. Tienes 10 intentos.");

        while (intentos > 0) {
            System.out.println("Introduce un número entre 1 y 100:");
            int numeroUsuario = teclado.nextInt();

            if (numeroUsuario == numeroAdivinar) {
                System.out.println("¡Felicidades! ¡Has adivinado el número en " + (11 - intentos) + " intentos!");
                break;
            } else if (numeroUsuario < numeroAdivinar) {
                System.out.println("El número a adivinar es mayor. Te quedan " + (--intentos) + " intentos.");
            } else {
                System.out.println("El número a adivinar es menor. Te quedan " + (--intentos) + " intentos.");
            }
        }

        if (intentos == 0) {
            System.out.println("Lo siento, te has quedado sin intentos. El número a adivinar era: " + numeroAdivinar);
        }

        teclado.close();
    }
}
