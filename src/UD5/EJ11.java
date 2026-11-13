
package UD5;

import java.util.Scanner;

public class EJ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Elige una opción:");
        System.out.println("------------------------------");
        System.out.println("1. De Celsius a Fahrenheit");
        System.out.println("2. De Fahrenheit a Celsius");
        System.out.println("3. De Celsius a Kelvin");
        System.out.println("------------------------------");
        System.out.print("Opción: ");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Introduce el valor Celsius.");
                double celsius = sc.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println(celsius + " grados Celsius son " + fahrenheit + " Fahrenheit");
                break;

            case 2:
                System.out.println("Introduce el valor Fahrenheit.");
                double fahrenheit2 = sc.nextDouble();
                double celsius2 = (fahrenheit2 - 32) * 5 / 9;
                System.out.println(fahrenheit2 + " grados Fahrenheit son " + celsius2 + " Celsius");
                break;

            case 3:
                System.out.println("Introduce el valor Celsius.");
                double celsius3 = sc.nextDouble();
                double kelvin = celsius3 + 273.15;
                System.out.println(celsius3 + " grados Celsius son " + kelvin + " Kelvin");
                break;

            default:
                System.out.println("Opción no válida");
        }

        sc.close();
    }
}
