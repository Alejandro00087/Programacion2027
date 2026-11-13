package UD5;

import java.util.Scanner;

public class EJ17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce las horas: ");
        int horas = sc.nextInt();

        System.out.print("Introduce los minutos: ");
        int minutos = sc.nextInt();

        System.out.print("Introduce los segundos: ");
        int segundos = sc.nextInt();

        segundos++;

        if (segundos == 60) {
            segundos = 0;
            minutos++;

            if (minutos == 60) {
                minutos = 0;
                horas++;

                if (horas == 24) {
                    horas = 0;
                }
            }
        }

        if (horas < 10) {
            System.out.print("0");
        }
        System.out.print(horas + ":");

        if (minutos < 10) {
            System.out.print("0");
        }
        System.out.print(minutos + ":");

        if (segundos < 10) {
            System.out.print("0");
        }
        System.out.println(segundos);
    }
}
