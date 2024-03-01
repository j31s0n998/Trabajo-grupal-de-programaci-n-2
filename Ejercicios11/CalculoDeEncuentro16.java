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

public class CalculoDeEncuentro16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double velocidad1, velocidad2, distanciaInicial, diferenciaVelocidades, tiempoEncuentro;
   
        System.out.print("Ingrese la distancia entre los dos vehículos en kilómetros: ");
        distanciaInicial = scanner.nextDouble();
        
        System.out.print("Ingrese la velocidad del vehículo más lento en km/h: ");
        velocidad1 = scanner.nextDouble();
        
        System.out.print("Ingrese la velocidad del vehículo más rápido en km/h: ");
        velocidad2 = scanner.nextDouble();
     
        diferenciaVelocidades = velocidad2 - velocidad1;
        
        tiempoEncuentro = distanciaInicial / diferenciaVelocidades;
        
        System.out.println("El tiempo que tardará el vehículo más rápido en alcanzar al más lento es: " + (int)(tiempoEncuentro * 60) + " minutos.");
    }
}

