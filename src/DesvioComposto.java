import java.util.Scanner;

public class DesvioComposto {

	public static void main(String[] args) {
		/*O estatuto de uma ONG determina que todas as doa��es recebidas devem gerar um valor para investimento, para cobrir momentos de necessidade. 
		 * O valor do investimento deve ser de 5% da doa��o. Por�m, em casos em que as doa��es ultrapassem R$1000,00 o investimento deve ser de 15% da doa��o.
		 * Sua miss�o � criar um programa capaz de fazer os c�lculos necess�rios e indicar quanto deve ser investido.*/
		
		Scanner leitor = new Scanner(System.in);
		double doacao, investimento, usoimediato;
		System.out.println("Por favor, digite o valor da doa��o recebida!");
		doacao = leitor.nextDouble();
		if (doacao > 1000) {
			investimento = doacao * 0.15;
		}
		else {
			investimento = doacao * 0.05;
		}
		usoimediato = doacao - investimento;
		
		/*Aqui devemos criar uma solu��o para realizar os c�lculos adequados baseando-nos no valor da doa��o*/
		
		
		System.out.println("A doa��o de R$" + doacao + " implica em um investimento de R$" + investimento + ", restando R$" + usoimediato + " para uso imediato");
		leitor.close();

	}

}
