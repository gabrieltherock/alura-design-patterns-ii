package br.com.gabriel.imposto;

import br.com.gabriel.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {

    private final Imposto outro;

    protected Imposto(Imposto outro) {
        this.outro = outro;
    }

    public BigDecimal calcular(Orcamento orcamento) {
        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valorOutroImposto = BigDecimal.ZERO;

        if (outro != null)
            valorOutroImposto = realizarCalculo(orcamento);

        return valorImposto.add(valorOutroImposto);
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);
}
