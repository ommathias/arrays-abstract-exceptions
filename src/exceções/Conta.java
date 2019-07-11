package exceções;


public abstract class Conta {
	
	private static int total ; //variável estática que acompanha o número da conta criada
	private int id; //ID para associar a conta criada
	
	public Conta()
	{
		Conta.total = Conta.total+1; 
		this.id = total;  			 
	}

	
	public static int getTotal() {
		return total;
	}


	protected double saldo;
	
	public abstract void saca (double valor);
	
	public abstract double getSaldo();
	
	public abstract void deposita (double valor);

	@Override
	public String toString() {
		return "Conta: " + id + " [saldo=" + saldo + "]";
	}
	
	
	
}
