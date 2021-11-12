public class TestaMetodo {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.saldo = 100;

		conta.deposita(1200);
		System.out.println(conta.saldo);

		boolean ConseguiuRetirar = conta.saca(200);
		System.out.println(conta.saldo);
		System.out.println(ConseguiuRetirar);

		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(233);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(500);

		boolean sucessoTrasderencia = contaDaMarcela.transfere(300, contaDoPaulo);
		
		if (sucessoTrasderencia) {

			System.out.println("Transferido com sucesso.");

		} else {

			System.out.println("Faltou dinheiro.");
		}

		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);

	}

}
