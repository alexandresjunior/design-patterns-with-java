package loja;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    
    public static BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeDeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.10"));
        }

        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }

        return BigDecimal.ZERO;
    }

}
