package UD5;

import java.util.Scanner;

public class EJ14 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu renta anual: ");
        double renta = sc.nextDouble();

        if (renta < 10000) {
            System.out.println("El tipo impositivo es del 5%");
        }

        else if (renta < 20000) {
            System.out.println("El tipo impositivo es del 15%");
        }

        else if (renta < 35000) {
            System.out.println("El tipo impositivo es del 20%");
        }

        else if (renta < 60000) {
            System.out.println("El tipo impositivo es del 30%");
        }

        else {
            System.out.println("El tipo impositivo es del 45%");
        }
    }
}
