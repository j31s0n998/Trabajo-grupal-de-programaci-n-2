/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios1;

import java.util.Scanner;

/**
 *
 * @author TOÑO
 */
public class N3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite la longitud del primer cateto:");
        double c1 = scanner.nextDouble();

        System.out.println("Digite la longitud del segundo cateto:");
        double c2 = scanner.nextDouble();

        double h = calcularH(c1, c2);

        System.out.println("La longitud de la hipotenusa es: " + h);


    }

    public static double calcularH(double cateto1, double cateto2) {
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }
    
}
