
public class TestaSacaNegativos {

	public static void main(String[] args) {
		
		Conta conta = new Conta(); /* A variável conta, se tornou
		uma referência para um ojeto tipo conta.*/
		
		
		conta.deposita(100); // Método deposita, invocado.

		System.out.println(conta.saca(200)); /* Método saca, 
		invocado dentro do Sysout para retornar um boolean.*/
		
		System.out.println("Saldo da conta: " + conta.saldo); /*O
		atributo saldo, está encapsulado, só podendo ser visualizado
		a partir de um método.*/
		
		conta.saldo -= 101; /* É somente permitido realizar a
		atribuição, por meio do método deposita ou saca.*/
		
		System.out.println("Saldo da conta: " + conta.saldo); /* Não
		é  de uma boa prática, visualizar o valor do atributo, 
		por meio do próprio, sem a invocação de um método,
		fora da sua classe.*/
		
	}
}
