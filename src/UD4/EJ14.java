package UD4;

import java.util.Scanner;

public class EJ14 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero entero positivo");
        int n = sc.nextInt();

        int suma = n*(n+1)/2;

        System.out.println("La suma de los primeros numeros enteros desde 1 hasta " + n + " es " + suma);
    }
}
