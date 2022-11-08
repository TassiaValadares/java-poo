
public class EncontrandoAReferencia {

	public static void main(String[] args) {
		
		Conta ContaDaTassia = new Conta(); /* A variável contaDaTassia, se tornou
		uma referência para um ojeto tipo conta.*/
		
		ContaDaTassia.titular = new Cliente(); // Composição de objetos direta.
		
		ContaDaTassia.titular.nome = "Tassia Almeida Valadares"; /* A referência a 
		conta, aponta para o atributo titular, no titular está guardada a referência 
		do objeto cliente, apontando para o atributo nome.*/
		
		System.out.println("Nome do Titular: " + ContaDaTassia.titular.nome);/*Será 
		mostrado o nome do titular da conta.*/
	}
}
