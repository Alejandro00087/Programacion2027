package UD5;

import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        System.out.print("Introduce tus ingresos: ");
        int ingreso = sc.nextInt();

        if (edad > 16 || ingreso >= 1000){
            System.out.println("Tienes que tributar");
        }

        else  {
            System.out.println("No tienes que tributar");
        }
    }
}

