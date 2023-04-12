package loja;

import loja.imposto.CalculadoraDeImpostos;
import loja.imposto.ICSM;
import loja.imposto.ISS;
import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        var orcamento = new Orcamento(new BigDecimal(100));
        var calculadoraDeImpostos = new CalculadoraDeImpostos();
        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ISS()));
    }

}
