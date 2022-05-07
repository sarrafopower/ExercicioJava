import poo.model.GameShop;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Alessandro Reis
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);
        
        int codCliente, idadeCliente, op;
        double qtdeHoras, comprarHoras, usarHoras;
        
        
        System.out.println("Insira o codigo do cliente: ");
        codCliente = entrada.nextInt();
        System.out.println("Digite a idade do cliente: ");
        idadeCliente = entrada.nextInt();
        
        GameShop objGS = new GameShop(codCliente, idadeCliente);
        
        do{
            System.out.println("\n1 - Comprar Horas");
            System.out.println("2 - Jogar");
            System.out.println("3 - Brinde");
            System.out.println("4 - Consultar Saldo");
            System.out.println("5 - Sair");
            System.out.println("\n\tDigite a opção: ");
            op = entrada.nextInt();
            
            switch(op){
                case 1: System.out.println("Digite o valor de horas a ser comprada: ");
                        comprarHoras = entrada.nextDouble();
                        objGS.comprar(comprarHoras);
                        break;
                case 2: System.out.println("Digite a quantidade de horas jogada: ");
                        usarHoras = entrada.nextDouble();
                        if(usarHoras <= objGS.getQtdHoras()){
                            objGS.jogar(usarHoras);
                        }else{
                            System.out.println("Valor Insuficiente:");
                        }
                        break;
                case 3: objGS.brinde();
                        break;
                case 4: System.out.println("Saldo: " + df.format(objGS.getQtdHoras()));
            }
            
        }while(op < 5);
    }
    
}
