package br.com.gabriel.orcamento;

public class DomainException extends RuntimeException {

    public DomainException(String mensagem) {
        super(mensagem);
    }
}
