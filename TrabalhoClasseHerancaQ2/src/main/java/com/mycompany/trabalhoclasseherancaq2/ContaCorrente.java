package com.mycompany.trabalhoclasseherancaq2;

/**
 *
 * @author henri
 */
public class ContaCorrente extends ContaBancaria{
    private Double limiteEspecial;

    public Double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(Double limiteEspecial) {
      Double limiteMax = getRendaMensal() * 0.4;
        if(limiteEspecial <= limiteMax){
         this.limiteEspecial = limiteEspecial;  
        } else{
            System.out.println ("Limite invalido ajustando para o permitido");
            this.limiteEspecial = limiteMax;
        }
    }

    
    
    
    
}
