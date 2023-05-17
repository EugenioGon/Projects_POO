package Bank;

import java.util.Date;

public class Usuario {
    
  //Atributos da classe
    String nome;
    String sobrenome;
    String telefone;
    Date dataRegistro = new Date();
    
    
    //Metodos da classe 
    
    String imprimirInfo(){
	
	return String.format("Nome: %s \n Sobrenome: %s \n Telefone: %s \n Data: %s", 
		this.nome,this.sobrenome, this.telefone, this.dataRegistro);
	
    }
    

}
