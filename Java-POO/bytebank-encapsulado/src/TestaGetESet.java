
public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(); /*A variável conta, se tornou 
		uma referência para um objeto tipo conta, instânciado.
		*/
		
		conta.setNumero(1337); /* Atráves do método setNumero, foi 
		alterado o valor do atributo.*/
		
		/*Será mostrado o valor populado ao atributo numero, com 
		 a visualização permitida atráves do método getNumero.*/ 
		
		System.out.println("Número da conta: " + conta.getNumero());
		
		Cliente tassia = new Cliente(); /*A variável tassia, se 
		tornou uma referência para um objeto tipo cliente, 
		instânciado.*/
		
		
		tassia.setNome("Tassia Almeida Valadares"); /*O "valor" da
		variável nome, foi alterado através do método setNome.*/
		
		conta.setTitular(tassia); /* O atributo titular, agora 
		guarda a referência da instânciação do objeto tipo cliente.*/
		
		/*Será mostrado o nome do titular, através das invocações
		 dos métodos, no qual getTitular mostra a referência ao o 
		 objeto tipo cliente, fazendo getNome  mostrar seu "valor".*/
		
		System.out.println("Nome do(a) titular: " + conta.getTitular().getNome());
		
		/* Será modificado o numero de CPF, através das invocações
		 dos métodos, no qual getTitular mostra a referência ao o 
		 objeto tipo cliente, fazendo o setCpf disponibilizar seu 
		 parâmetro para modificar o CPF.*/
		
		conta.getTitular().setCpf("000.000.000-00");
		
		/* Será modificado a profissão, através das invocações
		 dos métodos, no qual getTitular mostra a referência ao o 
		 objeto tipo cliente, fazendo o setProfissao disponibilizar seu 
		 parâmetro para modificar a profissão.*/
		
		conta.getTitular().setProfissao("Programadora");
		
	}
}
