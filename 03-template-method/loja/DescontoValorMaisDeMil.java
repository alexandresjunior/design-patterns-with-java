package loja;

import java.math.BigDecimal;

public class DescontoValorMaisDeMil extends Desconto {

    public DescontoValorMaisDeMil(Desconto proximo) {
        super(proximo);
    } 

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }

        return proximo.calcular(orcamento);
    }
    
}
