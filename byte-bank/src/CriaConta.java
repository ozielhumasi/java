
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println(segundaConta.saldo);
		
		// Os objetos, por padrão, têm seus atributos zerados, a menos que, na definição da classe
		// eu atribua um valor a determinado atributo. Vejamos o primeiro caso:
		System.out.println(segundaConta.agencia);
		
		
	}
	
	}

