package eletrodomesticos;

/**
 *
 * @author henri
 */
public class Eletrodomestico extends Utensilio {
    private int potencia;
    private boolean timer;
    
    
    public Eletrodomestico(String nome, String material, String tamanho) {
        super(nome, material, tamanho);
    }
    
   public Eletrodomestico(String nome, String material, String tamanho, int potenciaWatts, boolean temTimer) {
        super(nome, material, tamanho);
        this.potencia = potenciaWatts;
        this.timer = temTimer;
    }

    public int getPotencia() {
        return potencia;
    }

    public boolean isTimer() {
        return timer;
    }
    
    
}
