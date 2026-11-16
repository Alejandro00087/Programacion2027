
package UD5.extra;

import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la hora: ");
        int horas = sc.nextInt();

        System.out.print("Introduce los minutos: ");
        int minutos = sc.nextInt();

        int segundos = (24 * 3600) - (horas * 3600 + minutos * 60);

        System.out.println("Faltan " + segundos + " segundos para medianoche");

        sc.close();
    }
}
