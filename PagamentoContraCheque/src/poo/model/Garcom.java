package poo.model;

/**
 *
 * @author Alessandro Reis
 */
public class Garcom extends Pessoa {
    
    private double SalBase;
    private final double taxaServico;
    private double totalGorjeta;

    public Garcom(int codigo, String nome, double taxaServico) {
        super(codigo, nome);
        this.taxaServico = taxaServico;
    }

    public void setSalBase(double SalBase) {
        this.SalBase = SalBase;
    }

    public double getSalBase() {
        return SalBase;
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public double getTotalGorjeta() {
        return totalGorjeta;
    }
    
   public void addGorjeta(double valorConta){
       totalGorjeta += valorConta * (taxaServico/100);
   }
   
   public double calcSalarioFinal(){
       return getSalBase() + getTotalGorjeta();
   }
    
}
