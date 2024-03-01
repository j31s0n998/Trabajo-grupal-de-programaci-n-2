/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.taller;

import java.util.Scanner;
public class Circunferencia {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        //-------------------------------------------------
        System.out.println("ingrese las cordenadas de x");
        System.out.println("ingrese x1");
        double x1= teclado.nextDouble();
        
        System.out.println("ingrese x2");
        double x2= teclado.nextDouble();
        //-------------------------------------------------
        System.out.println("ingrese las cordenadas de y");
        System.out.println("ingrese y1");
        double y1= teclado.nextDouble();
        System.out.println("ingrese y2");
        double y2= teclado.nextDouble();
        //----------------------------------
        System.out.println("ingrese los radios");
        System.out.println("ingrese r1");
        double r1= teclado.nextDouble();
        System.out.println("ingrese r2");
        double r2= teclado.nextDouble();
        //---------------------------------------------------
        System.out.println("esta es la distancia");
        double distancia= Math.sqrt(Math.pow(x2-x1,2)+(Math.pow(y2-y1,2)));
        System.out.println(distancia);
        //------------------------------------------------------
        if(distancia>r1+r2){
            System.out.println("las circunferencias son exteriores entre si");
        }
        //-----------------------------------------------------------------
        if(distancia==r1+r2){
            System.out.println("las circunferencias son tangentes exteriores");
        }
        //---------------------------------------------------------------------
        if(r1-r2<distancia&& distancia<r1+r2){
            System.out.println("las circunferencias son secantes");
        }
        //-------------------------------------------------------------------
        if(distancia  == Math.abs(r1-r2)){   
           System.out.println("las circunferencias son tangentes interiores");  
        }
        //--------------------------------------------------------------------
        
        if(distancia< Math.abs(r1-r2)){
            System.out.println("la circunferencia esta dentro de la otra");
        }
        
        else{
            System.out.println("las circunferencias son concentricas, es decir, tienen el mismo centro pero radios diferentes");
        }
        
        
        
        
    }
}