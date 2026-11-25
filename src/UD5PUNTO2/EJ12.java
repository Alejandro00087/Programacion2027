package UD5PUNTO2;

import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int potencia = 1;

        System.out.print("Introduce el valor de A: ");
        int a = sc.nextInt();
        System.out.print("Introduce el valor de B: ");
        int b = sc.nextInt();

        for (int i = 1; i <= b; i++) {
            potencia = potencia * a;

        }

        System.out.println(potencia);
    }
}
