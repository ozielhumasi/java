
public class TestaCadastroVeiculo {
	
	public static void main(String[] args) {
		
		Proprietario oziel = new Proprietario("Oziel Alexandre Pereira Humasi", "777.777.777-89");
		Veiculo carroXande = new Veiculo("Honda", "Civic", 2018, 37.500);
		carroXande.setProprietario(oziel);
//		System.out.println("O carro criado possui as seguintes características:"
//				+ "\nMarca: " + carroXande.getMarca() + "\nModelo: " + carroXande.getModelo()
//				+ "\nAno: " + carroXande.getAno() + "\nPreço: " + carroXande.getPreco());
		
		Proprietario beca = new Proprietario("Eliana Rebeca", "555.555.555-02");
		Veiculo carroBeca = new Veiculo("Toyota", "Corolla", 2022, 90.500);
		carroBeca.setProprietario(beca);
//		System.out.println("O carro criado possui as seguintes características:"
//				+ "\nMarca: " + carroBeca.getMarca() + "\nModelo: " + carroBeca.getModelo()
//				+ "\nAno: " + carroBeca.getAno() + "\nPreço: " + carroBeca.getPreco()); 
		
		System.out.println(Veiculo.getTotalRegistros());
		
		
		
	}

}
