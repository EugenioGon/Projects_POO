package Bank;

public class ContaBancaria {
    	//Atributos da classe
	
	private String agencia;
	private String conta;
	private double saldo;
	private Usuario proprietario;
    
	//Metodo construtor
	
	public ContaBancaria() {}

	public ContaBancaria (String agencia, String conta, double saldo, Usuario proprietario) {
	    
	    this.agencia = agencia;
	    this.conta = conta;
	    this.saldo = saldo;
	    this.proprietario = proprietario;
	    	    
	}
	
	//Metodos Getters e Setters
	
 	public String getAgencia() {
 	    return this.agencia;
 	}
 	
 	public String getConta() {
 	    return this.conta;
 	}
 	
 	public double getSaldo() {
 	    return this.saldo;
 	}
 	
 	public Usuario getProprietario() {
 	    return this.proprietario;
 	}
 	
 	public  void setAgencia(String agencia) {
 	     this.agencia = agencia;	    
 	}
 	
 	public void setConta(String conta) {
	     this.conta = conta;	    
	}
 	
 	public void setSaldo(double saldo) {
 	    this.saldo = saldo;
 	}
 	
 	public void setProprietario(Usuario proprietario) {
 	    this.proprietario = proprietario;
 	}
 	
	//Metodos da classe 
 	
	void depositar(double valor) { // Metodo com parametro
		
		this.saldo += valor;
		
	}

	void sacar(double valor) {
		
		if(valor > this.saldo) {
			
		    System.out.println("Saldo insuficiente");	
		
		} else {
		    this.saldo -= valor;
			
		}
	}

	void transferir(ContaBancaria contabancaria, double valor) { //Metodo com parametros 
	    
	    if(valor <=  this.saldo ) {
		this.sacar(valor);
	    	contabancaria.saldo += valor;
	    }else {
		
		System.out.println("Saldo insuficiente!!");
	    }
		
	    
	    
	}
	

	String consultarSaldo () { //Meetodo sem parametro
		/*String.format() metodo da classe String para utilizar a formatacao
		com identificadores (%d,  %f, %s).*/
		return String.format("Seu saldo e: R$ %.2f", this.saldo);
	}
	
 
	
	

}
