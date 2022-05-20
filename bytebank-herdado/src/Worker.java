// Uma classe abstrata não pode ser instanciada.
public abstract class Worker {

	private String name;
	private String cpf;
	private double wage;

// A partir de agora, os funcionário não têm mais uma 
// bonificação padrão. Cada um recebe uma específica.
// Um MÉTODO ABSTRATO é aquele sem corpo, sem implementação
// Ele DEVE implementado nos MÉTODOS FILHOS.
	
	
	public abstract double getBonus();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	

}
