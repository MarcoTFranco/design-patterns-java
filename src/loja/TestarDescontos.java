package loja;

import loja.desconto.CalculadoraDeDescontos;
import loja.imposto.CalculadoraDeImpostos;
import loja.imposto.ICSM;
import loja.imposto.ISS;
import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestarDescontos {

    public static void main(String[] args) {

        var primeiro = new Orcamento(new BigDecimal("200"), 6);
        var segundo = new Orcamento(new BigDecimal("1000"), 7);
        var calculadoraDeDescontos = new CalculadoraDeDescontos();

        System.out.println(calculadoraDeDescontos.calcular(primeiro));
        System.out.println(calculadoraDeDescontos.calcular(segundo));
    }

}

