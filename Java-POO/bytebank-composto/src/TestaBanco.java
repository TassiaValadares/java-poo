
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente tassia =  new Cliente(); /* A vari�vel tassia, se tornou
		uma refer�ncia para um ojeto tipo cliente.*/
		
		// Atributos populados.
		
		tassia.nome = "Tassia Valadares";
		tassia.cpf = "222.222.222-22";
		tassia.profissao = "Programadora";
		
		Conta contaDaTassia = new Conta(); /* A vari�vel contaDaTassia, se tornou
		uma refer�ncia para um ojeto tipo conta.*/
		
		contaDaTassia.deposita(100); //O valor ser� atribuido no atributo saldo.
		
		contaDaTassia.titular = tassia; //  Composi��o de objetos.
		
		System.out.println(contaDaTassia.titular.nome);/* A refer�ncia a conta, aponta
		 para o atributo titular, no titular est� guardada a refer�ncia do objeto 
		 cliente, apontando para o atributo nome.*/
	}
	
}
