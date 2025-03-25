package Exercicio01;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class AnalisadorIdade {
    /**
     * <h1> Desenvolva + | #1322 Stream, Optional e operadores intermediários e terminais</h1>
     * <br>Enunciado<br><br>
     * Usando Predicates<br><br>
     * A sintaxe de predicado (java.util.function.Predicate) foi introduzida no Java 8 como uma forma alternativa de lidar com impressões de avaliação no Lambda. A interface padrão é Predicate, onde T é um único argumento que retorna um valor booleano. Os predicados Java possuem um método funcional (abstrato) test(Object) que avalia esse predicado em um determinado objeto.<br><br>
     *
     * A classe a seguir possui dois métodos, a saber:<br><br>
     *
     * criarVerificador: Cria um Predicate que verifica se uma idade é menor que 18;<br>
     * remover: Remove todos os objetos da coleção para os quais verificador.test(obj) é verdadeiro.<br><br>
     * Complete o código desses métodos para obter o resultado esperado.<br><br>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @version 1.0
     * @authors Marcos Ferreira Shirafuchi<br>
     * @since 22/03/2025
     */
    public Predicate<Integer> criarVerificador() {
        // Cria um predicado que verifica se a idade é menor que 18
        return idade -> idade < 18;
    }

    public List<Integer> remover(List<Integer> colecao, Predicate<Integer> verificador) {
        // Filtra a lista removendo os elementos que satisfazem o predicado
        return colecao.stream()
                .filter(verificador.negate()) // Mantém apenas os que NÃO satisfazem o predicado
                .collect(Collectors.toList());

    }
}
