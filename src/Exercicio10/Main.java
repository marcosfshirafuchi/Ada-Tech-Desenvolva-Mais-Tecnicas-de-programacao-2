package Exercicio10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        CorretorDeNomes corretorDeNomes = new CorretorDeNomes();
        nomes.add("Aline");
        nomes.add("fernanda");
        nomes.add("AMANDA");
        System.out.println(corretorDeNomes.corrigir(nomes));
    }
}
