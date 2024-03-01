/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

public class ClasificacionNumeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números a introducir:");
        int cantidadNumeros = teclado.nextInt();

        int mayoresCero = 0;
        int menoresCero = 0;
        int igualesCero = 0;

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ":");
            int numero = teclado.nextInt();

            if (numero > 0) {
                mayoresCero++;
            } else if (numero < 0) {
                menoresCero++;
            } else {
                igualesCero++;
            }
        }

        System.out.println("Cantidad de números mayores que 0: " + mayoresCero);
        System.out.println("Cantidad de números menores que 0: " + menoresCero);
        System.out.println("Cantidad de números iguales a 0: " + igualesCero);

        teclado.close();
    }
}