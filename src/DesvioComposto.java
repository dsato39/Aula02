import java.util.Scanner;

public class DesvioComposto {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		double doacao, investimento, usoImediato;
		System.out.println("Por favor, digite o valor da doa��o recebida!");
		doacao = leitor.nextDouble();
		
		if (doacao > 1000) {
			investimento = doacao * 0.15;
		}
		else {
			investimento = doacao * 0.05;
		}
		usoImediato = doacao - investimento;
		
		System.out.println("A doa��o de R$" + doacao + " implica em um investimento de R$" + investimento + ", restando R$" + usoImediato + " para uso imediato");
		leitor.close();

	}

}
