// Abaixo está escrito: Gerente é um Funcionário.
// Gerente HERDA de funcionário;	
public class Manager extends Worker implements Certifiable {
	
	private Certifier certificador;
	
	public Manager() {
		this.certificador = new Certifier();	
	}
	
	
	
	public double getBonus() {
		// A referência "super" evidencia que estamos indicando um
		// atributo da classe MÃE.
		System.out.println("Chamado o método de bonificação "
				+ "do MANAGER!");
		return super.getWage();
		}

	@Override
	public void setKey(int key) {
		this.certificador.setKey(key);
		
	}

	@Override
	public boolean certify(int key)  {
		return this.certificador.certify(key);
	}


}
