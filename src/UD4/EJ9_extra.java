package UD4;

public class EJ9_extra {
    public static void main(String[] args) {
        // Códigos de colores ANSI de la teoría[cite: 35]
        String ANSI_RED = "\u001B[31m";
        String ANSI_YELLOW = "\u001B[33m";

        // Definimos las líneas de la bandera con el carácter unicode \u2588[cite: 36]
        String lineaRoja = ANSI_RED + "\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588";
        String lineaAmarilla = ANSI_YELLOW + "\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588";

        // Imprimimos la estructura de la bandera de España (rojo, amarillo, rojo)[cite: 36]
        System.out.println(lineaRoja);
        System.out.println(lineaRoja);
        System.out.println(lineaRoja);
        System.out.println(lineaAmarilla);
        System.out.println(lineaAmarilla);
        System.out.println(lineaAmarilla);
        System.out.println(lineaRoja);
        System.out.println(lineaRoja);
        System.out.println(lineaRoja);
    }
}

