package loja;

import loja.imposto.CalculadoraDeImpostos;
import loja.imposto.TipoImposto;
import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal(100));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        System.out.println(calculadoraDeImpostos.calcular(orcamento, TipoImposto.ISS));
    }

}
