package loja.orcamento;

import loja.orcamento.situacao.EmAnalise;
import loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private Integer quantidade;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, Integer quantidade) {
        this.valor = valor;
        this.quantidade =  quantidade;
        this.situacao = new EmAnalise();
    }

    public void aplicaDescontoExtra() {
        var valorDoDescontoExtra = this.situacao.calcularValorDeDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public void aprovar() {
        this.situacao.aprovado(this);
    }

    public void reprovar() {
        this.situacao.reprovado(this);
    }

    public void finalizado() {
        this.situacao.finalizado(this);
    }
    public BigDecimal getValor() {
        return valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }
}
