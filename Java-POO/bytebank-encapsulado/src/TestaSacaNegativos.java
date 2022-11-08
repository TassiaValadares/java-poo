
public class TestaSacaNegativos {

	public static void main(String[] args) {
		
		Conta conta = new Conta(); /* A vari�vel conta, se tornou
		uma refer�ncia para um ojeto tipo conta.*/
		
		
		conta.deposita(100); // M�todo deposita, invocado.

		System.out.println(conta.saca(200)); /* M�todo saca, 
		invocado dentro do Sysout para retornar um boolean.*/
		
		System.out.println("Saldo da conta: " + conta.saldo); /*O
		atributo saldo, est� encapsulado, s� podendo ser visualizado
		a partir de um m�todo.*/
		
		conta.saldo -= 101; /* � somente permitido realizar a
		atribui��o, por meio do m�todo deposita ou saca.*/
		
		System.out.println("Saldo da conta: " + conta.saldo); /* N�o
		�  de uma boa pr�tica, visualizar o valor do atributo, 
		por meio do pr�prio, sem a invoca��o de um m�todo,
		fora da sua classe.*/
		
	}
}
