
public class TestaContaSemCliente {

	public static void main(String[] args) {
		
		Conta contaDaTassia = new Conta();
		
		System.out.println(contaDaTassia.saldo); 
		
		System.out.println(contaDaTassia.titular); /*Quando um atributo refer�ncia
		n�o est� populado, ele possui um null, "refer�ncia para lugar nemhum".*/
		
		contaDaTassia.titular.nome = "Tassia Almeida Valadares"; /*Com o null, n�o �
		poss�vel encontrar a refer�ncia para o atributo nome do objeto cliente. */
		
		System.out.println(contaDaTassia.titular.nome);/*N�o vai encontrar a 
		refer�ncia, dando se um erro.*/ 
		
	}
}
