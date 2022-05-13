
public class TestaPontoFlutuante {

	public static void main(String[] args) {
		
		double salario;
		salario = 1250.70;
		
		System.out.println("Meu salário é: " + salario);
		
		// Como estou dividindo INT com INT, o resultado será um INT;
		int divisao = 5/2; // O resultado foi truncado, ou seja, excluíram-se as casas decimais.
		
		System.out.println(divisao);
		
		// Quando um dos números for double, o resultado será double.
		double divisaoDouble = 5.0/2;
		System.out.println(divisaoDouble);
		
	}
}
