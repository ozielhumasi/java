
public class TestaConversao {
	public static void main(String[] args) {
		float pontoFlutuante = 3.14f; // O Java entende que 3.14 é um double, não um float. Por isso, informamos, colocando o "f" no final, que se trata de um float.
		System.out.println(pontoFlutuante);
		double salario = 1270.50;
		// int valor = salario; assim não compila, pois double não cabe em INT;
		
		// Abaixo realizaremos o "CASTING", isto é, MODELAGEM/CONVERSÃO.
		int valor = (int) salario;
		System.out.println(valor);
		
		double valor1 = 0.1;
		double valor2 = 0.2;
		double total = valor1 + valor2;
		System.out.println(total);
		// O resultado não é o esperado. Double não é o melhor tipo para armazenar salário.
		
		
		// =================== RESUMINDO ===============================
		// short = inteiros de até 16 bits;
		// int = inteiros de até 32 bits;
		// long = inteiros de até 64 bits;
		// float = decimais de até 32 bits;
		// double = decimais de até 64 bits;
	}
}
