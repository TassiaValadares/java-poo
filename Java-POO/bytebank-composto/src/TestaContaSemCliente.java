
public class TestaContaSemCliente {

	public static void main(String[] args) {
		
		Conta contaDaTassia = new Conta();
		
		System.out.println(contaDaTassia.saldo); 
		
		System.out.println(contaDaTassia.titular); /*Quando um atributo referência
		não está populado, ele possui um null, "referência para lugar nemhum".*/
		
		contaDaTassia.titular.nome = "Tassia Almeida Valadares"; /*Com o null, não é
		possível encontrar a referência para o atributo nome do objeto cliente. */
		
		System.out.println(contaDaTassia.titular.nome);/*Não vai encontrar a 
		referência, dando se um erro.*/ 
		
	}
}
