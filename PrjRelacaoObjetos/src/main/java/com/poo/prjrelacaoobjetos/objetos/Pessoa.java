package com.poo.prjrelacaoobjetos.objetos;

import java.util.List;

/**
 *
 * @author IFTM
 */
public class Pessoa {
    private int idPessoa;
    private String nome;
    private String data_nascimento;
    private String cpf;
    List<Contato> lstContato;

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Contato> getLstContato() {
        return lstContato;
    }

    public void setLstContato(List<Contato> lstContato) {
        this.lstContato = lstContato;
    }
    
}
