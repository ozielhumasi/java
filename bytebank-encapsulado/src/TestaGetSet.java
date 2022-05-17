
public class TestaGetSet {
	public static void main(String[] args) {
		
		Conta contaOziel = new Conta(45871, 111);
		contaOziel.deposita(1500);
		System.out.println(contaOziel.getSaldo());
		System.out.println(contaOziel.getNumero());
		System.out.println(contaOziel.getAgencia());
		
		Cliente oziel = new Cliente();
		
		//contaOziel.titular = oziel;
		contaOziel.setTitular(oziel);
		oziel.setNome("Oziel Humasi");
		System.out.println(contaOziel.getTitular().getNome());
		
		contaOziel.getTitular().setProfissao("Developer");
		System.out.println(oziel.getProfissao());
		
	}

}
