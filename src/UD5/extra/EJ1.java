package UD5.extra;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un dia de la semana: ");
        String dia = sc.nextLine();

        if (dia.equalsIgnoreCase("Lunes")) {
            System.out.println("Ese dia a primera hora toca programación");
        }
        else if (dia.equalsIgnoreCase("Martes")) {
            System.out.println("Ese dia toca Inglés");
        }
        else if (dia.equalsIgnoreCase("Miercoles")) {
            System.out.println("Ese dia a primera hora toca Sistemas infomáticos");
        }
        else if (dia.equalsIgnoreCase("Jueves")) {
            System.out.println("Ese dia a primera hora toca Inglés");
        }
        else if (dia.equalsIgnoreCase("Viernes")) {
            System.out.println("Ese dia a primera hora toca Inglés");
        }
        else {
            System.out.println("Ese dia no hay clase");
        }


    }
}
