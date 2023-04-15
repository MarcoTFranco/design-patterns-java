package loja.orcamento.situacao;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento {

    public BigDecimal calcularValorDeDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    public void finalizado(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }

}
