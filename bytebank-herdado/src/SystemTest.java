
public class SystemTest {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.setKey(2222);
		
		
		Administrator adm = new Administrator();
		adm.setKey(3333);
		
		Client client = new Client();
		client.setKey(2222);
		
		
		InternalSystem is = new InternalSystem();
		is.certify(m);
		is.certify(adm);
		is.certify(client);
	}
		
}
