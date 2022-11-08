
public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(); /*A vari�vel conta, se tornou 
		uma refer�ncia para um objeto tipo conta, inst�nciado.
		*/
		
		conta.setNumero(1337); /* Atr�ves do m�todo setNumero, foi 
		alterado o valor do atributo.*/
		
		/*Ser� mostrado o valor populado ao atributo numero, com 
		 a visualiza��o permitida atr�ves do m�todo getNumero.*/ 
		
		System.out.println("N�mero da conta: " + conta.getNumero());
		
		Cliente tassia = new Cliente(); /*A vari�vel tassia, se 
		tornou uma refer�ncia para um objeto tipo cliente, 
		inst�nciado.*/
		
		
		tassia.setNome("Tassia Almeida Valadares"); /*O "valor" da
		vari�vel nome, foi alterado atrav�s do m�todo setNome.*/
		
		conta.setTitular(tassia); /* O atributo titular, agora 
		guarda a refer�ncia da inst�ncia��o do objeto tipo cliente.*/
		
		/*Ser� mostrado o nome do titular, atrav�s das invoca��es
		 dos m�todos, no qual getTitular mostra a refer�ncia ao o 
		 objeto tipo cliente, fazendo getNome  mostrar seu "valor".*/
		
		System.out.println("Nome do(a) titular: " + conta.getTitular().getNome());
		
		/* Ser� modificado o numero de CPF, atrav�s das invoca��es
		 dos m�todos, no qual getTitular mostra a refer�ncia ao o 
		 objeto tipo cliente, fazendo o setCpf disponibilizar seu 
		 par�metro para modificar o CPF.*/
		
		conta.getTitular().setCpf("000.000.000-00");
		
		/* Ser� modificado a profiss�o, atrav�s das invoca��es
		 dos m�todos, no qual getTitular mostra a refer�ncia ao o 
		 objeto tipo cliente, fazendo o setProfissao disponibilizar seu 
		 par�metro para modificar a profiss�o.*/
		
		conta.getTitular().setProfissao("Programadora");
		
	}
}
