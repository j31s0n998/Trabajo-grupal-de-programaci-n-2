/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.taller;
import java.util.Scanner;


public class ViajeEscolar {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        int numAlumnos;
        double costoAlumno;
        double costoTotal;

        System.out.println("Ingrese el número de alumnos:");
        numAlumnos = teclado.nextInt();

        if (numAlumnos >= 100) {
            costoAlumno = 65;
        } else if (numAlumnos >= 50 && numAlumnos <= 99) {
            costoAlumno = 70;
        } else if (numAlumnos >= 30 && numAlumnos <= 49) {
            costoAlumno = 95;
        } else {
            costoAlumno = 4000.0 / numAlumnos;
        }

        costoTotal = numAlumnos * costoAlumno;

        System.out.println("El costo por alumno es: " + costoAlumno + " euros");
        System.out.println("El pago a la compañía de autobuses es: " + costoTotal + " euros");

        teclado.close();
    }
}
