package lojastrategy;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public static BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }

}
