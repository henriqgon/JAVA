package com.mycompany.trabalhoclassehenranca;

public class Principal {

    public static void main(String[] args) {
        //Pessoas
        
       Pessoa henrique = new Pessoa();
       henrique.setCodigo(1);
       henrique.setNome("Henrique");
       henrique.setDataCadastro("01/01/2025");
       System.out.println("Pessoas:");
       System.out.println( "\n" + "Codigo: " + henrique.getCodigo() + "\n" + "Nome: " 
               + henrique.getNome() + "\n" + "Data de Cadastro: " + henrique.getDataCadastro());
      
       Pessoa angelica = new Pessoa();
       angelica.setCodigo(2);
       angelica.setNome("Angelica");
       angelica.setDataCadastro("02/01/2025");
       System.out.println( "\n" + "Codigo: " + angelica.getCodigo() + "\n" + "Nome: " 
               + angelica.getNome() + "\n" + "Data de Cadastro: " + angelica.getDataCadastro());
       
       //Clientes 
        
       Cliente andre = new Cliente();
       andre.setCodigo(3);
       andre.setNome("Andre");
       andre.setDataCadastro("03/01/2025");
       andre.setEmail("andre03@gmail.com");
       andre.setTelefone("(34)9 9857-4268");
       System.out.println("*****************************");
       System.out.println( "\n" + "Clientes:");
       System.out.println("\n" + "Codigo: " + andre.getCodigo() + "\n" + "Nome: " 
               + andre.getNome() + "\n" + "Data de Cadastro: " + andre.getDataCadastro() + "\n" + 
                       "Email: " + andre.getEmail() + "\n" + "Telefone: " + andre.getTelefone());
       
       Cliente marcela = new Cliente();
       marcela.setCodigo(4);
       marcela.setNome("Marcela");
       marcela.setDataCadastro("04/01/2025");
       marcela.setEmail("marcela04@gmail.com");
       marcela.setTelefone("(34)9 9456-4518");
       System.out.println("\n" + "Codigo: " + marcela.getCodigo() + "\n" + "Nome: " 
               + marcela.getNome() + "\n" + "Data de Cadastro: " + marcela.getDataCadastro() + "\n" + 
                       "Email: " + marcela.getEmail() + "\n" + "Telefone: " + marcela.getTelefone());
       
       // Usuários
       
       Usuario clayton = new Usuario();
       clayton.setCodigo(5);
       clayton.setNome("Clayton");
       clayton.setDataCadastro("05/01/2025");
       clayton.setLogin("clayton123");
       clayton.setSenha("123Mudar");
       System.out.println("*****************************");
       System.out.println( "\n" + "Usuarios:");
       System.out.println("\n" + "Codigo : " + clayton.getCodigo() + "\n" + "Nome: " 
               + clayton.getNome() + "\n" + "Data de Cadastro: " + clayton.getDataCadastro() + "\n" 
                       +  "Login: " + clayton.getLogin() + "\n" + "Senha: " + clayton.getSenha());
       
       Usuario leticia = new Usuario();
       leticia.setCodigo(6);
       leticia.setNome("Leticia");
       leticia.setDataCadastro("06/01/2025");
       leticia.setLogin("leticia321");
       leticia.setSenha("123Mudar*");
       System.out.println("\n" + "Codigo : " + leticia.getCodigo() + "\n" + "Nome: " 
               + leticia.getNome() + "\n" + "Data de Cadastro: " + leticia.getDataCadastro() + "\n" 
                       +  "Login: " + leticia.getLogin() + "\n" + "Senha: " + leticia.getSenha());
       
    }
}
