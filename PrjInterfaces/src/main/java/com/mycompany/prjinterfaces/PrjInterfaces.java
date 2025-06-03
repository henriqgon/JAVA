package com.mycompany.prjinterfaces;


import com.mycompany.prjinterfaces.classes.ContaCorrente;
import com.mycompany.prjinterfaces.classes.ContaPoupanca;
import com.mycompany.prjinterfaces.classes.GerarExtratos;
/**
 *
 * @author IFTM
 */
public class PrjInterfaces {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1500);
        cc.sacar(300);
        
        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(900);
        cp.sacar(25);
        
        GerarExtratos gerador = new GerarExtratos();
        gerador.geradorExtratoConta(cc);
        gerador.geradorExtratoConta(cp);
    }
}
