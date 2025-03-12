package exercicioclasseobjeto;


public class SomaDigitos { 
    private int numero;
    
    public void setNumero(int numero){
        this.numero = 10;
        if(numero < 10){
            this.numero = numero;
        }
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public int somarDigitos(int numero){
        int soma = 0;
        
        while(numero > 0){
            soma+= numero % 10;
            numero = numero / 10;
        }
        return soma;
    }
}
