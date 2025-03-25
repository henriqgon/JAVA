package com.mycompany.trabalhoclasseherancaq2;

/**
 *
 * @author henri
 */
public class ContaBancaria {
    private String titular;
    private Double saldo;
    private Double rendaMensal;
    

    public String getTitular() {
        return titular;
    }

    // Validação para ver se o titular não recebe vazio
    public void setTitular(String titular) {
        if (titular == null || titular.trim().equals("")) {
            this.titular = "Nao identificado";
        } else {
            this.titular = titular;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(Double rendaMensal) {
        this.rendaMensal = (rendaMensal != null && rendaMensal >= 3036)? rendaMensal : 3036;
    }
    
    public void depositar(double montante){
        saldo += montante;
    }
    
    public void sacar(double montante){
        if(saldo >= montante){
            saldo -= montante;
            System.out.println("Saque efetuado com sucesso");
        } else{
            System.out.println("Saldo Insuficiente");
        }
    }
    
    public void verificarSaldo(){
       System.out.println ("Saldo do titular: " + titular + " " + "e R$: " + " " + saldo);
    }
    
     public void exibirInformacoes() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Renda Mensal: " + rendaMensal);
    }
    
}
