package com.mycompany.aulaheranca;

/**
 *
 * @author IFTM
 */
public class Principal {

    public static void main(String[] args) {
        Funcionario maria = new Funcionario();
        maria.setNome("Maria");
        maria.setSobrenome("Beatriz");
        maria.setSalario(620);
        System.out.println("Funcionario: " + maria.getNome() + " " + maria.getSobrenome() + "\n" + "Salario: R$" + maria.getSalario());
        System.out.println("****************************");
        
        FuncionarioComissionado Victor = new FuncionarioComissionado();
        Victor.setNome("Victor");
        Victor.setSobrenome("Risole");
        Victor.setSalario(620);
        Victor.setComissao(50);
        Victor.setVendas(15);
        
         System.out.println("Funcionario: " + Victor.getNome() + " " + Victor.getSobrenome() + "\n" + "Salario Fixo: R$" + Victor.getSalario() +
                    "\n" + "Comissao: R$" + Victor.getComissao() + "\n" + "Qntd Vendas: " + Victor.getVendas());
         System.out.println("****************************");
         System.out.println("mais 3 vendas");
         
         System.out.println("****************************");
         
         Victor.acrescentarVendas(5);
         
         System.out.println("Funcionario: " + Victor.getNome() + " " + Victor.getSobrenome() + "\n" + "Salario Fixo: R$" + Victor.getSalario() +
                    "\n" + "Comissao: R$" + Victor.getComissao() + "\n" + "Qntd Vendas: " + Victor.getVendas() + "\n" + "Salario final: R$" + Victor.calcularComissao());
         Victor.zerarVendas();
         
         System.out.println("****************************");
         
         System.out.println("Qntd Vendas: " + Victor.getVendas() + "\n" + "Salario final: R$" + Victor.calcularComissao());
         
    }
    
}
