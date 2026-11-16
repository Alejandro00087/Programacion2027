package UD5.extra;

import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime la altura: ");
        int altura = sc.nextInt();

        double tiempo = Math.sqrt(2*altura/9.81);

        System.out.println("El objeto tarda " +  tiempo + " en caer");

    }
}
