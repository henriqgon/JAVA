package com.poo.prjrelacaoobjetos;
import com.poo.prjrelacaoobjetos.objetos.Contato;
import com.poo.prjrelacaoobjetos.objetos.Pessoa;
import com.poo.prjrelacaoobjetos.mostrar.MostrarDados;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author IFTM
 */
public class PrjRelacaoObjetos {

    public static void main(String[] args) {
        Contato c1 = new Contato();
        Contato c2 = new Contato();
        Contato c3 = new Contato();
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        
        MostrarDados m1 = new MostrarDados();
        
        c1.setIdContato(1);
        c1.setTipoContato("telefone");
        c1.setValorContato("3831-0000");
        
        c2.setIdContato(2);
        c2.setTipoContato("email");
        c2.setValorContato("teste@email.com");
        
        c3.setIdContato(3);
        c3.setTipoContato("celular");
        c3.setValorContato("(34)9 9900-0000");
        
        p1.setIdPessoa(10);
        p1.setNome("Teste 1");
        p1.setCpf("000.111.222-99");
        p1.setData_nascimento("01/01/2000");
        List<Contato> lstContato = new ArrayList<Contato>();
        lstContato.add(c1);
        lstContato.add(c3);
        c1.setPessoa(p1);
        c3.setPessoa(p1);
        p1.setLstContato(lstContato);
        m1.mostrarDadosPessoa(p1);
        m1.mostrarDadosContato(c1);
        
        
        p2.setIdPessoa(11);
        p2.setNome("Teste 2");
        p2.setCpf("000.111.222-77");
        p2.setData_nascimento("01/01/2000");
        List<Contato> lstContato2 = new ArrayList<Contato>();
        lstContato2.add(c2);
        c2.setPessoa(p2);
        p2.setLstContato(lstContato2);
    }
}
