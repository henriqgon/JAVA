/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prjrelacaoobjetos.mostrar;
import com.poo.prjrelacaoobjetos.objetos.Contato;
import com.poo.prjrelacaoobjetos.objetos.Pessoa;
/**
 *
 * @author IFTM
 */
public class MostrarDados {
    public void mostrarDadosPessoa(Pessoa pessoa) {
        System.out.println("*** Dados da Pessoa ***");
        System.out.println("ID: " + pessoa.getIdPessoa());
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("Data de Nascimento: " + pessoa.getData_nascimento());
        System.out.println("*** Contatos ***");
        for (Contato contato: pessoa.getLstContato()) {
            System.out.println("ID: " + contato.getIdContato());
            System.out.println("Tipo: " + contato.getTipoContato());
            System.out.println("Valor: " + contato.getValorContato());
        }
    }
    
    public void mostrarDadosContato(Contato contato) {
        System.out.println("*** Dados do Contato ***");
        System.out.println("ID: " + contato.getIdContato());
        System.out.println("Tipo: " + contato.getTipoContato());
        System.out.println("Valor: " + contato.getValorContato());
        System.out.println("*** Pessoa ***");
        System.out.println("ID: " + contato.getPessoa().getIdPessoa());
        System.out.println("Nome: " + contato.getPessoa().getNome());
        System.out.println("CPF: " + contato.getPessoa().getCpf());
        System.out.println("Data de Nascimento: " + contato.getPessoa().getData_nascimento());
    }
}
