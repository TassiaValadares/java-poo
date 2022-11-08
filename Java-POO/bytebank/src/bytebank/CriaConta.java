package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta(); /* A variável primeiraConta, se tornou uma 
		referência para um objeto tipo conta.*/
		
		primeiraConta.saldo = 200; /* Este ponto é a navegação entre os atributos
		 da conta, sendo por fim, realizada a atribuição no atributo.*/
		
		System.out.println(primeiraConta.saldo); /* O valor atribuido na conta, será
		acessado.*/
		
		primeiraConta.saldo += 100;  // Somado ao valor atribuido, mais 100 reais.	
		
		Conta segundaConta = new Conta(); /* A palavra-chave new, instância a 
		 representação do objeto, assim o criando.*/
		
		segundaConta.saldo = 50; // Valor atribuido na conta.
		
		// Acessando os saldos das contas, mostrando que são contas diferentes.
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo); 
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		// Os atributos possuem um valor default, quando instanciados.
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		if (primeiraConta == segundaConta){ /*A condição vai avaliar, 
		se as referências são iguais.*/
			System.out.println("Sim, é a mesma conta."); //Se sim.
		} else {
			System.out.println("Não é a mesma conta."); //Se não.	
		}
		// Será mostrada as referências de cada variável.
		System.out.println("Referência da primeira conta: " + primeiraConta);
		
		System.out.println("Referência da segunda conta: " + segundaConta);
	}
}
