package UD5;

import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double numero;
        int entero;

        System.out.print("Introduce un número con decimales: ");
        numero = teclado.nextDouble();

        entero = (int) numero;

        if (entero % 2 == 0) {
            System.out.println("El número " + entero + " es par");
        } else {
            System.out.println("El número " + entero + " es impar");
        }

    }
}
