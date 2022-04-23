package br.com.gabriel;

import br.com.gabriel.imposto.CalculadoraDeImpostos;
import br.com.gabriel.imposto.ICMS;
import br.com.gabriel.imposto.ISS;
import br.com.gabriel.orcamento.ItemOrcamento;
import br.com.gabriel.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));
    }
}
