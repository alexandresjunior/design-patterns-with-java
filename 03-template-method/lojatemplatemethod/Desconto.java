package lojatemplatemethod;

import java.math.BigDecimal;

public abstract class Desconto {
    
    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (deveAplicarDesconto(orcamento)) {
            return efetuarCalculoDoDesconto(orcamento);
        }

        return proximo.calcular(orcamento);
    }

    protected abstract BigDecimal efetuarCalculoDoDesconto(Orcamento orcamento);
    protected abstract boolean deveAplicarDesconto(Orcamento orcamento);

}
