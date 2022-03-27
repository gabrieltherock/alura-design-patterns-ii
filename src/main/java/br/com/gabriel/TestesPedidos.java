package br.com.gabriel;

import br.com.gabriel.pedido.GeraPedido;
import br.com.gabriel.pedido.GeraPedidoHandler;
import br.com.gabriel.pedido.acao.EnviarEmailPedido;
import br.com.gabriel.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = "Gabriel";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = 2;

        GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);

        GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(new EnviarEmailPedido(), new SalvarPedidoNoBancoDeDados()));
        handler.execute(geraPedido);
    }
}
