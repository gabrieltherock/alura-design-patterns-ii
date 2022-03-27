package br.com.gabriel.pedido.acao;

import br.com.gabriel.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido dados) {
        System.out.println("Enviando email com dados do pedido");
    }
}
