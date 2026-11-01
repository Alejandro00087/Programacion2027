package UD4;

import java.util.Locale;
import java.util.Scanner;

public class EJ19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Introduce la cantidad a invertir: ");
        double cantidad = sc.nextDouble();

        System.out.print("Introduce el interés porcentual anual: ");
        double interes = sc.nextDouble();

        System.out.print("Duración de la inversión en meses: ");
        int meses = sc.nextInt();

        // Convertimos los meses a años (puede tener decimales, por ejemplo 60 meses = 5.0 años)
        double anos = meses / 12.0;

        // Aplicamos la fórmula exacta de la pista del enunciado
        double capitalFinal = cantidad * Math.pow( (interes / 100 + 1) , anos );
        System.out.printf("Capital final: %.2f\n", capitalFinal);

        sc.close();
    }
}