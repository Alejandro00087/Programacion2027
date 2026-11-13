package UD5;

import java.util.Scanner;

public class EJ15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el importe del pedido: ");
        double importe = sc.nextDouble();

        if (importe > 100) {
            importe = importe - (importe * 0.10);
        } else if (importe < 50) {
            importe = importe + 5;
        }

        System.out.println("El importe total es: " + importe + " €");
    }
}
