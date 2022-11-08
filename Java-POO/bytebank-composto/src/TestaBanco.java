
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente tassia =  new Cliente(); /* A variável tassia, se tornou
		uma referência para um ojeto tipo cliente.*/
		
		// Atributos populados.
		
		tassia.nome = "Tassia Valadares";
		tassia.cpf = "222.222.222-22";
		tassia.profissao = "Programadora";
		
		Conta contaDaTassia = new Conta(); /* A variável contaDaTassia, se tornou
		uma referência para um ojeto tipo conta.*/
		
		contaDaTassia.deposita(100); //O valor será atribuido no atributo saldo.
		
		contaDaTassia.titular = tassia; //  Composição de objetos.
		
		System.out.println(contaDaTassia.titular.nome);/* A referência a conta, aponta
		 para o atributo titular, no titular está guardada a referência do objeto 
		 cliente, apontando para o atributo nome.*/
	}
	
}
