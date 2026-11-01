package UD4;

import java.util.Scanner;

public class EJ1_extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cantidad de segundos: ");
        int segundosTotales = scanner.nextInt();

        // 1. Calculamos los segundos finales que no llegan a 1 minuto
        int segundos = segundosTotales % 60;

        // 2. Pasamos el total a minutos
        int totalMinutos = segundosTotales / 60;
        // Los minutos finales son los que no llegan a 1 hora
        int minutos = totalMinutos % 60;

        // 3. Pasamos los minutos a horas
        int totalHoras = totalMinutos / 60;
        // Las horas finales son las que no llegan a 1 día
        int horas = totalHoras % 24;

        // 4. Los días son las horas totales entre 24
        int dias = totalHoras / 24;

        // 5. Mostramos el resultado formateado
        System.out.printf("Equivale a: %d día(s), %d hora(s), %d minuto (s) y %d segundo (s)\n",
                dias, horas, minutos, segundos);

        scanner.close();
    }
}