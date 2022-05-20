// uma interface é um contrato;
//todo aquele que assinar esse contrato (implements)
// deverá implementa os métodos:
	// setKey();
	// certify();
public abstract interface Certifiable {
	
	public void setKey(int key);

	public boolean certify(int key);
}
