package com.mycompany.trabalhoclasseherancaq3;

/**
 *
 * @author henri
 */
public class Gerente extends Funcionario {
    private double gratificacao;

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }
    
    public void calcularGratificacaoGerente(String mesDePagamento) {
        double salariof = getSalario();
        
        if (mesDePagamento.equalsIgnoreCase("Dezembro")) {
            salariof += salariof * 0.10;
        }
        
        salariof += 500;
        
        System.out.println("Gerente: " + getNome() + "\n" + "Salario para o mes de: " + mesDePagamento + "\n" + "R$: " + salariof);
    }
}


