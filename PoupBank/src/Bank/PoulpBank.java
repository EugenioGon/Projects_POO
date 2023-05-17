package Bank;

import java.util.Scanner;

public class PoulpBank {

	public static void main(String[] args) {
		/* Instanciando um objeto do tipo ContaBancaria e referenciando nas variavel conta1 e 
		 * conta2
		 */
		
		var conta1 = new ContaBancaria();
		//var conta2 = new ContaBancaria();
		
		/*
		 * versoes mais novas podem utilizar var sem precisar colocar o nome da classe
		 * 
		
		conta1.agencia = "0001";
		conta1.conta = "137351";
		conta1.proprietario = "Eugenio";
		conta1.saldo = 1337.00;
		
		//Exibir valores atribuidos
		 
		System.out.println(conta1.agencia+"\n" + conta1.conta + "\n"+conta1.proprietario+"\n"+conta1.saldo);
		
		*/
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("BEM VINDO AO POUP BANK");
		System.out.println("CADASTRO DE CONTA");
		System.out.print("Digite a agencia: ");
		conta1.agencia = scn.nextLine();
		System.out.print("Digite sua conta: ");
		conta1.conta = scn.nextLine();
		System.out.print("Digite o nome do proprietario: ");
		conta1.proprietario = scn.nextLine();
		System.out.print("Digite o valor de deposito: ");
		conta1.depositar(scn.nextDouble());
		
		System.out.println(conta1.agencia+"\n" + conta1.conta + "\n"+conta1.proprietario+"\n"+conta1.consultarSaldo());
		
		System.out.print("\n\n Digite o valor para saque:");
		conta1.sacar(scn.nextDouble());
		
		System.out.print(conta1.consultarSaldo());
		
		scn.close();
		
	}

}
