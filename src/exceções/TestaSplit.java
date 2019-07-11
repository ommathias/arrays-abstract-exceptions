package exceções;

public class TestaSplit  {
	
	public static void main (String[] args)
	{
 
	 String frase = "Socorram-me, subi no ônibus em Marrocos";
	 String[] palavras = frase.split(" ");
	 
	 int n = palavras.length;
	 
	 for(int i=n-1; i>=0;i--)
	 {
		 System.out.println(palavras[i]);
	 }

	
	}}
