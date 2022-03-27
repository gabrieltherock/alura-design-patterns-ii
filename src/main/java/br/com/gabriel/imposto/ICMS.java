package br.com.gabriel.imposto;

import br.com.gabriel.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS implements Imposto {

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }



}
