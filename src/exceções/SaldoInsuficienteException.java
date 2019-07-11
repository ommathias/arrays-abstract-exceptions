package exceções;

public class SaldoInsuficienteException extends RuntimeException{
	

	public SaldoInsuficienteException(String message, double valor) {
		super("Saldo insuficiente pra sacar valor de: " + valor);

    }
}
