package br.com.gabriel.orcamento;

import java.math.BigDecimal;

public abstract class AbstractSituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new DomainException("Orcamento nao deve ser aprovado!");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("Orcamento nao deve ser reprovado!");
    }

    public void finalizar(Orcamento orcamento) {
        throw new DomainException("Orcamento nao deve ser finalizado!");
    }
}
