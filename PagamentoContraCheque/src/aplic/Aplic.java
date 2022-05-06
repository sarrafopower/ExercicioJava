package aplic;
import poo.model.Cliente;
import poo.model.Garcom;

/**
 *
 * @author Alessandro Reis
 */
public class Aplic {

    public static void main(String[] args) {

        Cliente c1 = new Cliente(1, "Joao", 1);
        c1.addValorComanda(220);

        System.out.println("CLIENTE ");
        System.out.println("Codigo          : " + c1.getCodigo());
        System.out.println("Nome            : " + c1.getNome());
        System.out.println("Numero da mesa  : " + c1.getNumMesa());
        System.out.println("Total Conta     : " + c1.getTotalConta());
        System.out.println("\n");

        Cliente c2 = new Cliente(2, "Maria", 2);
        c2.addValorComanda(170);

        System.out.println("CLIENTE ");
        System.out.println("Codigo          : " + c2.getCodigo());
        System.out.println("Nome            : " + c2.getNome());
        System.out.println("Numero da mesa  : " + c2.getNumMesa());
        System.out.println("Total Conta     : " + c2.getTotalConta());
        System.out.println("\n");

        Garcom g = new Garcom(1, "Abel", 10);
        g.setSalBase(1350);
        g.addGorjeta(c2.getTotalConta() + c1.getTotalConta());

        System.out.println("GARÇOM");
        System.out.println("Codigo          : " + g.getCodigo());
        System.out.println("Nome            : " + g.getNome());
        System.out.println("Salario Base    : " + g.getSalBase());
        System.out.println("Taxa de Serviço : " + g.getTaxaServico());
        System.out.println("Total Gorjeta   : " + g.getTotalGorjeta());
        System.out.println("Salario Final   : " + g.calcSalarioFinal());

    }

}
