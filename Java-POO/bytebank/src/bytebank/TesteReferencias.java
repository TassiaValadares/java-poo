package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta(); /* A vari�vel primeiraConta, se tornou uma 
		refer�ncia para um objeto tipo conta.*/
		
		primeiraConta.saldo = 300; /* Este ponto � a navega��o entre os atributos
		 da conta, sendo por fim, realizada a atribui��o no atributo.*/
		
        // O valor do saldo da primeira conta, ser� mostrado.
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo); 

		Conta segundaConta = primeiraConta; /*A vari�vel segundaConta, copiou a
		refer�ncia da primeiraConta, apontando agora para a mesma conta. */

		/*Ser� mostrado o mesmo valor de saldo da primeiraConta, 
		 j� que est�o apontando para a mesma conta. */
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

		segundaConta.saldo += 100; // Somado ao valor atribuido, mais 100 reais.	
		
        /*Ser� mostrado o mesmo valor de saldo, j� que est�o apontando 
         para a mesma conta. */
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

		if (primeiraConta == segundaConta){ /*A condi��o vai avaliar, 
			se as refer�ncias s�o iguais.*/
			System.out.println("Sim, � a mesma conta."); // Se sim.
		} else {
			System.out.println("N�o � a mesma conta."); // Se n�o.
		}
		// As refer�ncias ser�o as mesmas, j� que est�o apontando para a mesma conta.
		System.out.println("Refer�ncia da primeira conta: " + primeiraConta);
		
		System.out.println("Refer�ncia da segunda conta: " + segundaConta);
	
		
	}
}
