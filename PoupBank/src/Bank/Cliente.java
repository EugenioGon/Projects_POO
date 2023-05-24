package Bank;


import java.util.Date;

public class Cliente extends Usuario {
    
    private Date dataRegistro = new Date();
    
    
    Cliente(){}
    
    public Cliente( String nome, String sobrenome, String telefone) {
	super(nome, sobrenome, telefone);		
    }  
    
    public Date getDateRegistro() {
  	return this.dataRegistro;
      }
    
    public void setDataRegistro(Date dataRegistro) {
	this.dataRegistro = new Date();
    }

    @Override
    public String imprimirInfo() {
	
	return String.format("Nome: %s \n Sobrenome: %s \n Telefone: %s \n Data: %s", 
		super.getNome(),super.getSobrenome(),super.getTelefone(),this.getDateRegistro());
	
	
    }
}
