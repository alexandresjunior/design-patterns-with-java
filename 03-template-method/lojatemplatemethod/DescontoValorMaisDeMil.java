package lojatemplatemethod;

import java.math.BigDecimal;

public class DescontoValorMaisDeMil extends Desconto {

    public DescontoValorMaisDeMil(Desconto proximo) {
        super(proximo);
    } 

    @Override
    protected BigDecimal efetuarCalculoDoDesconto(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    protected boolean deveAplicarDesconto(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
    
}
