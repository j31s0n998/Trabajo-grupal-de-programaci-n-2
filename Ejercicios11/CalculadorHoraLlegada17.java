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

public class CalculadorHoraLlegada17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int horasSalida, minutosSalida, segundosSalida;
        int duracionViajeSegundos;
        int segundosTotales;
     
        System.out.println("Vamos a calcular la hora de llegada. Por favor, introduce la hora de salida.");
        System.out.print("Hora (0-23): ");
        horasSalida = scanner.nextInt();
        
        System.out.print("Minutos (0-59): ");
        minutosSalida = scanner.nextInt();
        
        System.out.print("Segundos (0-59): ");
        segundosSalida = scanner.nextInt();
  
        System.out.print("Ahora, introduce la duración del viaje en segundos: ");
        duracionViajeSegundos = scanner.nextInt();
      
        segundosTotales = horasSalida * 3600 + minutosSalida * 60 + segundosSalida + duracionViajeSegundos;
        
        int horasLlegada = segundosTotales / 3600 % 24; 
        int minutosLlegada = (segundosTotales / 60) % 60; 
        int segundosLlegada = segundosTotales % 60; 
     
        System.out.printf("La hora de llegada a la ciudad B será: %02d:%02d:%02d\n", horasLlegada, minutosLlegada, segundosLlegada);
    }
}