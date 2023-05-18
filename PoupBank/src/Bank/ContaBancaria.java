package Bank;

public class ContaBancaria {
//Atributos da classe
	
	String agencia;
	String conta;
	double saldo;
	Usuario proprietario;
	
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
