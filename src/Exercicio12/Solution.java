package Exercicio12;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <h1> Desenvolva + | #1322 Stream, Optional e operadores intermediários e terminais</h1>
 * <br>Enunciado<br><br>
 * Somando valores em listas<br><br>
 * Listas são estruturas de dados muito importantes. Elas nos permitem adicionar e remover objetos em qualquer posição da lista. O primeiro elemento da lista está na posição 0 e o enésimo elemento na posição n-1.<br><br>
 *
 * Implemente o método "somaLista" que recebe um array de inteiros como parâmetro. Converta o array em uma lista, faça a soma de todos os números e retorne o valor total.<br><br>
 * <b>Note:</b> Desenvolvido na linguagem Java.
 *
 * @version 1.0
 * @authors Marcos Ferreira Shirafuchi<br>
 * @since 22/03/2025
 */
public class Solution {
    public static int somaLista(int[] array) {

        List<Integer> listaNumeros = Collections.singletonList(Arrays.stream(array).sum());
        return listaNumeros.stream().findFirst().get();
    }
}