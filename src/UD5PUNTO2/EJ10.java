package UD5PUNTO2;

import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean hay10 = false;

        System.out.println("Introduce notas: ");
        int nota = sc.nextInt();

        while (nota != -1) {

            if (nota == 10) {
                hay10 = true;
            }

            System.out.print("Introduce una nota: ");
            nota = sc.nextInt();

        }

        if (hay10) {
            System.out.println("Si hay algún 10");
        }
        else {
            System.out.println("No hay ningún 10");
        }
    }
}
