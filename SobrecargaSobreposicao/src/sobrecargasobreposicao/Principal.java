package sobrecargasobreposicao;

/**
 *
 * @author IFTM
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Calcular soma1 = new Calcular();
        soma1.somar(5,10);
        
        Calcular soma2 = new Calcular();
        soma2.somar(5,10, 20);
        
        Calcular soma3 = new Calcular();
        soma3.somar(5.8,12.6);
//        
//      Empregado joao = new Empregado("Joao", "TI", 800.00);
//      System.out.println("*****Empregado***** \n" + joao.mostrarInfo());
//        
//      Terceirizado maria = new Terceirizado("Maria", "Turismo", 900.00, "Patos Tur", 120.00);
//      System.out.println("*****Terceirizado*****\n" + maria.mostrarInfo());

        Empregado joao = new Empregado("Joao", "TI", 800.00);
        System.out.println(joao.toString());
           
        Terceirizado maria = new Terceirizado("Maria", "Turismo", 900.00, "Patos Tur", 120.00);
        System.out.println(maria.toString());
    }
    
     
}
