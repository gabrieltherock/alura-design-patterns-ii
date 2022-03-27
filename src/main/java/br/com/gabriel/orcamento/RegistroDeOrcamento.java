package br.com.gabriel.orcamento;

import br.com.gabriel.http.HttpAdapter;

import java.util.HashMap;
import java.util.Map;

public class RegistroDeOrcamento {

    private final HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento) {
        if (!orcamento.isFinalizado())
            throw new DomainException("Orcamento nao finalizado");

        String url = "http://apiexterna/orcamento";
        Map<String, Object> dados = new HashMap<>();
        dados.put("valor", orcamento.getValor());
        dados.put("quantidadeItens", orcamento.getQuantidadeItens());

        http.post(url, dados);
    }
}
