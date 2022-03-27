package br.com.gabriel.desconto;

import br.com.gabriel.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        AbstractDesconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDeCincoItens();

        cadeiaDeDescontos.setProximo(new DescontoParaOrcamentoComValorMaiorQueQuinhentos())
                .setProximo(new SemDesconto());

        return cadeiaDeDescontos.calcular(orcamento);
    }
}
