package Exercicio14;

import java.util.List;

/**
 * <h1> Desenvolva + | #1322 Stream, Optional e operadores intermediários e terminais</h1>
 * <br>Enunciado<br><br>
 * Dobrando uma lista de inteiros<br><br>
 * A API Java Streams fornece meios de realizar operações em coleções, sem contudo, modificar a coleção original, retornando uma nova estrutura de dados dos resultados.<br><br>
 * <p>
 * O método dobrar da classe Multiplicador a seguir deve funcionar de forma que, dada uma lista de inteiros, retorne uma lista onde cada inteiro é multiplicado por 2. Implemente o corpo desse método para alcançar o resultado esperado. Use o método replaceAll para chamar o lambda uma vez para cada item da lista.<br><br>
 * <p>
 * <b>Note:</b> Desenvolvido na linguagem Java.
 *
 * @version 1.0
 * @authors Marcos Ferreira Shirafuchi<br>
 * @since 22/03/2025
 */
class Multiplicador {

    public List<Integer> dobrar(List<Integer> numeros) {
        numeros.replaceAll(n -> n * 2);
        return numeros;
    }
}
