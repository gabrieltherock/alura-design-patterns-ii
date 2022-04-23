package br.com.gabriel;

import br.com.gabriel.http.JavaHttpClient;
import br.com.gabriel.orcamento.ItemOrcamento;
import br.com.gabriel.orcamento.Orcamento;
import br.com.gabriel.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(BigDecimal.TEN));

        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new JavaHttpClient());
        registroDeOrcamento.registrar(orcamento);
    }
}
