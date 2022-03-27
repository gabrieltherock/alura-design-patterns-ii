package br.com.gabriel.desconto;

import br.com.gabriel.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class AbstractDesconto {

    private AbstractDesconto proximo;

    public AbstractDesconto setProximo(AbstractDesconto proximo) {
        this.proximo= proximo;
        return proximo;
    }

    public BigDecimal calcular(Orcamento orcamento) {
        return deveAplicar(orcamento) ? efetuarCalculo(orcamento) : proximo.calcular(orcamento);
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    protected abstract boolean deveAplicar(Orcamento orcamento);
}
