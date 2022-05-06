package poo.model;

/**
 *
 * @author Alessandro Reis
 */
public class Cliente extends Pessoa {
    
    private int numMesa;
    private  double totalConta;

    public Cliente(int codigo, String nome, int numMesa) {
        super(codigo, nome);
        this.numMesa = numMesa;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public double getTotalConta() {
        return totalConta;
    }
    
    public void addValorComanda(double valorComanda){
        totalConta += valorComanda;
    }
    
    
}
