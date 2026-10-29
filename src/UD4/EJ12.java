package UD4;

import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el precio original del artículo");
        double precioOriginal = sc.nextDouble();

        System.out.println("Dime el precio del articulo rebajado");
        double precioRebajado = sc.nextDouble();

        double descuento = ((precioOriginal-precioRebajado)/precioOriginal)*100;
        System.out.printf("El descuento es: %.2f", descuento);
    }
}
