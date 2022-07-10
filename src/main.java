
public class main {
	
	public static void main(String[] args) {
		Cliente Juliana = new Cliente();
		Juliana.setNome("Juliana");
		
		Conta cc = new ContaCorrente(Juliana);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(Juliana);
		
		cc.transferir(100, poupanca);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
