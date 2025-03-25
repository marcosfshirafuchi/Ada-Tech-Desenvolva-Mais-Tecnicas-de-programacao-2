package Exercicio09;

import java.util.Arrays;
import java.util.Optional;

/**
 * <h1> Desenvolva + | #1322 Stream, Optional e operadores intermediários e terminais</h1>
 * <br>Enunciado<br><br>
 * Optional de String<br><br>
 * A classe StringOptional contém o método optionalOfString que está incompleto, isto é, que requer implementação. Seu trabalho é completar a implementação desse método usando a API Optional para que, dada uma String, seja possível obter um Optional a partir dessa String. Se a String for nula ou vazia, o resultado deve ser um Optional.empty.<br><br>
 * <b>Note:</b> Desenvolvido na linguagem Java.
 *
 * @version 1.0
 * @authors Marcos Ferreira Shirafuchi<br>
 * @since 22/03/2025
 */
class StringOptional {
    public Optional<String> optionalOfString(String text) {
        // Usando trim() para remover espaços em branco
        return (text == null || text.trim().isEmpty()) ? Optional.empty() : Optional.of(text);
    }
}
