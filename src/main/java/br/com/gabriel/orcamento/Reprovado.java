package br.com.gabriel.orcamento;

public class Reprovado extends AbstractSituacaoOrcamento {

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
