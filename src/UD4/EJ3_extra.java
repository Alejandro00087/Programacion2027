package UD4;

import java.util.Scanner;

public class EJ3_extra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Producto 1
        System.out.print("Producto 1 (nombre): ");
        String prod1 = entrada.nextLine();
        System.out.print("Cantidad: ");
        int cant1 = Integer.parseInt(entrada.nextLine());
        System.out.print("Precio unitario (€): ");
        double precio1 = Double.parseDouble(entrada.nextLine().replace(',', '.'));
        double sub1 = cant1 * precio1;

        // Producto 2
        System.out.print("Producto 2 (nombre): ");
        String prod2 = entrada.nextLine();
        System.out.print("Cantidad: ");
        int cant2 = Integer.parseInt(entrada.nextLine());
        System.out.print("Precio unitario (€): ");
        double precio2 = Double.parseDouble(entrada.nextLine().replace(',', '.'));
        double sub2 = cant2 * precio2;

        // Producto 3
        System.out.print("Producto 3 (nombre): ");
        String prod3 = entrada.nextLine();
        System.out.print("Cantidad: ");
        int cant3 = Integer.parseInt(entrada.nextLine());
        System.out.print("Precio unitario (€): ");
        double precio3 = Double.parseDouble(entrada.nextLine().replace(',', '.'));
        double sub3 = cant3 * precio3;

        // Producto 4
        System.out.print("Producto 4 (nombre): ");
        String prod4 = entrada.nextLine();
        System.out.print("Cantidad: ");
        int cant4 = Integer.parseInt(entrada.nextLine());
        System.out.print("Precio unitario (€): ");
        double precio4 = Double.parseDouble(entrada.nextLine().replace(',', '.'));
        double sub4 = cant4 * precio4;

        // Producto 5
        System.out.print("Producto 5 (nombre): ");
        String prod5 = entrada.nextLine();
        System.out.print("Cantidad: ");
        int cant5 = Integer.parseInt(entrada.nextLine());
        System.out.print("Precio unitario (€): ");
        double precio5 = Double.parseDouble(entrada.nextLine().replace(',', '.'));
        double sub5 = cant5 * precio5;

        // Cálculo de los totales
        int totalCantidad = cant1 + cant2 + cant3 + cant4 + cant5;
        double totalSubtotales = sub1 + sub2 + sub3 + sub4 + sub5;

        // Impresión de la tabla formateada con printf
        System.out.println("\n------------------------------------------------------------");
        System.out.printf("| %-11s | %-8s | %13s | %12s |\n", "Producto", "Cantidad", "Precio Unit.", "Subtotales");
        System.out.println("------------------------------------------------------------");

        System.out.printf("| %-11s | %8d | %11.2f € | %10.2f € |\n", prod1, cant1, precio1, sub1);
        System.out.printf("| %-11s | %8d | %11.2f € | %10.2f € |\n", prod2, cant2, precio2, sub2);
        System.out.printf("| %-11s | %8d | %11.2f € | %10.2f € |\n", prod3, cant3, precio3, sub3);
        System.out.printf("| %-11s | %8d | %11.2f € | %10.2f € |\n", prod4, cant4, precio4, sub4);
        System.out.printf("| %-11s | %8d | %11.2f € | %10.2f € |\n", prod5, cant5, precio5, sub5);

        System.out.println("------------------------------------------------------------");
        System.out.printf("| %-11s | %8d | %13s | %10.2f € |\n", "TOTALES", totalCantidad, "", totalSubtotales);
        System.out.println("------------------------------------------------------------");

        entrada.close();
    }
}