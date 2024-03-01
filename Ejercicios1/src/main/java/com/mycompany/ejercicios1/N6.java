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
public class N6 { 
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el primer número:");
        double n1 = scanner.nextDouble();

        System.out.println("Digite el segundo número:");
        double n2 = scanner.nextDouble();

        System.out.println("Digite el tercer número:");
        double n3 = scanner.nextDouble();

        double media = calcularMedia(n1, n2, n3);

        System.out.println("La media de los tres números es: " + media);

 
    }

    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
    
}
