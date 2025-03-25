package Exercicio09;

public class Main {
    public static void main(String[] args) {
        StringOptional stringOptional = new StringOptional();
        System.out.println(stringOptional.optionalOfString("Olá"));
        System.out.println(stringOptional.optionalOfString(""));
        System.out.println(stringOptional.optionalOfString(null));
    }
}
