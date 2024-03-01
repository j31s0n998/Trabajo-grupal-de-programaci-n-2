/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios1;

import java.util.Scanner;

/**
 *
 * @author santiagoC
 */

public class InversorDeNumeros14 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, introduce un número de dos dígitos:");
        int numero = entrada.nextInt();
        
        int primerDigito = numero / 10; 
        int segundoDigito = numero % 10; 
      int numeroInverso = segundoDigito * 10 + primerDigito;
        
        System.out.println("El número " + numero + " invertido es: " + numeroInverso);
    }
}

