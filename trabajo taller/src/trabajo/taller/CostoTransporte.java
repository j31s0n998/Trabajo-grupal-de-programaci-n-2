/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.taller;

import java.util.Scanner;


public class CostoTransporte {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int zona;
        double peso;
        double costoKilogramo;
        double costoTotal;

        System.out.println("Ingrese la zona de destino:");
        System.out.println("1. América del Norte");
        System.out.println("2. América Central");
        System.out.println("3. América del Sur");
        System.out.println("4. Europa");
        System.out.println("5. Asia");
        zona = teclado.nextInt();

        if (zona < 1 || zona > 5) {
            System.out.println("Zona de destino inválida. El paquete será rechazado.");
            return;
        }

        System.out.println("Ingrese el peso del paquete en kilogramos:");
        peso = teclado.nextDouble();

        if (peso > 5) {
            System.out.println("El peso del paquete excede el límite permitido. El paquete será rechazado.");
            return;
        }

        switch (zona) {
            case 1:
                costoKilogramo = 24.00;
                break;
            case 2:
                costoKilogramo = 20.00;
                break;
            case 3:
                costoKilogramo = 21.00;
                break;
            case 4:
                costoKilogramo = 10.00;
                break;
            case 5:
                costoKilogramo = 18.00;
                break;
            default:
                costoKilogramo = 0.00;
        }

        costoTotal = peso * costoKilogramo;

        System.out.println("El costo total del envío es de " + costoTotal + " euros.");

        teclado.close();   
    }
}