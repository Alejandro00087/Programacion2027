package UD4;

import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la distancia en millas marinas");
        double millas = sc.nextDouble();

        double metros = millas*1852;

        System.out.println("La distancia en metros es: " + metros);

    }
}
