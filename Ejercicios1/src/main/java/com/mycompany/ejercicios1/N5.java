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
public class N5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite la temperatura en grados Fahrenheit:");
        double temperaturaFahrenheit = scanner.nextDouble();

        double temperaturaCelsius = convertirFahrenheitACelsius(temperaturaFahrenheit);

        System.out.println("La temperatura en grados Celsius es: " + temperaturaCelsius);

    }

    public static double convertirFahrenheitACelsius(double temperaturaFahrenheit) {
        return (temperaturaFahrenheit - 32) * 5 / 9;
    }
    
}
