package lojatemplatemethod;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
    }

    @Override
    protected BigDecimal efetuarCalculoDoDesconto(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    protected boolean deveAplicarDesconto(Orcamento orcamento) {
        return true;
    }
    
}
