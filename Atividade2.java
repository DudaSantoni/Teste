package primeiro_projeto;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		//VARIÁVEIS
		Double horatrab, valorhora, salbruto, salliquido, inss;

		//INSTANCIAR CLASSE SCANNER
		Scanner ler = new Scanner(System.in);

		// ENTRADA DE DADOS
		System.out.println("O valor por hora é: ");
		valorhora = ler.nextDouble();

		System.out.println("Horas trabalhadas: ");
		horatrab = ler.nextDouble();

		//PROCESSAMENTO
		salbruto = horatrab*valorhora;
		inss = salbruto*0.12;
		salliquido = salbruto - inss;


		//SÁIDA
		System.out.println("O valor do salário líquido é : " +salliquido);
		ler.close ();






	}

}
