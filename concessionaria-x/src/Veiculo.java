
public class Veiculo {
	private String marca;
	private String modelo;
	private int ano;
	private double preco;
	private static int totalDeRegistros;
// RENAULT CLIO 2016, 20.255
	
	public Veiculo (String marca, String modelo, int ano, double preco){
		Veiculo.totalDeRegistros++;
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
		System.out.println("Seu veículo é o " + Veiculo.totalDeRegistros + "º"
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
	
	
	

}
