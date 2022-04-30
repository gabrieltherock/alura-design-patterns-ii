package br.com.gabriel.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel {

    private BigDecimal valor;
    private final List<Orcavel> itens;
    private AbstractSituacaoOrcamento situacao;

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
        this.situacao = new EmAnalise();
    }

    @Override
    public BigDecimal getValor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return valor;
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDescontoExtra = situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public int getQuantidadeItens() {
        return itens.size();
    }

    public void adicionarItem(Orcavel itemOrcamento) {
        this.valor = valor.add(itemOrcamento.getValor());
        this.itens.add(itemOrcamento);
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
