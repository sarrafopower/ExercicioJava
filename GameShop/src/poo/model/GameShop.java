package poo.model;
/**
 *
 * @author Alessandro Reis
 */
public class GameShop {
    private int codigo;
    private int idade;
    private double qtdHoras;

    public GameShop(int codigo, int idade) {
        this.codigo = codigo;
        this.idade = idade;
    }
    
    public void comprar (double compra){
        qtdHoras += compra;
    }
    
    public void jogar (double joga){
        qtdHoras -= joga;
    }
    
    public void brinde(){
        qtdHoras = qtdHoras * 2;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getIdade() {
        return idade;
    }

    public double getQtdHoras() {
        return qtdHoras;
    }
    
    
}
