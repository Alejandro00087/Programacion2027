package UD5;

import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        int num1 = sc.nextInt();

        System.out.print("Dime otro numero: ");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println("El " + num1 + " es mayor que " + num2);
        }
        else if (num1==num2){
            System.out.println("Son iguales");
        }
        else {
            System.out.println("El " + num2 + " es mayor que " + num1);
        }
    }
}
