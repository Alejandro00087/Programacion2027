package UD5PUNTO2;

import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce un numero: ");
            int numero = sc.nextInt();

            if (numero >= 0) {
                positivos++;
            }
            else {
                negativos++;
            }

        }

        System.out.println("Hay " + positivos + " numeros positivos.");
        System.out.println("Hay " + negativos + " numeros negativos.");



    }
}
