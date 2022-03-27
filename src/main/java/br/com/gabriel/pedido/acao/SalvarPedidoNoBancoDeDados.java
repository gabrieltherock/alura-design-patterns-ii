package br.com.gabriel.pedido.acao;

import br.com.gabriel.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido dados) {
        System.out.println("Salvando pedido no banco de dados...");
    }
}
