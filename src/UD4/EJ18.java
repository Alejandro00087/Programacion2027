package UD4;

import java.util.Scanner;

public class EJ18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de barras frescas vendidas: ");
        int barrasDia = sc.nextInt();

        System.out.print("Introduce el numero de barras que no son del dia: ");
        int barrasNoDia = sc.nextInt();

        double precioBarrasDia = barrasDia * 1.20;
        double precioBarrasNoDia = (barrasNoDia * 1.20) * 0.5;
        double total = precioBarrasDia + precioBarrasNoDia;

        System.out.println("El total de ingresos del dia es " + total + "€");
    }
}
