package UD4;

import java.util.Scanner;

public class EJ15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tus horas de trabajo: ");
        double horasTrabajo = sc.nextDouble();

        System.out.print("Introduce la tarifa por hora: ");
        double tarifaPorHora = sc.nextDouble();

        double bruto = horasTrabajo * tarifaPorHora;
        double neto = bruto - (bruto * 0.15);

        System.out.println("Tu paga en bruto es de " + bruto + "€ y en neto " + neto + "€ (retención del 15%)");
    }
}