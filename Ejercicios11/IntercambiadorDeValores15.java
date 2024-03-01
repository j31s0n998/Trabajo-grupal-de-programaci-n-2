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
public class IntercambiadorDeValores15 {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        int primerValor, segundoValor, temporal;
        System.out.print("Introduce el primer valor: ");
        primerValor = entrada.nextInt();
        
        System.out.print("Introduce el segundo valor: ");
        segundoValor = entrada.nextInt();

        temporal = primerValor; 
        primerValor = segundoValor; 
        segundoValor = temporal; 
        
        System.out.println("El nuevo valor del primer valor es: " + primerValor + " y el nuevo valor del segundo valor es: " + segundoValor);
    }
}
