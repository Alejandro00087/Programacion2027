package UD5PUNTO2;

import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        boolean hayNegativos = false;

        System.out.print("Introduce un número (0 para salir): ");
        int numero = sc.nextInt();

        while (numero != 0) {
            if (numero > 0) {
                positivos++;
            } else {
                negativos++;
                hayNegativos = true;
            }

            System.out.print("Introduce un número (0 para salir): ");
            numero = sc.nextInt();
        }

        if (hayNegativos) {
            System.out.println("Sí hay negativos.");
        } else {
            System.out.println("No hay negativos.");
        }

        System.out.println("Hay " + positivos + " números positivos.");
        System.out.println("Hay " + negativos + " números negativos.");
    }
}
