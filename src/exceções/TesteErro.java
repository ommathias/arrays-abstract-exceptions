package exceções;

public class TesteErro {

	public static void main(String[] args) {


		Banco banco = new Banco("BB", 171);

		for(int i =1; i<= 10; i++)
		{
			Conta conta = new ContaCorrente();
			conta.deposita(i*100);
			banco.adiciona(conta); 
			//System.out.println("Saldo da conta: " + i + " Criada na main: " + conta.getSaldo());

		}
		
		banco.imprimeContas();


	}
}