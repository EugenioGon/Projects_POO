package Bank;

import java.util.Date;

public class Usuario {
    
  //Atributos da classe
    private String nome;
    private String sobrenome;
    private String telefone;
    private Date dataRegistro = new Date();
    
    
    //Metodo construtor
      public Usuario() {
	
    }      
      
    public Usuario(String nome, String sobrenome, String telefone) {
	
	this.nome = nome;
	this.sobrenome = sobrenome;
	this.telefone = telefone;		
    }
    
    //Metodos Getters e Setters
    
    public String getNome() {
	return this.nome;
    }
    
    public String getSobrenome() {
	return this.sobrenome;
    }
    
    public String getTelefone() {
	return this.telefone;
    }
    
    public Date getDateRegistro() {
	return this.dataRegistro;
    }
    
    void setNome(String nome) {
	this.nome = nome;
    }
    
    void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
    }
    
    void setTelefone(String telefone) {
	this.telefone = telefone;
    }
    
    void setDataRegistro(Date dataRegistro) {
	this.dataRegistro = new Date();
    }
    
    
    
    //Metodos da classe 
    
    String imprimirInfo(){
	
	return String.format("Nome: %s \n Sobrenome: %s \n Telefone: %s \n Data: %s", 
		this.nome,this.sobrenome, this.telefone, this.dataRegistro);
	
    }
    
  
    

}
