/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios1;

import java.util.Scanner;

/**
 * @author santiagoC
 */

public class CalculadoraDeRaices13 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, ingrese un número para calcular su raíz cuadrada y cúbica:");
        
        double numero = scanner.nextDouble();
        
        double raizCuadrada = Math.sqrt(numero);
       
        double raizCubica = Math.cbrt(numero); 
        
        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
        System.out.println("La raíz cúbica de " + numero + " es: " + raizCubica);
    }
}