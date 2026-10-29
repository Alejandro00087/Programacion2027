package UD4;

import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el valor de un lado:");
        int lado = sc.nextInt();

        int area =  lado * lado;

        System.out.println("El area del cuadrado es: " + area);

    }
}
