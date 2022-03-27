package br.com.gabriel.desconto;

import br.com.gabriel.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends AbstractDesconto {

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return true;
    }
}
