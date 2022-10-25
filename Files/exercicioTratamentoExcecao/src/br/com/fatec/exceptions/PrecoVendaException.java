package br.com.fatec.exceptions;

public class PrecoVendaException extends RuntimeException{
    public PrecoVendaException() {
        super();
    }

    public PrecoVendaException(String erro) {
        super(erro);
    }
}
