package UD5PUNTO2;

public class EJ9 {
    public static void main(String[] args) {

        int suma = 0;
        int producto = 1;

        for (int i = 1; i <= 10; i++) {
            suma += i;
            producto *= i;

        }
        System.out.println("La suma es: " + suma);
        System.out.println("El producto es: " + producto);
    }
}
