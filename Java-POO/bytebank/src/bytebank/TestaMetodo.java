package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaDaTassia = new Conta();  /* A vari�vel contaDaTassia, se tornou uma 
		refer�ncia para um objeto tipo conta.*/
		
		contaDaTassia.saldo = 100; // Atribuido no atributo saldo, 100 reais.
		
		contaDaTassia.deposita(50); /*M�todo deposita � para atribuir um valor
		double, no atributo saldo.*/
		
		//O valor atribuido no atributo saldo, ser� mostrado.
		System.out.println("Saldo conta Tassia: " + contaDaTassia.saldo); 
		
		boolean conseguiuRetirar = contaDaTassia.saca(20); /*A vari�vel 
		conseguiuRetirar, foi criada para conseguir retornar o valor
		booleano, trazido pelo if no m�todo saca.*/
		
		 // O valor atribuido no atributo saldo, ser� mostrado.
		System.out.println("Saldo conta Tassia: " + contaDaTassia.saldo);
		
		//Ser� mostrado o valor retornado pelo if do m�todo saca.
		System.out.println("Retorno do if: " + conseguiuRetirar); 
		
		Conta contaDaGiselia = new Conta(); /* A vari�vel contaDaGiselia, 
		se tornou uma refer�ncia para um objeto tipo conta.*/
		
		contaDaGiselia.deposita(1000); // O valor ser� atribuido no atributo saldo.
		
		/* A vari�vel booleana sucessoTransferencia, guarda o 
		   par�metro do m�todo transfere.*/
		boolean sucessoTransferencia = contaDaGiselia.transfere(300, contaDaTassia);
		
		if(sucessoTransferencia) { /* Se o par�metro estiver dentro das "condi��es"
		encontradas no atributo saldo, ser� realiza a seguinte a��o: */
			
			System.out.println("Transfer�ncia realizada com sucesso.");
		} else { // Caso o contr�rio, acontecer� a seguinte a��o: 
			System.out.println("N�o foi poss�vel realizar sua transfer�ncia, "
					+ "por falta de saldo.");
		}
		
		//O valor de cada atributo saldo das instancia��es, ser� mostrado.
		
		System.out.println("Saldo conta Giselia: " + contaDaGiselia.saldo);
		
		System.out.println("Saldo conta Tassia: " + contaDaTassia.saldo);
	}
}
