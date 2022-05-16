
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaXande = new Conta();
		contaXande.saldo = 100;
		contaXande.deposita(50);
		System.out.println(contaXande.saldo);
		
		boolean sacou = contaXande.saca(20);
		System.out.println(contaXande.saldo);
		System.out.println(sacou);
		
		Conta contaRebeca = new Conta();
		contaRebeca.deposita(1000);
		boolean sucessoTransferencia = contaRebeca.transfere(300, contaXande);
		if(sucessoTransferencia) {
			System.out.println("Transferência realizada com sucesso!");
		} else {
			System.out.println("Saldo insuficiente.");
		}
		System.out.println(contaRebeca.saldo);
		System.out.println(contaXande.saldo);
		
		contaXande.titular = "Oziel Alexandre Pereira Humasi";
		System.out.println(contaXande.titular);
		

	
		
	}

}
