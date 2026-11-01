package UD4;

import java.util.Scanner;

public class EJ2_extra {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el precio del primer producto: ");
        double precio = sc.nextDouble();

        System.out.print("Introdue el precio del segundo producto: ");
        double precio2 = sc.nextDouble();

        double masCaro = Math.max(precio,precio2);
        double masBarato = Math.min(precio,precio2);
        double Diferencia = masCaro - masBarato;

        System.out.printf("Producto más caro: %.2f€\n", masCaro);
        System.out.printf("Producto más barato: %.2f€\n ", masBarato);
        System.out.printf("Diferencia: %.2f€\n ", Diferencia);
    }
}
