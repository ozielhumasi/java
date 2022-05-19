public class Tests{
	public static void main(String[] args) {
		CheckingAccount ca = new CheckingAccount(111, 111);
		ca.deposit(100);
		SavingsAccount sa = new SavingsAccount(222, 222);
		sa.deposit(200);
		
		ca.transfer(10, sa);
		
		System.out.println("Saldo da CheckingAccount: "
				+ ca.getBalance());
		System.out.println("Saldo da SavingsAccount: "
				+ sa.getBalance());
		
		
		
	}
}
