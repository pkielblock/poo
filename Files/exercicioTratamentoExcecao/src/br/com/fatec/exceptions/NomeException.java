package br.com.fatec.exceptions;

public class NomeException extends Exception {
    public NomeException() {
        super();
    }

    public NomeException(String erro) {
        super(erro);
    }
}
