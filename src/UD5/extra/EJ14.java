
package UD5.extra;

import java.util.Scanner;

public class EJ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un carácter de relleno: ");
        String car = sc.nextLine();

        System.out.println("1. Con el vértice hacia arriba");
        System.out.println("2. Con el vértice hacia abajo");
        System.out.println("3. Con el vértice hacia la izquierda");
        System.out.println("4. Con el vértice hacia la derecha");

        System.out.print("Elige un tipo de piramide: ");
        int opcion = sc.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("    " + car);
                System.out.println("   " + car + " " + car);
                System.out.println("  " + car + " " + car + " " + car);
                System.out.println(" " + car + " " + car + " " + car + " " + car);
                System.out.println(car + " " + car + " " + car + " " + car + " " + car);
                break;

            case 2:
                System.out.println(car + " " + car + " " + car + " " + car + " " + car);
                System.out.println(" " + car + " " + car + " " + car + " " + car);
                System.out.println("  " + car + " " + car + " " + car);
                System.out.println("   " + car + " " + car);
                System.out.println("    " + car);
                break;

            case 3:
                System.out.println("    " + car);
                System.out.println("  " + car + " " + car);
                System.out.println(car + " " + car + " " + car);
                System.out.println("  " + car + " " + car);
                System.out.println("    " + car);
                break;

            case 4:
                System.out.println(car);
                System.out.println(car + " " + car);
                System.out.println(car + " " + car + " " + car);
                System.out.println(car + " " + car);
                System.out.println(car);
                break;

            default:
                System.out.println("Opcion no valida");
        }

        sc.close();
    }
}
