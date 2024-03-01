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
public class N9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el total de la compra:");
        double totalCompra = scanner.nextDouble();

        double descuento = totalCompra * 0.15;
        double totalAPagar = totalCompra - descuento;

        System.out.println("El total a pagar con el descuento del 15% es: $" + totalAPagar);
    }

}
