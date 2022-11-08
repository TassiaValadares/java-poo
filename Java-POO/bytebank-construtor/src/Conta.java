
public class Conta {

	// A classe � uma representa��o do objeto.

	// Os atributos s�o caracter�ssticas, que dever�o estar presentes no objeto.
	private int agencia;
	private int numero;
	private double saldo;
	private Cliente titular; // Atributo refer�ncia.
    private static int total; /* A palavra-chave static, permite
   que o atributo, seja da classe, n�o sendo somente da 
   instancia��o. */
    
	public Conta(int agencia, int numero) { /* Rotina de 
	inicializa��o */
		
		Conta.total++;
		
		this.setAgencia(agencia);
		this.setNumero(numero);
		System.out.println("Estou criando uma conta.");
		
	}
	
	
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
    /* Getters e setters, s�o m�todos feitos com o intuito 
      de visualizar ou modificar um atributo, sendo que o 
      getter � destinado para visualiza��o e o setter est� ligado 
      � modifica��o.*/
    
    public int getAgencia() {
    	
    	return this.agencia;
    }
    
    public void setAgencia(int agencia){
    	
    	if(agencia <= 0) {
    		
    	 System.out.println("Ag�ncia, n�o pode ter valor <= 0.");
    	 
    	 return;
    	}
    
    	this.agencia = agencia;
    }
    
    public int getNumero() {
    	
    	return this.numero;
    }
    public void setNumero(int numero) {
    	
    	if(numero <= 0) {
    		
    		System.out.println("N�mero, n�o pode ter valor <= 0.");
    		
    		return;
    	}
    	
        	this.numero = numero;
    }
    
    public double getSaldo() {
    	
    	return this.saldo;
    }
    
  public void setTitular(Cliente titular) {
	
	  this.titular = titular;

    }
    public Cliente getTitular() {
    	
    	return this.titular;
    }
    
    public  static int getTotal() {
    	
    	return Conta.total;
    }
}

