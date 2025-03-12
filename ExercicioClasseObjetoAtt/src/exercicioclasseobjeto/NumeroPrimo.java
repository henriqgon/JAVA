package exercicioclasseobjeto;

/*
Escreva um programa que leia um número inteiro positivo e verifique se ele é 
um número primo. Um número primo é aquele que é divisível apenas por 1 e por ele mesmo.
*/
public class NumeroPrimo 
{
    /*essa classe recebe um número inteiro;
        implemente getters e setters;
        implemente o método que calcule o pedido no enunciado;
        valide no setter do atributo se ele é maior que zero
    */
    
    private int numero;
    
    // Setter de validação de numero maior que zero
    public void setNumero(int numero){
        this.numero = 1;
        if(numero > 0){
            this.numero = numero;
        }
    }
    
    //Getter para acessar a variável
    public int getNumero(){
        return this.numero;
    }
    
    //Método para verificar se o número é primo
    public boolean VerificarNumPrimo(int numero){
        if(numero <= 1){
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; 
            }
        }
        return true;
    }
    
    public void Imprimir() {
        if (VerificarNumPrimo(this.numero)) {
            System.out.println(this.numero + " e um número primo.");
        } else {
            System.out.println(this.numero + " não e um número primo.");
        }
    }
}
