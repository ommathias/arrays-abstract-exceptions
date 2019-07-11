package exceções;

public class ContaCorrente extends Conta{

	public double getSaldo()
	{
		return this.saldo;
	}

	public void deposita(double valor)
	{	
		if(valor<0) {
			throw new IllegalArgumentException("Valor negativo");
		}
		else
		{
			this.saldo += valor;
		}
	}

	public void saca (double valor) {

		if (valor <= 0) {
			throw new IllegalArgumentException("Nao pode sacar valor negativo");
		}
		else if (this.saldo < valor) {

			throw new SaldoInsuficienteException("",valor);
		} else {
			this.saldo-=valor;
		}        
	}



}


