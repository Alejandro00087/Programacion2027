
package UD5.extra;

import java.util.Scanner;

public class EJ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce otro numero: ");
        int num2 = sc.nextInt();

        System.out.print("Introduce otro numero: ");
        int num3 = sc.nextInt();

        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println(num1 + " " + num2 + " " + num3);
            } else {
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println(num2 + " " + num1 + " " + num3);
            } else {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        } else {
            if (num1 <= num2) {
                System.out.println(num3 + " " + num1 + " " + num2);
            } else {
                System.out.println(num3 + " " + num2 + " " + num1);
            }
        }

        sc.close();
    }
}
