
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaRebeca = new Conta();
		contaRebeca.deposita(1500);
		/* Na linha abaixo, será criado um cliente acessando diretamente
		o atributo "titular" da contaRebeca.*/
		contaRebeca.titular = new Cliente();
		contaRebeca.titular.nome = "Rebeca da Silva";
		contaRebeca.titular.cpf = "777.777.777-77";
		contaRebeca.titular.profissao = "Apresentadora de televisão";
		System.out.println(contaRebeca.titular.nome + "\n" + contaRebeca.titular.cpf);
		
	}
}
