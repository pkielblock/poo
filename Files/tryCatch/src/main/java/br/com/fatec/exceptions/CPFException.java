package br.com.fatec.exceptions;

/**
 * Se herdar de RuntimeException = NÂO Verificada
 *           de IOException = Verificada
 */
public class CPFException extends RuntimeException {
    public CPFException() {
        super(); //Construtor da Classe Pai
    }

    public CPFException(String message) {
        super(message); //Construtor da Classe Pai
    }
}
