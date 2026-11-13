package UD5;

import java.util.Scanner;

public class EJ20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre del trabajador: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce las horas trabajadas: ");
        double horas = sc.nextDouble();

        System.out.print("Introduce la tarifa por hora: ");
        double tarifa = sc.nextDouble();

        double bruto;

        if (horas <= 35) {
            bruto = horas * tarifa;
        } else {
            bruto = (35 * tarifa) + ((horas - 35) * tarifa * 1.5);
        }

        double impuestos = 0;

        if (bruto > 500) {
            impuestos = (bruto - 500) * 0.25;

            if (bruto > 900) {
                impuestos = (400 * 0.25) + ((bruto - 900) * 0.45);
            }
        }

        double neto = bruto - impuestos;

        System.out.println("Por las " + horas + " horas trabajadas, a " + nombre +
                " le corresponde un salario bruto de " + bruto +
                " € y un neto de " + neto +
                " € tras aplicar " + impuestos + " € de impuestos.");
    }
}
