
package UD5PUNTO2;

import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limiteInferior = 1;
        int limiteSuperior = 100;

        System.out.print("Introduce un número del 1 al 100: ");
        int resultado = sc.nextInt();

        while (limiteInferior <= limiteSuperior) {

            int media = (limiteInferior + limiteSuperior) / 2;

            System.out.println("¿Tu número es mayor (>), menor (<) o igual (=) a " + media + "?");
            String opcion = sc.next();

            if (opcion.equals(">") && resultado > media) {
                limiteInferior = media + 1;
            }

            else if (opcion.equals("<") && resultado < media) {
                limiteSuperior = media - 1;
            }

            else if (opcion.equals("=") && resultado == media) {
                System.out.println("¡He adivinado el número!");
                break;
            }

            else {
                System.out.println("Respuesta incorrecta. Inténtalo de nuevo.");
            }
        }

    }
}
