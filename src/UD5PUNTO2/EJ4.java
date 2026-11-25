package UD5PUNTO2;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();

        for (int i = 0; i <= num; i ++) {
            System.out.println(i);
        }
    }
}
