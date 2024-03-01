/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.taller;

import java.util.Scanner;


public class DiaWeek {

    public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);
        int numDia;

        System.out.println("Ingrese el número del día de la semana (del 1 al 7):");
        numDia = teclado.nextInt();

        switch (numDia) {
            case 1:
                System.out.println("El día correspondiente al número 1 es: Lunes");
                break;
            case 2:
                System.out.println("El día correspondiente al número 2 es: Martes");
                break;
            case 3:
                System.out.println("El día correspondiente al número 3 es: Miércoles");
                break;
            case 4:
                System.out.println("El día correspondiente al número 4 es: Jueves");
                break;
            case 5:
                System.out.println("El día correspondiente al número 5 es: Viernes");
                break;
            case 6:
                System.out.println("El día correspondiente al número 6 es: Sábado");
                break;
            case 7:
                System.out.println("El día correspondiente al número 7 es: Domingo");
                break;
            default:
                System.out.println("ERROR: número de día incorrecto");
        }

        teclado.close();    }
}