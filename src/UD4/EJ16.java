package UD4;

import java.util.Scanner;

public class EJ16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime el dividendo (entero): ");
        int n = sc.nextInt();

        System.out.print("Dime el divisor (entero): ");
        int m =  sc.nextInt();

        int resto = n%m;
        int cociente = n/m;

        System.out.println(n + " entre " + m + " da un cociente " + cociente + " y un resto " + resto);




    }
}
