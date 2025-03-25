package Exercicio07;


import java.util.ArrayList;
import java.util.List;
/**
 * <h1> Desenvolva + | #1322 Stream, Optional e operadores intermediários e terminais</h1>
 * <br>Enunciado<br><br>
 * Filtrando inteiros negativos<br><br>
 * A API Java Streams fornece meios de realizar operações em coleções, sem contudo, modificar a coleção original, retornando uma nova estrutura de dados dos resultados.<br><br>
 *
 * O método removerNegativos da classe Filtro, a seguir, deve funcionar de forma que, dada uma lista de inteiros, retorne uma nova lista de inteiros omitindo os valores que sejam menor que 0. Implemente o corpo desse método para alcançar o resultado esperado. Use o método removeIf para chamar o lambda uma vez para cada item na coleção, removendo cada item onde o lambda retorna true.<br><br>
 * <b>Note:</b> Desenvolvido na linguagem Java.
 *
 * @version 1.0
 * @authors Marcos Ferreira Shirafuchi<br>
 * @since 22/03/2025
 */
class Filtro {
    public List<Integer> removerNegativos(List<Integer> numeros) {
        numeros.removeIf(n ->n <0);
        List<Integer> numerosPositivos = new ArrayList<>(numeros);
        return numerosPositivos;
    }
}
