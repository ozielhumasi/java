
public class Client implements Certifiable {
	
	private Certifier certificador;
	
	public Client() {
		this.certificador = new Certifier();
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
