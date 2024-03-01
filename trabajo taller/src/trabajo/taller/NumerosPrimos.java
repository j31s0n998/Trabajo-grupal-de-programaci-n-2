/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.taller;

import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de números primos a mostrar
        System.out.println("Ingrese la cantidad de números primos que desea mostrar:");
        int cantidadPrimos = scanner.nextInt();

        int contador = 0;
        int numero = 2;

        // Mostrar los números primos
        System.out.println("Los " + cantidadPrimos + " primeros números primos son:");
        while (contador < cantidadPrimos) {
            boolean esPrimo = true;
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.print(numero + " ");
                contador++;
            }
            numero++;
        }

        scanner.close();
    }
}