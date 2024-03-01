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
public class Llamada {

    public static void main(String[] args) {
   Scanner teclado  = new Scanner(System.in);
        int duracionLlamada;
        char diaSemana;
        char turno;

        System.out.println("Ingrese la duración de la llamada en minutos:");
        duracionLlamada = teclado.nextInt();

        double costoLlamada = 0.0;
        if (duracionLlamada <= 5) {
            costoLlamada = 1.0;
        } else if (duracionLlamada <= 8) {
            costoLlamada = 1.0 + (duracionLlamada - 5) * 0.8;
        } else if (duracionLlamada <= 10) {
            costoLlamada = 1.0 + 3 * 0.8 + (duracionLlamada - 8) * 0.7;
        } else {
            costoLlamada = 1.0 + 3 * 0.8 + 2 * 0.7 + (duracionLlamada - 10) * 0.5;
        }

        System.out.println("Ingrese el día de la semana (D para domingo, L para lunes, M para martes, etc.):");
        diaSemana = teclado.next().charAt(0);

        System.out.println("Ingrese el turno de la llamada (M para mañana, T para tarde):");
        turno = teclado.next().charAt(0);

        double impuesto = 0.0;
        if (diaSemana == 'D') {
            impuesto = costoLlamada * 0.03;
        } else {
            if (turno == 'M') {
                impuesto = costoLlamada * 0.15;
            } else {
                impuesto = costoLlamada * 0.10;
            }
        }

        double totalPagar = costoLlamada + impuesto;

        System.out.println("El costo de la llamada es: " + costoLlamada + " euros");
        System.out.println("El impuesto a pagar es: " + impuesto + " euros");
        System.out.println("El total a pagar es: " + totalPagar + " euros");

       teclado.close();    }
}
