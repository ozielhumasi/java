
public class Conta {
	// Como o atributo abaixo é privado, ele só pode ser LIDO e ALTERADO
	// pela PRÓPRIA CLASSE.
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
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
	
	public double getSaldo() {
		return this.saldo;
	}
}
