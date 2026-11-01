package UD4;

import java.util.Scanner;

public class EJ20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la inversión inicial: ");
        double ini = sc.nextDouble();

        double balanceAnyo1 = ini * (1 + 0.04);
        double balanceAnyo2 = balanceAnyo1 * (1 + 0.04);
        double balanceAnyo3 = balanceAnyo2 * (1 + 0.04);

        System.out.printf("Balance año 1: %.2f\n",  balanceAnyo1);
        System.out.printf("Balance año 2: %.2f\n",  balanceAnyo2);
        System.out.printf("Balance año 3 y final: %.2f\n ",  balanceAnyo3);



    }
}
