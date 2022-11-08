package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta(); /* A variável primeiraConta, se tornou uma 
		referência para um objeto tipo conta.*/
		
		primeiraConta.saldo = 300; /* Este ponto é a navegação entre os atributos
		 da conta, sendo por fim, realizada a atribuição no atributo.*/
		
        // O valor do saldo da primeira conta, será mostrado.
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo); 

		Conta segundaConta = primeiraConta; /*A variável segundaConta, copiou a
		referência da primeiraConta, apontando agora para a mesma conta. */

		/*Será mostrado o mesmo valor de saldo da primeiraConta, 
		 já que estão apontando para a mesma conta. */
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

		segundaConta.saldo += 100; // Somado ao valor atribuido, mais 100 reais.	
		
        /*Será mostrado o mesmo valor de saldo, já que estão apontando 
         para a mesma conta. */
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

		if (primeiraConta == segundaConta){ /*A condição vai avaliar, 
			se as referências são iguais.*/
			System.out.println("Sim, é a mesma conta."); // Se sim.
		} else {
			System.out.println("Não é a mesma conta."); // Se não.
		}
		// As referências serão as mesmas, já que estão apontando para a mesma conta.
		System.out.println("Referência da primeira conta: " + primeiraConta);
		
		System.out.println("Referência da segunda conta: " + segundaConta);
	
		
	}
}
