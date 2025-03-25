package com.mycompany.trabalhoclasseherancaq2;

/**
 *
 * @author henri
 */
public class Principal {

    public static void main(String[] args) {
       
        // Conta Bancária 1
         
        ContaBancaria conta1 = new ContaBancaria();
        
        System.out.println("Conta 1:");
        
        conta1.setTitular("");
        conta1.setSaldo(100.0);
        conta1.setRendaMensal(1500.0);
        
        conta1.exibirInformacoes();
        
        conta1.depositar(100.0);
        System.out.println("Feito deposito.");
        System.out.println("Saldo atual: " + conta1.getSaldo() + "\n");
        
        System.out.println("Feito saque.");
        conta1.sacar(400.0);
        System.out.println("Tentativa de saque: " + "R$:" + 400.0 + "\n");
        conta1.verificarSaldo();
        
        // Conta Bancária 2
       
        ContaBancaria conta2 = new ContaBancaria();
        
        System.out.println( "\n" + "Conta 2:");
        
        conta2.setTitular("Henrique");
        conta2.setSaldo(500.0);
        conta2.setRendaMensal(4000.0);
        
        conta2.exibirInformacoes();
        
        conta2.depositar(250.0);
        System.out.println("Feito deposito.");
        System.out.println("Saldo atual: " + conta2.getSaldo() + "\n");
        
        System.out.println("Feito saque.");
        conta2.sacar(300.0);
        System.out.println("Tentativa de saque: " + "R$:" + 300.0 + "\n");
        conta2.verificarSaldo();
        
        // Conta Bancária 3
        
        ContaBancaria conta3 = new ContaBancaria();
        
        System.out.println( "\n" + "Conta 3:");
        
        conta3.setTitular("Angelica");
        conta3.setSaldo(600000.0);
        conta3.setRendaMensal(5000.0);
        
        conta3.exibirInformacoes();
        
        conta3.depositar(4500.0);
        System.out.println("Feito deposito.");
        System.out.println("Saldo atual: " + conta3.getSaldo() + "\n");
        
        System.out.println("Feito saque.");
        conta3.sacar(200.0);
        System.out.println("Tentativa de saque: " + "R$:" + 200.0 + "\n");
        conta3.verificarSaldo();
        
        // Conta poupança 1 
        System.out.println("****************************");
        
        ContaPoupanca contap1 = new ContaPoupanca();
        System.out.println("Conta Poupanca 1:");
        contap1.setTitular("Renato");
        contap1.setSaldo(300.0);
        contap1.setRendaMensal(400.0);
        contap1.exibirInformacoes();
        contap1.setTaxaJuros(2.9);
        contap1.aplicarJuros();
        System.out.println("Apos aplicacao de juros o novo saldo e: " + "\n");
        contap1.verificarSaldo();
        
        // Conta poupança 2
        
        ContaPoupanca contap2 = new ContaPoupanca();
        System.out.println( "\n" + "Conta Poupanca 2:");
        contap2.setTitular("Beatriz");
        contap2.setSaldo(7000.0);
        contap2.setRendaMensal(4000.0);
        contap2.exibirInformacoes();
        contap2.setTaxaJuros(1.8);
        contap2.aplicarJuros();
        System.out.println("Apos aplicacao de juros o novo saldo e: " + "\n");
        contap2.verificarSaldo();
        
        // Conta poupança 3
        
        ContaPoupanca contap3 = new ContaPoupanca();
        System.out.println( "\n" + "Conta Poupanca 3:");
        contap3.setTitular("Weverton");
        contap3.setSaldo(20000.0);
        contap3.setRendaMensal(8000.0);
        contap3.exibirInformacoes();
        contap3.setTaxaJuros(1.5);
        contap3.aplicarJuros();
        System.out.println("Apos aplicacao de juros o novo saldo e: " + "\n");
        contap3.verificarSaldo();
        
        // Conta Corrente 1
        System.out.println("****************************");
         
        ContaCorrente contac1 = new ContaCorrente();
        System.out.println("\n" + "Conta Corrente 1:");
        contac1.setTitular("Cleber");
        contac1.setSaldo(50.0);
        contac1.setRendaMensal(5000.0);
        contac1.setLimiteEspecial(10000.0);
        contac1.exibirInformacoes();
        System.out.println("O limite especial ajustado e: " + contac1.getLimiteEspecial());
        contac1.verificarSaldo();
        
        ContaCorrente contac2 = new ContaCorrente();
        System.out.println("\n" + "Conta Corrente 2:");
        contac2.setTitular("Pedro");
        contac2.setSaldo(5800.0);
        contac2.setRendaMensal(6000.0);
        contac2.setLimiteEspecial(2000.0);
        contac2.exibirInformacoes();
        System.out.println("O limite especial e: " + contac2.getLimiteEspecial());
        contac2.verificarSaldo();
        
        ContaCorrente contac3 = new ContaCorrente();
        System.out.println("\n" + "Conta Corrente 2:");
        contac3.setTitular("Pedro");
        contac3.setSaldo(5400.0);
        contac3.setRendaMensal(250.0);
        contac3.setLimiteEspecial(350.0);
        contac2.exibirInformacoes();
        System.out.println("O limite especial e: " + contac3.getLimiteEspecial());
        contac2.verificarSaldo();
    }
}
