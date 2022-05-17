
public class TestaCadastroVeiculo {
	public static void main(String[] args) {
		Veiculo carroXande = new Veiculo("Honda", "Civic", 2018, 37.500);
		System.out.println("O carro criado possui as seguintes características:"
				+ "\nMarca: " + carroXande.getMarca() + "\nModelo: " + carroXande.getModelo()
				+ "\nAno: " + carroXande.getAno() + "\nPreço: " + carroXande.getPreco()); 
		
		Veiculo carroBeca = new Veiculo("Toyota", "Corolla", 2022, 90.500);
		System.out.println("O carro criado possui as seguintes características:"
				+ "\nMarca: " + carroBeca.getMarca() + "\nModelo: " + carroBeca.getModelo()
				+ "\nAno: " + carroBeca.getAno() + "\nPreço: " + carroBeca.getPreco()); 
		
		
	}

}
