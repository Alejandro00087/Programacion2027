package UD5;

import java.util.Scanner;

public class EJ13 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        if (edad < 4) {
            System.out.println("Entras gratis");
        }

        else if (edad >= 4 && edad <= 17) {
            System.out.println("El precio de la entrada es 5€");
        }

        else if (edad > 17) {
            System.out.println("El precio de la entrada es 10€");
        }
    }
}