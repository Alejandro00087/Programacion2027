package UD4;

import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el valor del radio");
        int radio = sc.nextInt();

        System.out.println("Dime el valor del altura");
        int altura = sc.nextInt();

        double volumen = ((double)1 / 3 + Math.PI * Math.pow(radio, 2)) * altura;
        System.out.println("El volumen del triangulo es: "+volumen);
    }

}
