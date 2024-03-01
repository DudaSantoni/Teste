package primeiro_projeto;
import java.util.Scanner;
public class Soma {

	
	public static void main(String[] args) {
         // Variáveis
		double a, b, som;
		 //Instaciar classe Scanner
		Scanner ler = new Scanner(System.in);
				
		 //Entrada de dados
				System.out.println("Valor 2 :" );
		a = ler.nextDouble();
		
		System.out.println("Valor 1 :" );
		b = ler.nextDouble();
		
		//Processamento
		som = a + b;
		//Sáida
		System.out.println("O resultado é : " + som);
		ler.close();
		
		}

	}

