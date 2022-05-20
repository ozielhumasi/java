
public class Certifier {
	
	private int key;

	public void setKey(int key) {
		this.key = key;
	}

	public boolean certify(int key)  {
		if (this.key == key) {
			return true;
		} else {
			return false;
		}
	}

}
