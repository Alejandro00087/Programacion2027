package UD5.extra;


import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        if (n < 10){
            System.out.println("El número tiene una cifra");
        }
        else if (n < 100){
            System.out.println("El número tiene  dos cifras");
        }

        else if (n < 1000){
            System.out.println("El número tiene tres cifras");
        }

        else if (n < 10000){
            System.out.println("El numero tiene cuatro cifras");
        }

        else if (n < 100000){
            System.out.println("El numero tiene cinco cifras");
        }
    }
}
