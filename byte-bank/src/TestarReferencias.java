
public class TestarReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		segundaConta.saldo = 500;
		System.out.println("O saldo da primeira e da \"segunda\" \n conta são, respectivamente: ");
		System.out.println(primeiraConta.saldo + " " + segundaConta.saldo);
		// As duas variáveis terão o mesmo valor, haja vista que armazenam uma REFERÊNCIA
		// ao mesmo objeto. 
		if (primeiraConta == segundaConta) {
			System.out.println("As contas são iguais!");
		} else {
			System.out.println("As contas são diferentes!");
		}
		
	}

}



