import java.util.List;
import java.util.Random;

public class ChequeEspecial{
    static Random rand = new Random();
    public static void sorteio(List <Conta> contas){
        for(Conta cliente: contas){
            Integer numeroDeSorteio = rand.nextInt(10);
            cliente.setNumeroDoSorteio(numeroDeSorteio);
        }
    }

    public static void ganhador(List<Conta> contas){
        Integer numeroDeSorteio = rand.nextInt(10);
        for(Conta cliente: contas){
            if(cliente.getNumeroDoSorteio().equals(numeroDeSorteio)){
                System.out.println("O numero " + cliente.getNumeroDoSorteio() + " é o ganhador do consórcio");
                cliente.depositar(1000);
            }
        }
    }
}