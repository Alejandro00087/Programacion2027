package UD5.extra;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        int UltimaCifra = (n % 10);

        System.out.println("Su última cifra és: " +  UltimaCifra);
    }
}
