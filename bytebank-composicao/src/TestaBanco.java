
public class TestaBanco {
	public static void main(String[] args) {
		
		Cliente oziel = new Cliente();
		oziel.nome = "Oziel Alexandre Pereira Humasi";
		oziel.cpf = "777.841.999-25";
		oziel.profissao = "Software Developer";
		
		Conta contaOziel = new Conta();
		contaOziel.deposita(100);
		contaOziel.titular = oziel;
		
		System.out.println(oziel);
		System.out.println(contaOziel.titular);
		
		System.out.println(contaOziel.titular.cpf);
	}

}
