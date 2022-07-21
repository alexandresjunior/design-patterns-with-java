package lojatemplatemethod;

import java.math.BigDecimal;

public class DescontoMaisDeCincoItens extends Desconto {

    public DescontoMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    protected BigDecimal efetuarCalculoDoDesconto(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.10"));
    }

    @Override
    protected boolean deveAplicarDesconto(Orcamento orcamento) {
        return orcamento.getQuantidadeDeItens() > 5;
    }
    
}
