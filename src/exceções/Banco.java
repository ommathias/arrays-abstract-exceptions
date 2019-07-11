package exceções;

public class Banco {
	private String nome;
	private int numero;
	private Conta[] contas;

	// outros atributos que você achar necessário

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ContaCorrente[10];
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}
	
	

	

	public void adiciona(Conta c)
	{
		for(int i = 0; i < this.contas.length; i++){
			if(this.contas[i] == null) {
				this.contas[i] = c;
				//System.out.println("Adicionada conta: "+ c + "na posição: "+ i);
				break;
				}
		}
	}
	
	public void imprimeContas()
	{
		for(Conta x: contas)
		{
			System.out.println("Saldo da conta: " + x );
		} 
		System.out.println("total de contas: " + Conta.getTotal());
	}


}