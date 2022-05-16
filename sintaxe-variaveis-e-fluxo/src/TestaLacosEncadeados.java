
public class TestaLacosEncadeados {
	
	public static void main(String[] args) {
		
		for (int numero = 1; numero <= 10; numero++) {
			for (int multiplicador = 0; multiplicador <= 10; multiplicador++) {
				System.out.print((numero * multiplicador) + " ");
			}
			System.out.println();
		}
		
		for (int linhas = 0; linhas <= 10; linhas++) {
			for (int colunas = 0; colunas <= linhas; colunas++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
