
public class TaxCalculator {
	
	private int totalTax;
	
	public void register(Taxable taxable) {
		double value = taxable.getTaxValue();
		this.totalTax += value;
	}
	
	public double getTotalTax() {
		return this.totalTax;
	}
	
	

}
