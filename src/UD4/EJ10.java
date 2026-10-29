package UD4;

import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero");
        double numero = sc.nextInt();

        System.out.println("Dime otro numero");
        double numero2 = sc.nextInt();

        double suma = (numero + numero2);
        double resta = (numero - numero2);
        double producto = (numero * numero2);
        double division = ((double) numero / numero2);

        System.out.println("El resultado es: " + suma);
        System.out.println("El resultado es: " + resta);
        System.out.println("El resultado es: " + producto);
        System.out.println("El resultado es: " + division);
    }
}
