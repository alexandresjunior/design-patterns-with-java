package loja;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public static BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoMaisDeCincoItens(new DescontoValorMaisDeMil(new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
