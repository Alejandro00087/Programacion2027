package UD4;

import java.util.Scanner;

public class EJ17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el numero de empanadillas a enviar: ");
        int empanadillas = sc.nextInt();

        System.out.print("Introduce el numero de napolitanas a enviar: ");
        int napolitanas = sc.nextInt();

        double pesoEmpanadillas = empanadillas * 112;
        double pesoNapolitanas = napolitanas * 75;
        double pesoTotal =  (pesoEmpanadillas + pesoNapolitanas) / 1000;

        System.out.println("El peso total del paquete es " + pesoTotal + " Kg");
    }
}
