
package UD5;

import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce N1: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduce N2: ");
        double num2 = sc.nextDouble();

        if (num1 == num2) {
            System.out.println("Los números son iguales");
        }
        else {
            if (num1 % 1 == 0 && num2 % 1 == 0) {
                System.out.println("Números enteros: " + (int) num1 + " y " + (int) num2);
            }
            else if (num1 % 1 == 0) {
                System.out.println("Números enteros: " + (int) num1);
            }
            else if (num2 % 1 == 0) {
                System.out.println("Números enteros: " + (int) num2);
            }
            else {
                System.out.println("Ningún número es entero");
            }
        }
    }
}
