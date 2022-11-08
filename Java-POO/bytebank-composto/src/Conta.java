
public class Conta {

	// A classe � uma representa��o do objeto.

	// Os atributos s�o caracter�ssticas, que dever�o estar presentes no objeto.
	int agencia;
	int numero;
	double saldo;
	Cliente titular; // Atributo refer�ncia.

	public void deposita(double valor) { //M�todo void, n�o devolve nada.

		this.saldo += valor; 
	}

	public boolean saca(double valor) { // M�todo boolean, devolve true ou false.
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} 
		return false;
	}
    public boolean transfere(double valor, Conta destino) { /*M�todo boolean, 
    devolve true ou false.// M�todo boolean, devolve true ou false. */
    	if(this.saldo >= valor) {
    		this.saldo -= valor;
    		destino.saldo += valor;
    		return true;
    	} 
    	return false;
    }
}
