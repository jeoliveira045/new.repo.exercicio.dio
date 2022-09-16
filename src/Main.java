import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Seth1");
		Cliente cliente2 = new Cliente();
		cliente.setNome("Seth2");
		Cliente cliente3 = new Cliente();
		cliente.setNome("Seth3");
		Cliente cliente4 = new Cliente();
		cliente.setNome("Seth4");
		Cliente cliente5 = new Cliente();
		cliente.setNome("Seth5");
		Cliente cliente6 = new Cliente();
		cliente.setNome("Seth6");
		Cliente cliente7 = new Cliente();
		cliente.setNome("Seth7");
		Cliente cliente8 = new Cliente();
		cliente.setNome("Seth8");

		Banco cando = new Banco();
		List<Conta> contas = new ArrayList<>();
		Conta cc = new ContaCorrente(cliente);
		Conta cc2 = new ContaCorrente(cliente2);
		Conta cc3 = new ContaCorrente(cliente3);
		Conta cc4 = new ContaCorrente(cliente4);
		Conta cc5 = new ContaCorrente(cliente5);
		Conta cc6 = new ContaCorrente(cliente6);
		Conta cc7 = new ContaCorrente(cliente7);
		Conta cc8 = new ContaCorrente(cliente8);
		contas.add(cc);
		contas.add(cc2);
		contas.add(cc3);
		contas.add(cc4);
		contas.add(cc5);
		contas.add(cc6);
		contas.add(cc7);
		contas.add(cc8);


		cc.depositar(100);
		
		cc.imprimirExtrato();


		ChequeEspecial.sorteio(contas);
		ChequeEspecial.ganhador(contas);

		for(Conta impconta: contas){
			System.out.println(impconta);
		}




		
	}

}
