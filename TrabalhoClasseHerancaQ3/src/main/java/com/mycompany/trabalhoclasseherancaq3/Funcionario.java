package com.mycompany.trabalhoclasseherancaq3;

/**
 *
 * @author henri
 */
    public class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void calcularBonus(String mesDePagamento){
        Double salariof = salario;
        
        if( mesDePagamento.equalsIgnoreCase("Dezembro")){
            salariof = salario + salario * 0.10; 
        }
        
        System.out.println ("Funcionario: " + nome + "\n" +  "Salario para o mes de: " + mesDePagamento + "\n" + "R$: " + salariof);
    }
}
