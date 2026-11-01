package UD4;

import java.util.Scanner;

public class EJ_7_extra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitamos la frase al usuario
        System.out.print("Introduce una frase: ");
        String frase = entrada.nextLine();

        // Mayúsculas utilizando el especificador %S en printf[cite: 3, 29]
        System.out.printf("MAYÚSCULAS: %S\n", frase);

        // minúsculas utilizando el método toLowerCase() de la clase String[cite: 3]
        System.out.println("minúsculas: " + frase.toLowerCase());

        entrada.close();
    }
}