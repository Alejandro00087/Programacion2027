
package UD5.extra;

import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero positivo: ");
        int num = sc.nextInt();

        if (num >= 0 && num < 10) {
            System.out.println("El numero es capicua");
        }
        else if (num >= 10 && num < 100) {
            if (num / 10 == num % 10) {
                System.out.println("El numero es capicua");
            } else {
                System.out.println("El numero no es capicua");
            }
        }
        else if (num >= 100 && num < 1000) {
            if (num / 100 == num % 10) {
                System.out.println("El numero es capicua");
            } else {
                System.out.println("El numero no es capicua");
            }
        }
        else if (num >= 1000 && num < 10000) {
            if (num / 1000 == num % 10 &&
                    (num / 100) % 10 == (num / 10) % 10) {
                System.out.println("El numero es capicua");
            } else {
                System.out.println("El numero no es capicua");
            }
        }
        else if (num >= 10000 && num <= 99999) {
            if (num / 10000 == num % 10 &&
                    (num / 1000) % 10 == (num / 10) % 10) {
                System.out.println("El numero es capicua");
            } else {
                System.out.println("El numero no es capicua");
            }
        }
        else {
            System.out.println("Numero no valido");
        }

        sc.close();
    }
}
