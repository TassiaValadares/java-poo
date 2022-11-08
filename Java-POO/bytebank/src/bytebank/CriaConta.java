package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta(); /* A vari�vel primeiraConta, se tornou uma 
		refer�ncia para um objeto tipo conta.*/
		
		primeiraConta.saldo = 200; /* Este ponto � a navega��o entre os atributos
		 da conta, sendo por fim, realizada a atribui��o no atributo.*/
		
		System.out.println(primeiraConta.saldo); /* O valor atribuido na conta, ser�
		acessado.*/
		
		primeiraConta.saldo += 100;  // Somado ao valor atribuido, mais 100 reais.	
		
		Conta segundaConta = new Conta(); /* A palavra-chave new, inst�ncia a 
		 representa��o do objeto, assim o criando.*/
		
		segundaConta.saldo = 50; // Valor atribuido na conta.
		
		// Acessando os saldos das contas, mostrando que s�o contas diferentes.
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo); 
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		// Os atributos possuem um valor default, quando instanciados.
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		if (primeiraConta == segundaConta){ /*A condi��o vai avaliar, 
		se as refer�ncias s�o iguais.*/
			System.out.println("Sim, � a mesma conta."); //Se sim.
		} else {
			System.out.println("N�o � a mesma conta."); //Se n�o.	
		}
		// Ser� mostrada as refer�ncias de cada vari�vel.
		System.out.println("Refer�ncia da primeira conta: " + primeiraConta);
		
		System.out.println("Refer�ncia da segunda conta: " + segundaConta);
	}
}
