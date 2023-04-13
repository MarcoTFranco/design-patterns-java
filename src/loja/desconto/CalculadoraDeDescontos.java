package loja.desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {


    public BigDecimal calcular(Orcamento orcamento) {

        var desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhetos(
                        new SemDesconto()));

        return desconto.calcular(orcamento);
    }

}
