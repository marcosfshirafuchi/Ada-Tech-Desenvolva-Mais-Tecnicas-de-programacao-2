package Exercicio01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        AnalisadorIdade analisador = new AnalisadorIdade();
        Predicate<Integer> verificador = analisador.criarVerificador();

        List<Integer> idades = Arrays.asList(12, 17, 18, 20, 15, 25);
        List<Integer> resultado = analisador.remover(idades, verificador);

        System.out.println(resultado); // Saída esperada: [18, 20, 25]
    }
}
