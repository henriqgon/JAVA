package com.mycompany.trabalhoclasseherancaq2;

/**
 *
 * @author henri
 */
public class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = (taxaJuros != null && taxaJuros >= 0.6 && taxaJuros <= 2.8)? taxaJuros : 0.6;
        if (taxaJuros >= 0.6 && taxaJuros <= 2.8){
        this.taxaJuros = taxaJuros;    
            
        } else{
          System.out.println ("Taxa de jutos invalida, mantenha entre 0.6 e 2.8");
        }
    }
    
    public void aplicarJuros(){
        setSaldo(getSaldo() + (getSaldo() * (taxaJuros / 100)));
    }
    
    
    
}
