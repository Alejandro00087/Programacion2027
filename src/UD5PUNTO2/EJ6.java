package UD5PUNTO2;

import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean hayNegativo = false;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce el número " + i + ": ");
            int num = sc.nextInt();

            if (num < 0) {
                hayNegativo = true;
            }
        }

        if (hayNegativo) {
            System.out.println("Se ha leído al menos un número negativo.");
        } else {
            System.out.println("No se ha leído ningún número negativo.");
        }

    }
}
