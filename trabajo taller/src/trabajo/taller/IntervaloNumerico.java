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
public class IntervaloNumerico {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        int limiteInferior, limiteSuperior;
        
        do {
            System.out.println("Ingrese el límite inferior del intervalo:");
            limiteInferior = teclado.nextInt();
            System.out.println("Ingrese el límite superior del intervalo:");
            limiteSuperior = teclado.nextInt();
            if (limiteInferior > limiteSuperior) {
                System.out.println("El límite inferior no puede ser mayor que el límite superior. Inténtelo de nuevo.");
            }
        } while (limiteInferior > limiteSuperior);

        int sumaIntervalo = 0;
        int numerosFueraIntervalo = 0;
        boolean numerosEnLimites = false;

        while (true) {
            System.out.println("Ingrese un número (0 para salir):");
            int numero = teclado.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero > limiteInferior && numero < limiteSuperior) {
                sumaIntervalo += numero;
            } else {
                numerosFueraIntervalo++;
            }

            if (numero == limiteInferior || numero == limiteSuperior) {
                numerosEnLimites = true;
            }
        }

        System.out.println("La suma de los números dentro del intervalo es: " + sumaIntervalo);
        System.out.println("Cantidad de números fuera del intervalo: " + numerosFueraIntervalo);
        if (numerosEnLimites) {
            System.out.println("Se introdujo algún número igual a los límites del intervalo.");
        } else {
            System.out.println("No se introdujo ningún número igual a los límites del intervalo.");
        }

        teclado.close();
    }
}