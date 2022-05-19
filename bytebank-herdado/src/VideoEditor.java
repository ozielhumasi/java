
public class VideoEditor extends Worker {
	public double getBonus() {
		System.out.println("Chamando o método de bonificação "
				+ "da classe VIDEOEDITOR");
		return super.getBonus() + 100;
	}
}
