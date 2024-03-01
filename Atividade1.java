package primeiro_projeto;

import java.util.Scanner;

public class Atividade1 {

	
	public static void main(String[] args) {
        // Variáveis
		String idade,nome,som;
		 //Instaciar classe Scanner
		Scanner ler = new Scanner(System.in);
				
		 // Entrada de dados
				System.out.println("Informe o seu nome: ");
	 	nome = ler.next();
	
		System.out.println("Informe a sua idade: ");
		idade = ler.next();
		
	
		//Sáida
		System.out.println("O resultado é : " + nome+", "+idade+ " anos");
		ler.close();
 }

}