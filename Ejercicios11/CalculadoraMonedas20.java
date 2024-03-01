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
public class CalculadoraMonedas20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int monedasDeDosEuros, monedasDeUnEuro, monedasDeCincuentaCent, monedasDeVeinteCent, monedasDeDiezCent;
        
        System.out.print("¿Cuántas monedas de 2 euros tienes? ");
        monedasDeDosEuros = scanner.nextInt();
        
        System.out.print("¿Cuántas monedas de 1 euro tienes? ");
        monedasDeUnEuro = scanner.nextInt();
        
        System.out.print("¿Cuántas monedas de 50 céntimos tienes? ");
        monedasDeCincuentaCent = scanner.nextInt();
        
        System.out.print("¿Cuántas monedas de 20 céntimos tienes? ");
        monedasDeVeinteCent = scanner.nextInt();
        
        System.out.print("¿Cuántas monedas de 10 céntimos tienes? ");
        monedasDeDiezCent = scanner.nextInt();
    
        int totalEnCentimos = monedasDeDosEuros * 200 + monedasDeUnEuro * 100 + monedasDeCincuentaCent * 50 + monedasDeVeinteCent * 20 + monedasDeDiezCent * 10;
        
        int euros = totalEnCentimos / 100;
        int centimos = totalEnCentimos % 100;
        
        System.out.println("Tienes un total de " + euros + " euros y " + centimos + " céntimos.");
    }
}
