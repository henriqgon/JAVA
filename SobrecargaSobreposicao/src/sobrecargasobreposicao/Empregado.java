package sobrecargasobreposicao;

/**
 *
 * @author IFTM
 */
public class Empregado {
    private String nome;
    private String setor;
    private double salario;

    public Empregado(String nome, String setor, double salario) {
        this.nome = nome;
        this.setor = setor;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public String getSetor() {
        return setor;
    }
    
//    public String mostrarInfo(){
//        String mostrar = "Nome: " + this.nome + "\nSetor: " + this.setor + "\nSalario: R$" + this.salario;
//        return mostrar;
//    }
    
    @Override
    public String toString(){
        return "Empregado : [Nome: " + this.nome + ", Setor: " + this.setor + ", Salario: " + this.salario + "]";
    }
}
