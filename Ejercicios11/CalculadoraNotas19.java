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
public class CalculadoraNotas19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int preguntasCorrectas, preguntasIncorrectas, preguntasNoContestadas;
        int notaFinal;
        
        System.out.print("Ingrese el número de preguntas correctas: ");
        preguntasCorrectas = scanner.nextInt();
        
        System.out.print("Ingrese el número de preguntas incorrectas: ");
        preguntasIncorrectas = scanner.nextInt();
        
        System.out.print("Ingrese el número de preguntas no contestadas: ");
        preguntasNoContestadas = scanner.nextInt();
        
        notaFinal = (preguntasCorrectas * 5) - (preguntasIncorrectas * 1);
        
        System.out.println("La nota final del estudiante es: " + notaFinal);
    }
}