
public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226); /* Os atributos agencia e
		número, são obrigados a serem populados, no momento da 
		instancilização pelo construtor.*/
		
		// Agencia e numero, serão visualizados.
		
		System.out.println("Agência: " + conta.getAgencia() + ""
				+ " Numero: " + conta.getNumero()); 
		
		// Dois novos objetos conta, instânciados.
		
		Conta conta2 = new Conta(1337, 264778);
		
		Conta conta3 = new Conta(1337, 259117);
		
		/*Serão mostradas as contas existntes, por meio de um 
		  método static (pertencente a toda classe).*/
		
		System.out.println("Quantas constas existem: " + Conta.getTotal());
	}
}
