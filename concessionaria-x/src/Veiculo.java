
public class Veiculo {
	private Proprietario proprietario;
	private String marca;
	private String modelo;
	private int ano;
	private double preco;
	private static int totalRegistros;
// Ex de veículo: RENAULT CLIO 2016, 20.255
//	Vincular um veículo a um proprietário; CERTO;
//  Criar um método para retornar quantos veículos cadastrados eu tenho;
	
	public Veiculo (String marca, String modelo, int ano, double preco){
		Veiculo.totalRegistros++;
		this.marca = marca;
		this.modelo = modelo;
		
		if(ano <= 2017) {
			System.out.println("Nossa concessionária aceita apenas veículos fabricados"
					+ " após o ano de 2017. Registro cancelado.");
			throw new IllegalArgumentException("Argumento inválido!");
		} else {
			this.ano = ano;			
		}
		this.preco = preco;
		System.out.println("Seu veículo é o " + Veiculo.totalRegistros + "º"
				+ " a ser cadastrado.");
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public static int getTotalRegistros() {
		return totalRegistros;
	}
	
	public Proprietario getProprietario() {
		return proprietario;
	}
	
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
		
	}
	
	
	

}
