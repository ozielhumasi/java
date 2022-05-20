
public class ReferenceTests {
	public static void main(String[] args) {
		
//		Manager g1 = new Manager();
/*Como Manager é um tipo de Worker, eu posso declarar o tipo
da variável como Worker. Todavia, nem todo Worker é Manager, Logo,
o inverso não é verdadeiro. */
		Manager g1 = new Manager();
		g1.setName("Eliana");
		g1.setWage(5000.0);
		
		/* Como WORKER, agora, é uma classe abstrata,
		 * não é possível criar um WORKER que não pertença
		 * a alguma classe filha.
			Worker w1 = new Worker();
			w1.setWage(2000.0);
		 */
		
		VideoEditor v1 = new VideoEditor();
		v1.setWage(2500.0);
		
		Designer d1 = new Designer();
		d1.setWage(200);
				
		BonusControl control = new BonusControl();
		control.register(g1);
		control.register(v1);
		control.register(d1);
		
		System.out.println(control.getSum());

		
	}

}
