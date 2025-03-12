package exercicioclasseobjeto;

/**
 *
 * @author Ligia
 */
public class Principal {

    public static void main(String[] args) 
    {
        //CONVERSAO.JAVA
         Conversao converter = new Conversao();
         converter.setTemperatura(150);
         System.out.println("Temperatura em Fahrenheit: " + converter.setTemperatura(150) + "ºF");
         double celsius = converter.getTemperatura();
         System.out.println("Temperatura em Celsius: " + celsius + "ºC");
        
        
        //FATORIAL.JAVA
        Fatorial numero = new Fatorial();
        numero.setNumero(5);
        int mostrar = numero.getNumero();
        System.out.println("O fatorial do numero digitado e : " + mostrar);
        
        //NUMEROPRIMO.JAVA
        NumeroPrimo nump = new NumeroPrimo();
        nump.setNumero(7);
        nump.Imprimir();
        
        //SomaDigitos.JAVA
        SomaDigitos soma = new SomaDigitos();
        soma.setNumero(159);
        int resultado = soma.somarDigitos(159);
        System.out.println("A soma dos digitos do numero e: " + resultado);
    }
    
}