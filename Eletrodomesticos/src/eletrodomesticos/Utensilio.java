package eletrodomesticos;

/**
 *
 * @author IFTM
 */
public class Utensilio {
    private String nome;
    private String material;
    private String tamanho;

    public Utensilio(String nome, String material, String tamanho) {
        this.nome = nome;
        this.material = material;
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getNome() {
        return nome;
    }


    public String getMaterial() {
        return material;
    }
   
}
