package loja;

import java.math.BigDecimal;

public class TesteDeDescontos {
    
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);

        System.out.println(CalculadoraDeDescontos.calcular(orcamento1));
        System.out.println(CalculadoraDeDescontos.calcular(orcamento2));
    }
    
}
