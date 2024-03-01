/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.taller;

import java.util.Scanner;
public class Triangulos {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
      
     
        System.out.println("digite un lado del triangulo");
        double lado1= teclado.nextDouble();
        System.out.println("digite un lado del triangulo");
        double lado2= teclado.nextDouble();
        System.out.println("digite un lado del triangulo");
        double lado3= teclado.nextDouble();
        if(lado1+lado2>lado3||lado1+lado3>lado2||lado3+lado2>lado1 ){
           if(lado1==lado2&&lado2==lado3&&lado1==lado3){
              System.out.println("el triangulo es equilatero porque todos sus lados son iguales");
            }
            if(lado1==lado2||lado2==lado3||lado1==lado3){
                System.out.println("el triangulo es isosceles porque tiene 2 lados iguales y uno diferente");          
            }
            if (Math.pow(lado1, 2) + Math.pow(lado2, 2) == Math.pow(lado3, 2) ||
                Math.pow(lado2, 2) + Math.pow(lado3, 2) == Math.pow(lado1, 2) ||
                Math.pow(lado1, 2) + Math.pow(lado3, 2) == Math.pow(lado2, 2)) {
                System.out.println("Es un triángulo rectángulo");
            }

            else{
                System.out.println("el triguangulo es escaleno");
            
            }
             
        }
        else{
        
            System.out.println("no es un trigualo xd");
        
        }
    }
}
