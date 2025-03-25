package Exercicio10;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <h1> Desenvolva + | #1322 Stream, Optional e operadores intermediários e terminais</h1>
 * <br>Enunciado<br><br>
 * Convertendo String para maiúsculas com Streams e Collections<br><br>
 * O sistema de cadastro de clientes foi criado sem uma validação importante, não deveria ser permitido inserir nomes com as letras em minúsculo. Com essa falha, o banco de dados ficou sem um padrão, pois alguns nomes foram digitados e salvos sem estarem totalmente em maiúsculo. Para conformizar a base de clientes, você deve fazer um método que receba uma lista de nomes em formatos diferentes e retornar uma nova lista contendo os mesmos nomes, porém com todas as letras maiúsculas. Siga o exemplo de código para criar sua solução.<br><br>
 * <b>Note:</b> Desenvolvido na linguagem Java.
 *
 * @version 1.0
 * @authors Marcos Ferreira Shirafuchi<br>
 * @since 22/03/2025
 */
class CorretorDeNomes {
    public List<String> corrigir(List<String> nomes) {
        return nomes.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
