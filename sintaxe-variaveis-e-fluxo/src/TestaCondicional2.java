
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 20;
		int quantidadePessoas = 1;
		boolean acompanhado = quantidadePessoas >= 3;
		
		System.out.println("Valor de acompanhado é :" + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem-vindo!");
		} else {
			System.out.println("Você não pode entrar.");
		}
	}

}
