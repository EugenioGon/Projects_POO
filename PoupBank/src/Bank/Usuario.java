package Bank;


public class Usuario {
    
  //Atributos da classe
    private String nome;
    private String sobrenome;
    private String telefone;
   
    
    
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
       
    public void setNome(String nome) {
	this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
    }
    
    void setTelefone(String telefone) {
	this.telefone = telefone;
    }
    
       
    //Metodos da classe 
    
    public String imprimirInfo(){
	
	return String.format("Nome: %s \n Sobrenome: %s \n Telefone: %s", 
		this.nome,this.sobrenome, this.telefone);
	
    }
    
  
    

}