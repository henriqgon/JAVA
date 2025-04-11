package eletrodomesticos;

/**
 *
 * @author Henrique
 */
public class Principal {

    public static void main(String[] args) {
        Panela p1 = new Panela("Panela de Barro", "Barro", "Media");
        Panela p2 = new Panela("Panela de Ferro", "Ferro", "Grande", "Ferro", 2.5);
        
        System.out.println("Panela 1: " + p1.getNome() + "\n" + "Material: " + p1.getMaterial() + "\n" + "Tamanho: " + p1.getTamanho() + "\n");
        System.out.println("Panela 2: " + p2.getNome() + "\n" + "Material: " + p2.getMaterial() + "\n" + "Tamanho: " + p2.getTamanho() + "\n" + "Tipo de tampa: " + p2.getTipoTampa() + "\n" + "Capacidade (L): " + p2.getCapacidadeLitros() + "\n");
        
        Eletrodomestico liquidificador = new Eletrodomestico("Liquidificador", "Plastico", "Medio");
        Eletrodomestico microondas = new Eletrodomestico("Microondas", "Plastico/Metal", "Grande", 1800, true);

        System.out.println("Eletrodomestico 1: " + liquidificador.getNome() +  "\n" + "Material: " +  liquidificador.getMaterial() + "\n" + "Tamanho: " + liquidificador.getTamanho() + "\n");
        System.out.println("Eletrodomestico 2: " + microondas.getNome() + "\n" + "Material: " + microondas.getMaterial() + "\n" + "Tamanho: " + microondas.getTamanho()
                + "\n" +  "Potencia: " + microondas.getPotencia() + " W" + "\n" + "Timer: " + (microondas.isTimer() ? "Sim" : "Nao"));
    }
        
        
    }
    
