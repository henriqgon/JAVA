package exercicioclasseobjeto;

/*
    Desenvolva um programa que leia um número inteiro positivo e calcule 
o fatorial desse número. O fatorial de um número n é o produto de todos os números 
inteiros positivos de 1 até n (n!).
*/
public class Fatorial {
    private int numero;
    /*essa classe recebe um número inteiro;
        implemente getters e setters;
        implemente o método que calcule o pedido no enunciado;
        valide no setter do atributo se ele é positivo
    */
   public void setNumero(int numero){
        this.numero = 1;
        if(numero > 0){
            this.numero = numero;
        }
    }
   
   public int getNumero(){
       return calcularFatorial(this.numero);
   }
   
   public int calcularFatorial(int numero){
       return numero * (numero -1);
   }
   
}
