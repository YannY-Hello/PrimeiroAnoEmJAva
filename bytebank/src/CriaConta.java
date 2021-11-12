public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		
	
		
		primeiraConta.saldo = 200;

		primeiraConta.saldo += 100;
		
		System.out.println("Primeira conta tem = R$ " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		
		System.out.println(primeiraConta.titular);

		
		segundaConta.saldo = 560;
		System.out.println("Segunda conta tem = R$ " + segundaConta.saldo);

		
	}

}
 