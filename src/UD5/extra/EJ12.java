
package UD5.extra;

import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();

        if (num % 2 == 0 && num % 5 == 0) {
            System.out.println("El numero es par y divisible entre 5");
        }
        else if (num % 2 == 0) {
            System.out.println("El numero es par");
        }
        else if (num % 5 == 0) {
            System.out.println("El numero es divisible entre 5");
        }
        else {
            System.out.println("El numero no es par ni divisible entre 5");
        }

    }
}
