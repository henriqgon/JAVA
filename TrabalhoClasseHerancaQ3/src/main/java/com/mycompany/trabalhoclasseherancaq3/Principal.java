package com.mycompany.trabalhoclasseherancaq3;

/**
 *
 * @author henri
 */
public class Principal {

    public static void main(String[] args) {
        // Funcionario
        
        Funcionario fun1 = new Funcionario();
        fun1.setNome("Ana Paula");
        fun1.setSalario(50000.0);
        fun1.calcularBonus("Abril");
        fun1.calcularBonus("Dezembro");
        System.out.println("O salario fixo e: " + fun1.getSalario() + "\n");
        
        Funcionario fun2 = new Funcionario();
        fun2.setNome("Angelica");
        fun2.setSalario(100000.0);
        fun2.calcularBonus("Janeiro");
        fun2.calcularBonus("Dezembro");
        System.out.println("O salario fixo e: " + fun2.getSalario() + "\n");
        
        Funcionario fun3 = new Funcionario();
        fun3.setNome("Renata");
        fun3.setSalario(4000.0);
        fun3.calcularBonus("Julho");
        fun3.calcularBonus("Dezembro");
        System.out.println("O salario fixo e: " + fun3.getSalario() + "\n");
        
        // Gerente
        
        Gerente gerente1 = new Gerente();
        gerente1.setNome("Henrique");
        gerente1.setSalario(8000.0);
        gerente1.calcularGratificacaoGerente("Dezembro");
        System.out.println("O salario fixo e: " + gerente1.getSalario() + "\n");
        
        Gerente gerente2 = new Gerente();
        gerente2.setNome("Carlos");
        gerente2.setSalario(3500.0);
        gerente2.calcularGratificacaoGerente("Janeiro");
        System.out.println("O salario fixo e: " + gerente2.getSalario() + "\n");
        
        Gerente gerente3 = new Gerente();
        gerente3.setNome("Anastacia");
        gerente3.setSalario(3570.0);
        gerente3.calcularGratificacaoGerente("Julho");
        System.out.println("O salario fixo e: " + gerente3.getSalario() + "\n");
        
        // Programador
        
        Programador program1 = new Programador();
        program1.setNome("Andre");
        System.out.println("Programador: " + program1.getNome());
        program1.setValorPontoFuncao(10);
        program1.ExibirResultados(10);
        
        Programador program2 = new Programador();
        program2.setNome("Miguel");
        System.out.println("Programador: " + program2.getNome());
        program1.setValorPontoFuncao(30);
        program1.ExibirResultados(5);
        
        Programador program3 = new Programador();
        program3.setNome("Paulo");
        System.out.println("Programador: " + program3.getNome());
        program3.setValorPontoFuncao(80);
        program3.ExibirResultados(50);
    }
}
