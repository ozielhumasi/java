
public class TestaValores {
	
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		
		// Quanto vale o segundo?
		// R: 5. Os tipos primitivos armazenam o valor, não uma referência ao valor.
		
		System.out.println(segundo);
	}

}
