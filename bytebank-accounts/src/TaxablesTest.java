
public class TaxablesTest {
	public static void main(String[] args) {
		
		LifeInsurance li1 = new LifeInsurance();
		System.out.println(li1.getTaxValue());
		
		CheckingAccount ca1 = new CheckingAccount(4545, 5264);
		ca1.deposit(100);
		System.out.println(ca1.getTaxValue());
		
		
		TaxCalculator tc = new TaxCalculator();
		tc.register(li1);
		tc.register(ca1);
		System.out.println(tc.getTotalTax());
	}

}
