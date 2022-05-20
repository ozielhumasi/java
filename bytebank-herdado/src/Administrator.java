
public class Administrator extends Worker implements Certifiable{
	
	private Certifier certificador;
	
	public Administrator() {
		this.certificador = new Certifier();	
	}
	
	@Override
	public double getBonus() {
		// TODO Auto-generated method stub
		return 50;
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
