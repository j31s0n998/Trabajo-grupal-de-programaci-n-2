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
public class N8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el sueldo base del vendedor:");
        double sueldoBase = scanner.nextDouble();

        System.out.println("Digite el monto de la primera venta:");
        double v1 = scanner.nextDouble();

        System.out.println("Digite el monto de la segunda venta:");
        double v2 = scanner.nextDouble();

        System.out.println("Digite el monto de la tercera venta:");
        double v3 = scanner.nextDouble();

        double comision = (v1 + v2 + v3) * 0.10;
        double total = sueldoBase + comision;

        System.out.println("El vendedor recibirá $" + comision + " por concepto de comisiones por las tres ventas.");
        System.out.println("El total que recibirá en el mes, incluyendo su sueldo base y comisiones, es de $" + total);

      
    }
    
    
}
