
package exercicioclasseobjeto;

/*
    Desenvolva um programa que leia um número inteiro positivo e calcule 
o fatorial desse número. O fatorial de um número n é o produto de todos os números 
inteiros positivos de 1 até n (n!).
*/
public class Fatorial {
    private int numero;
    
    // Setter para validação de número positivo
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
       int fatorial = 1;
       for(int i = 1; i <= numero; i++){
           fatorial*= i;
       }
       return fatorial;
   }
   
}
