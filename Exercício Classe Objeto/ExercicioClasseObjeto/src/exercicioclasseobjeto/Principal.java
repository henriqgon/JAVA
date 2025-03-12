package exercicioclasseobjeto;

/**
 *
 * @author Ligia
 */
public class Principal {

    public static void main(String[] args) 
    {
        //CONVERSAO.JAVA
        // Conversao converter = new Conversao();
        // converter.setTemperatura(150);
        // System.out.println("Temperatura em Fahrenheit: " + converter.setTemperatura(150) + "ºF");
        // double celsius = converter.getTemperatura();
        // System.out.println("Temperatura em Celsius: " + celsius + "ºC");
        
        
        //FATORIAL.JAVA
        Fatorial numero = new Fatorial();
        numero.setNumero(8);
        int mostrar = numero.getNumero();
        System.out.println(mostrar);
    }
    
}
