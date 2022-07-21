package loja;

import java.math.BigDecimal;

public class TestesDeImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));

        System.out.println(CalculadoraDeImpostos.calcular(orcamento, TipoImposto.ICMS));
        System.out.println(CalculadoraDeImpostos.calcular(orcamento, TipoImposto.ISS));
    }

}
