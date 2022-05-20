
public class TestWorker {
	public static void main(String[] args) {
		
		Manager oziel = new Manager();
		oziel.setName("Oziel Humasi");
		oziel.setCpf("777.777.777-77");
		oziel.setWage(4500.00);
		
		System.out.println(oziel.getName());
		System.out.println(oziel.getBonus());
		
		// talvez deletarei
		Client client = new Client();
	}

}
