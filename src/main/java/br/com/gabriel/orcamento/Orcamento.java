package br.com.gabriel.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private final int quantidadeItens;

    private AbstractSituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDescontoExtra = situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }

    public AbstractSituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(AbstractSituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public boolean isFinalizado() {
        return situacao instanceof Finalizado;
    }
}
