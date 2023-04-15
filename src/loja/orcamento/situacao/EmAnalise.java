package loja.orcamento.situacao;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento {
    @Override
    public BigDecimal calcularValorDeDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void aprovado(Orcamento orcamento) {
        orcamento.setSituacao(new Aprovado());
    }

    @Override
    public void reprovado(Orcamento orcamento) {
        orcamento.setSituacao(new Reprovado());
    }

}
