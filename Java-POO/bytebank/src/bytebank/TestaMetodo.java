package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaDaTassia = new Conta();  /* A variável contaDaTassia, se tornou uma 
		referência para um objeto tipo conta.*/
		
		contaDaTassia.saldo = 100; // Atribuido no atributo saldo, 100 reais.
		
		contaDaTassia.deposita(50); /*Método deposita é para atribuir um valor
		double, no atributo saldo.*/
		
		//O valor atribuido no atributo saldo, será mostrado.
		System.out.println("Saldo conta Tassia: " + contaDaTassia.saldo); 
		
		boolean conseguiuRetirar = contaDaTassia.saca(20); /*A variável 
		conseguiuRetirar, foi criada para conseguir retornar o valor
		booleano, trazido pelo if no método saca.*/
		
		 // O valor atribuido no atributo saldo, será mostrado.
		System.out.println("Saldo conta Tassia: " + contaDaTassia.saldo);
		
		//Será mostrado o valor retornado pelo if do método saca.
		System.out.println("Retorno do if: " + conseguiuRetirar); 
		
		Conta contaDaGiselia = new Conta(); /* A variável contaDaGiselia, 
		se tornou uma referência para um objeto tipo conta.*/
		
		contaDaGiselia.deposita(1000); // O valor será atribuido no atributo saldo.
		
		/* A variável booleana sucessoTransferencia, guarda o 
		   parâmetro do método transfere.*/
		boolean sucessoTransferencia = contaDaGiselia.transfere(300, contaDaTassia);
		
		if(sucessoTransferencia) { /* Se o parâmetro estiver dentro das "condições"
		encontradas no atributo saldo, será realiza a seguinte ação: */
			
			System.out.println("Transferência realizada com sucesso.");
		} else { // Caso o contrário, acontecerá a seguinte ação: 
			System.out.println("Não foi possível realizar sua transferência, "
					+ "por falta de saldo.");
		}
		
		//O valor de cada atributo saldo das instanciações, será mostrado.
		
		System.out.println("Saldo conta Giselia: " + contaDaGiselia.saldo);
		
		System.out.println("Saldo conta Tassia: " + contaDaTassia.saldo);
	}
}
