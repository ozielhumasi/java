// Utilize um laço do tipo for para imprimir todos os múltiplos de 3, entre 1 e 100.
/* 1. Para saber se um número é múltiplo de 3, basta dividi-lo por 3. Se o resto for 0, então é 
 * divisível por 3.
 * 
 * COMO RESOLVER?
 * - Posso somar os números de 3 em três, começando pelo três. 
 * - Enquanto o número for menor que 100, continuar imprimindo o resultado.
 * - 
 * 
 * */
public class ExercicioFor {
	public static void main(String[] args) {
		for (int contador = 3; contador <= 100; contador +=3) {
			System.out.println(contador);
		}
	}

}
