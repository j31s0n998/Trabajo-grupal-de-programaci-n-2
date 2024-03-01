/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.taller;

public class TomarMayusculas {

    public static void main(String[] args) {
String palabra= "QUesItoxDlOLDiAmantE";
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (Character.isUpperCase(palabra.charAt(i))) {
                contador++;
            }
        }
        
        System.out.println("La palabra tiene " + contador + " mayúsculas.");    }
}