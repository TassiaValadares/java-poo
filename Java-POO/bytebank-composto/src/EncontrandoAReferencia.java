
public class EncontrandoAReferencia {

	public static void main(String[] args) {
		
		Conta ContaDaTassia = new Conta(); /* A vari�vel contaDaTassia, se tornou
		uma refer�ncia para um ojeto tipo conta.*/
		
		ContaDaTassia.titular = new Cliente(); // Composi��o de objetos direta.
		
		ContaDaTassia.titular.nome = "Tassia Almeida Valadares"; /* A refer�ncia a 
		conta, aponta para o atributo titular, no titular est� guardada a refer�ncia 
		do objeto cliente, apontando para o atributo nome.*/
		
		System.out.println("Nome do Titular: " + ContaDaTassia.titular.nome);/*Ser� 
		mostrado o nome do titular da conta.*/
	}
}
