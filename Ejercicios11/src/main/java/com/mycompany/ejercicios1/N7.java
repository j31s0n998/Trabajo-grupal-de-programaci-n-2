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
public class N7 { 
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite la cantidad de minutos:");
        int minutos = scanner.nextInt();

        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;

        System.out.println(minutos + " minutos equivalen a " + horas + " horas y " + minutosRestantes + " minutos.");

   
    }
    
    
}
