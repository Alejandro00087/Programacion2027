package UD4;

import java.util.Scanner;

public class EJ7 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el valor de la altura");
        int altura = sc.nextInt();

        System.out.println("Dime el valor de la base");
        int base = sc.nextInt();

        int area = (altura * base) / 2;

        System.out.println("El area del triangulo es: "+area);
    }
}
