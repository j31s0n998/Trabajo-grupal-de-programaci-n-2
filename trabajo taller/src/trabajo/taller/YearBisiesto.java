/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.taller;

import java.util.Scanner;

public class Yearbisiesto {
 Scanner teclado = new Scanner(System.in);
 int year;
 public void entradaYear(){
     System.out.println("digite el año que quiere saber si es bisiesto o no");
     year = teclado.nextInt();
 }
 public void saberSiEsBisiesto(){
 if(year%4==0&& year%100!=0||year%400==0){
     System.out.println(year+" es un año bisiesto xd");
 }else{
     System.out.println("no es un año bisiesto");
    }
 }
    public static void main(String[] args) {
       Yearbisiesto bisiesto= new Yearbisiesto();
       bisiesto.entradaYear();
       bisiesto.saberSiEsBisiesto();
        
    }
}
