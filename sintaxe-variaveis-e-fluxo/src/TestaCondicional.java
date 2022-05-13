
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 15;
		int quantidadePessoas = 2;
		if (idade >= 18) {
			System.out.println("Você é maior de idade");
			System.out.println("Seja bem-vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você pode entrar pq está acompanhado.");
			} else {
				System.out.println("Você não pode entrar.");				
			}
		}
	}

}
