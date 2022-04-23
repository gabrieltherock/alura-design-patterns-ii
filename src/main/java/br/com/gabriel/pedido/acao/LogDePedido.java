package br.com.gabriel.pedido.acao;

import br.com.gabriel.pedido.Pedido;

public class LogDePedido implements AcaoAposGerarPedido {


    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Pedido foi gerado: " + pedido.getData());
    }
}
