package Exercicio05;

import java.util.Arrays;
/**
 * <h1> Desenvolva + | #1322 Stream, Optional e operadores intermediários e terminais</h1>
 * <br>Enunciado<br><br>
 * Calculando a média dos números pares de um array<br><br>
 * Para tornar a linguagem Java funcional, o uso de expressões lambdas, ou simplesmente lambdas, foi incorporado a partir da versão 8. Sendo assim, utilizando funções de programação funcional, escreva um método em java chamado calculaMediaPares que recebe um array de inteiros e retorna a média dos números pares do array.<br><br>
 * <b>Note:</b> Desenvolvido na linguagem Java.
 *
 * @version 1.0
 * @authors Marcos Ferreira Shirafuchi<br>
 * @since 22/03/2025
 */
public class Solution {
    public static double calculaMediaPares(int[] input) {
        return Arrays.stream(Arrays.stream(input).filter(n -> n % 2 == 0).toArray()).average().getAsDouble();
    }
}
