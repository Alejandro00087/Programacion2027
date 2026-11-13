package UD5;

import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String clave = "thebest";

        System.out.println("Introduce la contraseña");
        String con = sc.nextLine();

        if (clave.equalsIgnoreCase(con)){
            System.out.println("La contraseña coincide");
        }

        else{
            System.out.println("La contraseña no coincide");
        }



    }
}
