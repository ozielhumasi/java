
public class Conta {
	// Como o atributo abaixo é privado, ele só pode ser LIDO e ALTERADO
	// pela PRÓPRIA CLASSE.
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	/* Abaixo, usaremos o CONSTRUTOR no padrão java.
	 * Quando digitamos "new Conta();", o Java faz exatamente
	 * o que está disposto no código abaixo. 
	public Conta() {
		
	} */
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
//		System.out.println("O total de contas é: " + total);
//		System.out.println("A conta criada possui os seguintes "
//				+ "dados: \nNúmmero: " + numero + ";\nAgência: " + agencia + ".");
	}
	
	public void deposita(double valor) {
		// No caso abaixo, o "this" é opcional.
		this.saldo += valor;
		
	}
	
	// "boolean" e "void" são DEFINIÇÕES DE RETORNO.
	// No primeiro caso, o retorno é boolean. No segundo, é VAZIO.
	public boolean saca(double valor) { 
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else { 
            return false;
        }
    }
	
	public boolean transfere (double valor, Conta destino) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
	// ================ GETERS AND SETTERS ==============//
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	// O padrão é que SETTERS não retornem nada.
// ==== OBS.: no momento que eu crio minha conta eu preciso inserir
// como parâmetros a agência e o número da conta. Logo, não preciso
// mais dos métodos setAgencia() e setNumero();
//	public void setNumero(int numero) {
//		if (numero <= 0) {
//			System.out.println("Por favor, insira número > 0");
//		} else {
//		this.numero = numero;
//		}
//	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
//	public void setAgencia(int agencia) {
//		if(agencia <= 0) {
//			System.out.println("Por favor, insira um número > 0");
//		} else {
//		this.agencia = agencia;
//		}
//	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	// Os métodos estáticos acessam apenas atributos estáticos.
	public static int getTotal() {
		return Conta.total;
	}
	
	
}
