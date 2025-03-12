package exercicioclasseobjeto;

/**
 *
 * @author Ligia
 */
/*
Escreva um programa que converta uma temperatura de Fahrenheit para Celsius. 
O sistema deve informar a temperatura em Fahrenheit e deve calcular e 
exibir a temperatura correspondente em Celsius utilizando a fórmula: C = (F - 32) * 5/9.
*/

public class Conversao {
    private double temperatura;
     /*essa classe recebe um número double;
        implemente getters e setters;
        implemente o método que calcule o pedido no enunciado;
        valide no setter do atributo se ele é maior que zero
    */
    
    // Setter para validação da temperatura
    public double setTemperatura(double temperatura){
        this.temperatura = 1.0;
        if(temperatura > 0.0){
            this.temperatura = temperatura;
        }
        return this.temperatura;
    }
     // Getter para acessar valor da temperatura
     public double getTemperatura(){
         return converterTemperatura(this.temperatura);
     }
     
     // Método para converter temperatura
     public double converterTemperatura(double temperatura){
         return (temperatura - 32) * 5 / 9;
     }
        
 }
