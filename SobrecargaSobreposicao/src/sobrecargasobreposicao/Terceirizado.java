package sobrecargasobreposicao;

/**
 *
 * @author IFTM
 */
public class Terceirizado extends Empregado {
    private String empresaResponsavel;
    private double valorHoraExtra;
    
    public Terceirizado(String nome, String setor, double salario, String empresaResponsavel, double valorHoraExtra) {
        super(nome, setor, salario);
        this.empresaResponsavel = empresaResponsavel;
        this.valorHoraExtra = valorHoraExtra;
    }

    public String getEmpresaResponsavel() {
        return empresaResponsavel;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }
    
//    @Override
//    public String mostrarInfo(){
//        String aux = super.mostrarInfo();
//        aux += "\nEmpesa: " + this.empresaResponsavel + "\nHora extra: R$" + this.valorHoraExtra;
//        return aux;
//    }
    
    @Override
    public String toString(){
        return super.toString() + "\nTerceirizado: [Empresa : " + this.empresaResponsavel + ", Hora Extra: " + this.valorHoraExtra + "]";
    }
}
