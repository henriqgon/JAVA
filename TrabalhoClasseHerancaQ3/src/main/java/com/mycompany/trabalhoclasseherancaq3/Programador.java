package com.mycompany.trabalhoclasseherancaq3;

/**
 *
 * @author henri
 */
public class Programador extends Funcionario{
    private double valorPontoFuncao;

    public double getValorPontoFuncao() {
        return valorPontoFuncao;
    }

    public void setValorPontoFuncao(double valorPontoFuncao) {
        this.valorPontoFuncao = valorPontoFuncao;
    }
    
    public double calcularValorDoSoftware(int linhasDeCodigo){
        return valorPontoFuncao * linhasDeCodigo;
    }
    
    public void ExibirResultados (int linhasCodigo){
        System.out.println ("O valor do software e: R$" + calcularValorDoSoftware(linhasCodigo) + "\n");
    }
}
