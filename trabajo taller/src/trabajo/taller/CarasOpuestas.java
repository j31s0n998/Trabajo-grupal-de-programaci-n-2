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
public class CarasOpuestas {

    public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
        int resultadoDado;

        System.out.println("Ingrese el resultado obtenido al lanzar el dado:");
        resultadoDado = teclado.nextInt();

        if (resultadoDado >= 1 && resultadoDado <= 6) {
            String caraOpuesta;
            switch (resultadoDado) {
                case 1:
                    caraOpuesta = "6";
                    break;
                case 2:
                    caraOpuesta = "5";
                    break;
                case 3:
                    caraOpuesta = "4";
                    break;
                case 4:
                    caraOpuesta = "3";
                    break;
                case 5:
                    caraOpuesta = "2";
                    break;
                default: 
                    caraOpuesta = "1";
            }
            System.out.println("La cara opuesta al resultado " + resultadoDado + " es: " + caraOpuesta);
        } else {
            System.out.println("ERROR: número incorrecto");
        }

        teclado.close();    }
}
