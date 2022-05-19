
public class BonusControl {
	
	private double sum;
	
	public void register (Worker w) {
		/* No caso abaixo, o getBonus() chamará o método específico da 
		 * classe informada como parâmetro. Worker é uma classe genérica
		 * Dentro dela nós temos o MANAGER e o VIDEOEDITOR. 
		 */
		double bon = w.getBonus();
		this.sum = this.sum + bon;
	}
	
//	public void register (Manager m) {
//		// à variável abaixo, somaremos todos os bonus.
//		double bon = m.getBonus();
//		this.sum = this.sum + bon;
//	}
//	
//	
//	public void register (VideoEditor ve) {
//		double bon = ve.getBonus();
//		this.sum = this.sum + bon;
//	}
	
	public double getSum() {
		return this.sum;
	}

}
