package loja.imposto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICSM implements Imposto {

    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

}
