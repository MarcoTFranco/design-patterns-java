package loja.orcamento.situacao;

import loja.DomainException;
import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDeDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprovado(Orcamento orcamento) {
        throw new DomainException("Este orçamento não pode ser aprovado");
    }

    public void reprovado(Orcamento orcamento) {
        throw new DomainException("Este orçamento não pode ser reprovado");
    }

    public void finalizado(Orcamento orcamento) {
        throw new DomainException("Este orçamento não pode ser finalizado");
    }
}
