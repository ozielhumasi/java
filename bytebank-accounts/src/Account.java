
public class Account {
	
	private double balance;
	private int agency;
	private int number;
	private Client owner;
	private static int total = 0;
	
	// Abaixo, seguem os constructors da classe;
//	public Account() {
//		
//	}
	public Account(int agency, int number) {
		Account.total++;
//		System.out.println("O total de contas "
//				+ "existentes é: " + Account.total);
		this.agency = agency;
		this.number = number;
//		this.balance = 100;
//		System.out.println("Estou criando uma"
//				+ "conta cujo número é: " + this.number);			
	}
	
	public void deposit(double value) {
		this.balance = this.balance + value;
	}
	
	public boolean withdraw (double value) {
		if (this.balance >= value) {
			this.balance = this.balance - value;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfer(double value, Account destiny) {
		if(this.withdraw(value)) {
			destiny.deposit(value);
			return true;
		} else {
			System.out.println("Valor indisponível!");
			return false;
		}
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public int getNumer() {
		return this.number;
	}
	
	public void setNumber(int number) {
		if(number <= 0) {
			System.out.println("O número da conta não"
					+ "pode ser maior ou igual a 0!");
		return;
		} else {
			this.number = number;
		}
	}
	
	public int getAgency() {
		return this.agency;
	}
	
	public void setAgency(int agency) {
		if(agency <= 0) {
			System.out.println("O número da agência não pode ser menor ou igual a 0");
			return;
		} else {
			this.agency = agency;
		}
	}

	public Client getOwner() {
		return this.owner;
	}

	public void setOwner(Client owner) {
		this.owner = owner;
	}
	
	public static int getTotal() {
		return Account.total;
	}
	
	
	
	
	

}