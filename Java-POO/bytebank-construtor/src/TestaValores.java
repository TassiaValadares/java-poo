
public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226); /* Os atributos agencia e
		n�mero, s�o obrigados a serem populados, no momento da 
		instanciliza��o pelo construtor.*/
		
		// Agencia e numero, ser�o visualizados.
		
		System.out.println("Ag�ncia: " + conta.getAgencia() + ""
				+ " Numero: " + conta.getNumero()); 
		
		// Dois novos objetos conta, inst�nciados.
		
		Conta conta2 = new Conta(1337, 264778);
		
		Conta conta3 = new Conta(1337, 259117);
		
		/*Ser�o mostradas as contas existntes, por meio de um 
		  m�todo static (pertencente a toda classe).*/
		
		System.out.println("Quantas constas existem: " + Conta.getTotal());
	}
}
