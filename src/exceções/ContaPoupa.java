package exceções;

public class ContaPoupa extends Conta {

	@Override
	public void saca(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Nao pode sacar valor negativo");
		}
		else if (this.saldo < valor) {

			throw new SaldoInsuficienteException("",valor);
		} else {
			this.saldo-=valor;
		}        
		
	}

	@Override
	public void deposita(double valor) {
		
			if(valor<0) {
				throw new IllegalArgumentException("Valor negativo");
			}
			else
			{
				this.saldo += valor;
			}
		
	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

}
