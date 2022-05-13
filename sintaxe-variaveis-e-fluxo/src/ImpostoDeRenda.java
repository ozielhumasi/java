
public class ImpostoDeRenda {
	public static void main(String[] args) {
		double salario = 3751.01;
		String textoDeducao1 = " Você pode deduzir R$ ";
		String textoDeducao2 = "  na sua declaração";
		
		if (salario >= 3751.01) {
			System.out.println("O imposto de renda é de 22.5%." + textoDeducao1 + 636.0 + textoDeducao2 );			
		} else if (salario >= 2800.01) {
			System.out.println("O imposto de renda é de 15%." + textoDeducao1 + 350.0+ textoDeducao2 );
		} else {
			System.out.println("O imposto de renda é de 7.5%." + textoDeducao1 + 142.0 + textoDeducao2 );
		}
	}
	
	


}
