package UD4;

public class EJ5 {
    public static void main(String[] args) {
        int cont = 10;
        int limite = 20;

        System.out.println("a) " + ((cont == 0) && (limite < 20)));
        System.out.println("b) " + ((limite >= 20) || (cont < 5)));
        System.out.println("c) " + (((limite / (cont - 10)) > 7) || (limite < 20)));
        System.out.println("d) " + ((limite <= 20) || ((limite / (cont - 10)) > 7)));
        System.out.println("e) " + (((limite / (cont - 10)) > 7) && (limite < 0)));
        System.out.println("f) " + ((limite < 0) && ((limite / (cont - 10)) > 7)));
    }
}