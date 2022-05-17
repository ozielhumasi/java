
public class TestaValores {
	public static void main(String[] args) {
		
		Conta conta = new Conta(3456, 0001);
		
		Conta conta2 = new Conta(3456, 0002);
		
		Conta conta3 = new Conta(3456, 0003);
		
		System.out.println(Conta.getTotal());
		
	}

}
