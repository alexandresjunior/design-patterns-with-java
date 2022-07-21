package lojachainofresponsibility;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadeDeItens;

    public Orcamento(BigDecimal valor) {
        this.valor = valor;
    }

    public Orcamento(BigDecimal valor, int quantidadeDeItens) {
        this.valor = valor;
        this.quantidadeDeItens = quantidadeDeItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public int getQuantidadeDeItens() {
        return quantidadeDeItens;
    }

    public void setQuantidadeDeItens(int quantidadeDeItens) {
        this.quantidadeDeItens = quantidadeDeItens;
    }

}