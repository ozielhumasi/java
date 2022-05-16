/* Imprimir os fatoriais de 1 a 10!
 * 4! = 4 x 3 x 2 x 1;
 * Imaginemos que queremos descobrir o fatorial do número 8. 
 * Para generalizar, chamaremos 8 de n;
 * n = 8;
 * Enquanto n for maior que zero, então eu multiplico n*n-1;
 */
public class ExercicioFatorial {
	public static void main(String[] args) {
		int numero = 10;
		for(int contador = numero-1; contador > 0; contador--) {
			numero = numero*contador;
		}
		System.out.println(numero);
	}

}
