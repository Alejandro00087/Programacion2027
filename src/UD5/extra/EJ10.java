
package UD5.extra;

import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int puntos = 0;

        System.out.println("MINICUESTIONARIO DE JAVA");
        System.out.println("------------------------");

        System.out.println("1. ¿Qué tipo de dato almacena números enteros?");
        System.out.println("1. double");
        System.out.println("2. int");
        System.out.println("3. String");
        int r1 = sc.nextInt();

        if (r1 == 2) {
            puntos++;
        }

        System.out.println("2. ¿Qué instrucción permite mostrar texto por pantalla?");
        System.out.println("1. System.out.println()");
        System.out.println("2. Scanner()");
        System.out.println("3. Math.sqrt()");
        int r2 = sc.nextInt();

        if (r2 == 1) {
            puntos++;
        }

        System.out.println("3. ¿Qué símbolo se utiliza para comparar si dos valores son iguales?");
        System.out.println("1. =");
        System.out.println("2. !=");
        System.out.println("3. ==");
        int r3 = sc.nextInt();

        if (r3 == 3) {
            puntos++;
        }

        System.out.println("4. ¿Qué tipo de dato almacena números decimales?");
        System.out.println("1. int");
        System.out.println("2. double");
        System.out.println("3. boolean");
        int r4 = sc.nextInt();

        if (r4 == 2) {
            puntos++;
        }

        System.out.println("5. ¿Qué operador significa Y?");
        System.out.println("1. ||");
        System.out.println("2. !");
        System.out.println("3. &&");
        int r5 = sc.nextInt();

        if (r5 == 3) {
            puntos++;
        }

        System.out.println("6. ¿Qué instrucción permite leer datos por teclado?");
        System.out.println("1. Scanner");
        System.out.println("2. System.out.println");
        System.out.println("3. Math.pow");
        int r6 = sc.nextInt();

        if (r6 == 1) {
            puntos++;
        }

        System.out.println("7. ¿Qué operador calcula el resto de una división?");
        System.out.println("1. /");
        System.out.println("2. %");
        System.out.println("3. *");
        int r7 = sc.nextInt();

        if (r7 == 2) {
            puntos++;
        }

        System.out.println("8. ¿Qué estructura permite tomar decisiones?");
        System.out.println("1. if");
        System.out.println("2. Scanner");
        System.out.println("3. println");
        int r8 = sc.nextInt();

        if (r8 == 1) {
            puntos++;
        }

        System.out.println("9. ¿Qué función calcula la raíz cuadrada?");
        System.out.println("1. Math.pow()");
        System.out.println("2. Math.sqrt()");
        System.out.println("3. Math.abs()");
        int r9 = sc.nextInt();

        if (r9 == 2) {
            puntos++;
        }

        System.out.println("10. ¿Qué valor representa verdadero?");
        System.out.println("1. false");
        System.out.println("2. 0");
        System.out.println("3. true");
        int r10 = sc.nextInt();

        if (r10 == 3) {
            puntos++;
        }

        System.out.println("------------------------");
        System.out.println("Has conseguido " + puntos + " puntos de 10.");
        System.out.println("Tu nota es: " + puntos);

        sc.close();
    }
}
