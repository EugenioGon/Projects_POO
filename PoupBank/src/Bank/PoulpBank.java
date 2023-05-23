package Bank;

import java.util.Scanner;

public class PoulpBank {

	public static void main(String[] args) {
		/* Instanciando um objeto do tipo ContaBancaria e referenciando nas variavel conta1 e 
		 * conta2
		 
		
		var conta1 = new ContaBancaria();
		Usuario user1 = new Usuario();
		//var conta2 = new ContaBancaria();
		
		
		 * versoes mais novas podem utilizar var sem precisar colocar o nome da classe
		 * 
		
		conta1.agencia = "0001";
		conta1.conta = "137351";
		conta1.proprietario = "Eugenio";
		conta1.saldo = 1337.00;
		
		//Exibir valores atribuidos
		 
		System.out.println(conta1.agencia+"\n" + conta1.conta + "\n"+conta1.proprietario+"\n"+conta1.saldo);
		
		
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("BEM VINDO AO POUP BANK");
		System.out.println("CADASTRO DE CONTA");
		System.out.print("Digite a agencia: ");
		conta1.agencia = scn.nextLine();
		System.out.print("Digite sua conta: ");
		conta1.conta = scn.nextLine();
		//Contrucao e insercao dos dados do usuario
		System.out.print("Dados do usuario");
		System.out.print("\nDigite o nome do cliente: ");
		user1.setNome(scn.next()) ;
		System.out.print("Digite o sobrenome do cliente: ");
		user1.setSobrenome(scn.next());
		System.out.print("Digite o telefone do cliente: ");
		user1.setTelefone(scn.next());
		conta1.proprietario = user1;
		
		System.out.print("Digite o valor de deposito: ");
		conta1.depositar(scn.nextDouble());
		
		System.out.println(conta1.agencia+"\n" + conta1.conta + "\n"+conta1.proprietario.imprimirInfo()+"\n"+conta1.consultarSaldo());
		
		System.out.print("\n\n Digite o valor para saque:");
		conta1.sacar(scn.nextDouble());
		
		System.out.print(conta1.consultarSaldo());
		
		scn.close();
		*/
	    
	    Scanner scn = new Scanner(System.in);
	    int opCliente;
	    int opcao = 0, i = 0, menuBank = 0;	    
	    ContaBancaria conta = new ContaBancaria();
	    Usuario user;
	    Usuario[] users = new Usuario[5];
	    
	        while (opcao != 4) {
	            //1º Tela
	            System.out.println("\n*** POUP BANK ***");
	            System.out.println("1 - Cadastro de Conta");
	            System.out.println("2 - Cadastro de Cliente");
	            System.out.println("3 - Area do cliente");
	            System.out.println("4 - Sair");
	            System.out.print("Escolhe uma opcaoo: ");
	            opcao = scn.nextInt();

	            switch (opcao) {
	                case 1:
	                    System.out.println("***Cadastro de Conta***");
	                    System.out.print("Agencia: ");
	                    conta.setAgencia(scn.next());
	                    System.out.print("Conta: ");
	                    conta.setConta(scn.next());
	                    System.out.println("Clientes  Cadastrados");
	                    if (users[0] != null) {
	                        for ( i = 0; i < 5; i++) {
	                            System.out.printf("%d- %s %s\n", i + 1, users[i].getNome(), users[i].getSobrenome());
	                        }
	                        System.out.print("Selecione o cliente: ");
	                        int userOpcao = scn.nextInt();
	                        conta.setProprietario(users[userOpcao - 1]);
	                    }else
	                        System.out.println("Nenhum cliente cadastrado!" + "");
	                    break;
	                    
	                case 2:
	                    for ( i = 0; i < 5; i++) {
	                        user = new Usuario();
	                        System.out.println("***Cadastro de Cliente***");
	                        System.out.print("Nome: ");
	                        user.setNome(scn.next());
	                        System.out.print("Sobrenome: ");
	                        user.setSobrenome(scn.next());
	                        System.out.printf("Telefone: ");
	                        user.setTelefone(scn.next());

	                        users[i] = user;
	                    }
	                    break;
	                    
	                case 4:
	                    System.out.println("***Ate Breve!***");
	                    break;
	                    
	                case 3:
                    
	                    while(menuBank != 2) {
	                    System.out.println("\n*** Opcoes do cliente ***");
	                    System.out.println(" 1 - Sacar\n 2 - Depositar\n 3 - Transferir\n 4 - Consultar Saldo.");
	                    System.out.print("Opcao escolhida: ");
	                    opCliente = scn.nextInt();
	                    switch(opCliente) {
	                    case 1:
	                	System.out.print("Digite o valor para saque:");
	        		conta.sacar(scn.nextDouble());
	                	break;
	                	
	                    case 2:
	                	System.out.print("Digite o valor de deposito: ");
	        		conta.depositar(scn.nextDouble());
	                	break;
	                	
	                    case 3:
	                		                	
	                	break;
	                	
	                    case 4:
	                	System.out.print(conta.consultarSaldo()+"\n");
	                	break;	                    
	                    }
	                    
	                    System.out.print("Deseja continuar? (1 para Sim / 2 para Nao) :");
	                    menuBank = scn.nextInt();
	                    
	                    
	                    }
	                    break;
	                default:
	                    System.out.println("Opcao Invalida!");
	            }
	        }
		
	        scn.close();
	}
      }

