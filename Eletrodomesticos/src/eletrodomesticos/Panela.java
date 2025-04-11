package eletrodomesticos;

/**
 *
 * @author IFTM
 */
public class Panela extends Utensilio {
    private String tipoTampa;
    private double capacidadeLitros;

    public Panela(String nome, String material, String tamanho) {
        super(nome, material, tamanho);
    }

    public Panela(String nome, String material, String tamanho, String tipoTampa, double capacidadeLitros) {
        super(nome, material, tamanho);
        this.tipoTampa = tipoTampa;
        this.capacidadeLitros = capacidadeLitros;
    }

    public String getTipoTampa() {
        return tipoTampa;
    }

    public double getCapacidadeLitros() {
        return capacidadeLitros;
    }
    
    
    
}
