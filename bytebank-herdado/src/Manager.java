// Abaixo está escrito: Gerente é um Funcionário.
// Gerente HERDA de funcionário;	
public class Manager extends Worker{
	
	private int key;
	
	public void setKey(int key) {
		this.key = key;
	}
	
	public boolean certify(int key) {
		if(this.key == key) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public double getBonus() {
		// A referência "super" evidencia que estamos indicando um
		// atributo da classe MÃE.
		System.out.println("Chamado o método de bonificação "
				+ "do MANAGER!");
		return super.getBonus() + super.getWage();
		}

}
