
package UD5;

import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cómo te llamas? ");
        String nombre = sc.nextLine();

        System.out.print("¿Cuál es tu género (H o M)? ");
        String genero = sc.nextLine();

        char inicial = Character.toUpperCase(nombre.charAt(0));

        if ((genero.equalsIgnoreCase("M") && inicial <= 'M') ||
                (genero.equalsIgnoreCase("H") && inicial >= 'N')) {

            System.out.println("Tu grupo es A");

        } else {
            System.out.println("Tu grupo es B");
        }
    }
}
