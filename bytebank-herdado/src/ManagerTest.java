
public class ManagerTest {
	public static void main(String[] args) {
		Manager m1 = new Manager();
		m1.setName("Roberson Chagas");
		m1.setCpf("555.555.555-78");
		m1.setWage(5000);
		
		m1.setKey(5555);
		boolean certified = m1.certify(5555);
		
		System.out.println(m1.getName());
		System.out.println(m1.getCpf());
		System.out.println(m1.getWage());
		System.out.println(certified);
		
		System.out.println(m1.getBonus());
		
		
	}
}
