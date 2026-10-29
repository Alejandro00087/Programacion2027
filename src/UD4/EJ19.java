package UD4;

import java.util.Scanner;

public class EJ19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la cantidad a invertir: ");
        double cantidad = sc.nextDouble();

        System.out.print("Introduce el interés porcentual anual: ");
        double interes = sc.nextDouble();

        System.out.print("Duración de la inversión en meses: ");
        int meses = sc.nextInt();

        double interesMensual = (interes / 100) / 12;

        double capitalFinal = cantidad * Math.pow(1 + interesMensual, meses);

        System.out.printf("El capital final después de %d meses será de: %.2f €\n", meses, capitalFinal);

        sc.close();
    }
}
