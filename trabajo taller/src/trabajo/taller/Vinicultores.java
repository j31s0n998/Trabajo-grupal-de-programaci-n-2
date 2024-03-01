/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.taller;

import java.util.Scanner;


public class Vinicultores {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
     char tipoUva;
     int tamañoUva = 0;
     double precioInicial;
     double precioFinal;
        System.out.println("ingrese el tipo de uva que desea tenemos A y B");
        tipoUva= teclado.next().charAt(0);
        System.out.println("ingrese el tamaño de la uva que desea tenemos 1 y 2");
        tamañoUva= teclado.nextInt();
        if (tipoUva == 'A') {
            if (tamañoUva == 1) {
                precioInicial = 0.20;
            } else {
                precioInicial = 0.30;
            }
        } else if (tipoUva == 'B') {
            if (tamañoUva == 2) {
                precioInicial = -0.30;
            } else {
                precioInicial = -0.50;
            }
        } else {
            System.out.println("Tipo de uva inválido. Debe ser A o B.");
            return;
        }

        precioFinal = precioInicial * 3;
        System.out.println("El precio final que recibirá el productor por la uva entregada es: " + precioFinal);

        teclado.close();
    }
}

