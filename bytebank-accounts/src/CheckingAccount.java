
public class CheckingAccount extends Account {
	
	
	public CheckingAccount(int agency, int number) {
		// O Java chama o construtor padrão
		// da classe MÃE. Este super pode ser ocultado.
		super(agency, number); 
	}
	
	/* ao sacar um valor da ContaCorrente deve
	 * ser cobrada uma taxa de R$ 0,20;
	 */
	
	@Override
	public boolean withdraw(double value) {
		double withdrawValue = value + 0.2;
		return super.withdraw(withdrawValue);
		
	}
	

}
