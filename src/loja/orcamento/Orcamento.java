package loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private Integer quantidade;

    public Orcamento(BigDecimal valor, Integer quantidade) {
        this.valor = valor;
        this.quantidade =  quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
}
