package Exercicio08;

import java.util.Arrays;

/**
 * <h1> Desenvolva + | #1322 Stream, Optional e operadores intermediários e terminais</h1>
 * <br>Enunciado<br><br>
 * Ordenando lista com Streams e lambda<br><br>
 * Listas são uma estrutura de dados muito importante. Elas nos permitem adicionar e remover objetos em qualquer posição da lista. Collections é uma biblioteca nativa do Java que possui um conjunto de métodos que podem ser utilizados em cima de coleções para diversas finalidades. Com o uso de Stream e expressões lambda, implemente o método "ordernaListaComLambda" que recebe uma lista de inteiros como parâmetro. Faça a ordenação utilizando o método sort da classe List e retorne a lista ordenada.<br><br>
 * <b>Note:</b> Desenvolvido na linguagem Java.
 *
 * @version 1.0
 * @authors Marcos Ferreira Shirafuchi<br>
 * @since 22/03/2025
 */
public class Solution {
    public static int[] ordenarListaComLambda(int[] array) {
        return Arrays.stream(array).sorted().toArray();
    }
}
