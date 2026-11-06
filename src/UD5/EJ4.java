package UD5;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Introduce el primer número: ");
        num1 = teclado.nextInt();

        System.out.print("Introduce el segundo número: ");
        num2 = teclado.nextInt();

        System.out.print("Introduce el tercer número: ");
        num3 = teclado.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor es: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("El mayor es: " + num3);
        }
    }
}
