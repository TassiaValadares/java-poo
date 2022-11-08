
public class Conta {

	// A classe é uma representação do objeto.

	// Os atributos são caracteríssticas, que deverão estar presentes no objeto.
	private int agencia;
	private int numero;
	private double saldo;
	private Cliente titular; // Atributo referência.
    private static int total; /* A palavra-chave static, permite
   que o atributo, seja da classe, não sendo somente da 
   instanciação. */
    
	public Conta(int agencia, int numero) { /* Rotina de 
	inicialização */
		
		Conta.total++;
		
		this.setAgencia(agencia);
		this.setNumero(numero);
		System.out.println("Estou criando uma conta.");
		
	}
	
	
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
    /* Getters e setters, são métodos feitos com o intuito 
      de visualizar ou modificar um atributo, sendo que o 
      getter é destinado para visualização e o setter está ligado 
      à modificação.*/
    
    public int getAgencia() {
    	
    	return this.agencia;
    }
    
    public void setAgencia(int agencia){
    	
    	if(agencia <= 0) {
    		
    	 System.out.println("Agência, não pode ter valor <= 0.");
    	 
    	 return;
    	}
    
    	this.agencia = agencia;
    }
    
    public int getNumero() {
    	
    	return this.numero;
    }
    public void setNumero(int numero) {
    	
    	if(numero <= 0) {
    		
    		System.out.println("Número, não pode ter valor <= 0.");
    		
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

