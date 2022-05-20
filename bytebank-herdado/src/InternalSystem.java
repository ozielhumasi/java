
public class InternalSystem {
	
	private int key = 2222;
	
	public void certify(Certifiable m) {
		boolean certified = m.certify(this.key);
		if(certified) {
			System.out.println("You can log into the system!");
		} else {
			System.out.println("You can't log into the system!");
		}
	}

}
