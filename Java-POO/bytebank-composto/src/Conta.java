
public class Conta {

	// A classe é uma representação do objeto.

	// Os atributos são caracteríssticas, que deverão estar presentes no objeto.
	int agencia;
	int numero;
	double saldo;
	Cliente titular; // Atributo referência.

	public void deposita(double valor) { //Método void, não devolve nada.

		this.saldo += valor; 
	}

	public boolean saca(double valor) { // Método boolean, devolve true ou false.
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} 
		return false;
	}
    public boolean transfere(double valor, Conta destino) { /*Método boolean, 
    devolve true ou false.// Método boolean, devolve true ou false. */
    	if(this.saldo >= valor) {
    		this.saldo -= valor;
    		destino.saldo += valor;
    		return true;
    	} 
    	return false;
    }
}
