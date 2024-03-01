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
public class GeneradorDeIniciales18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        String primerNombre, segundoNombre, primerApellido, segundoApellido;
        String iniciales;
        
        System.out.print("Introduce tu primer nombre: ");
        primerNombre = scanner.nextLine();
        
        System.out.print("Introduce tu segundo nombre (si lo tienes, si no presiona ENTER): ");
        segundoNombre = scanner.nextLine();
        
        System.out.print("Introduce tu primer apellido: ");
        primerApellido = scanner.nextLine();
        
        System.out.print("Introduce tu segundo apellido: ");
        segundoApellido = scanner.nextLine();
        
        iniciales = primerNombre.substring(0, 1) + 
                    (segundoNombre.isEmpty() ? "" : segundoNombre.substring(0, 1)) + 
                    primerApellido.substring(0, 1) + 
                    segundoApellido.substring(0, 1);
        
        iniciales = iniciales.toUpperCase();
        
        System.out.println("Tus iniciales son: " + iniciales);
    }
}