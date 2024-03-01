/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.taller;

public class MaximoMinimoAleatorio {

    public static void main(String[] args) {
 int[] numeros = new int[10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        // Generar números aleatorios y encontrar el máximo y el mínimo
        System.out.println("Números generados aleatoriamente:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = (int) (Math.random() * 900) + 100; // Generar números entre 100 y 999
            System.out.println(numeros[i]);

            maximo = Math.max(maximo, numeros[i]);
            minimo = Math.min(minimo, numeros[i]);
        }

        // Mostrar los números junto con "máximo" y "mínimo"
        System.out.println("Números con 'máximo' y 'mínimo':");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i]);
            if (numeros[i] == maximo) {
                System.out.print(" máximo");
            } else if (numeros[i] == minimo) {
                System.out.print(" mínimo");
            }
            System.out.println();
        }    }
}