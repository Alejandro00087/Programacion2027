package UD5;

import java.util.Scanner;

public class EJ18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¡Bienvenido a la pizzeria BELLA NAPOLI!");
        System.out.println("Tipos de pizza:");
        System.out.println("1 - Vegetariana");
        System.out.println("2 - No vegetariana");

        System.out.print("Introduce el número correspondiente al tipo de pizza que quieres: ");
        int tipo = sc.nextInt();

        if (tipo == 1) {
            System.out.println("Ingredientes de pizzas vegetarianas:");
            System.out.println("1 - Pimiento");
            System.out.println("2 - Tofu");

            System.out.print("Introduce el ingrediente que deseas: ");
            int ingrediente = sc.nextInt();

            if (ingrediente == 1) {
                System.out.println("Has elegido la pizza vegetariana con tomate, mozzarella y pimiento");
            } else if (ingrediente == 2) {
                System.out.println("Has elegido la pizza vegetariana con tomate, mozzarella y tofu");
            } else {
                System.out.println("Ingrediente incorrecto");
            }

        } else if (tipo == 2) {
            System.out.println("Ingredientes de pizzas no vegetarianas:");
            System.out.println("1 - Pepperoni");
            System.out.println("2 - Jamón");
            System.out.println("3 - Salmón");

            System.out.print("Introduce el ingrediente que deseas: ");
            int ingrediente = sc.nextInt();

            if (ingrediente == 1) {
                System.out.println("Has elegido la pizza no vegetariana con tomate, mozzarella y pepperoni");
            } else if (ingrediente == 2) {
                System.out.println("Has elegido la pizza no vegetariana con tomate, mozzarella y jamón");
            } else if (ingrediente == 3) {
                System.out.println("Has elegido la pizza no vegetariana con tomate, mozzarella y salmón");
            } else {
                System.out.println("Ingrediente incorrecto");
            }

        } else {
            System.out.println("Tipo de pizza incorrecto");
        }
    }
}
