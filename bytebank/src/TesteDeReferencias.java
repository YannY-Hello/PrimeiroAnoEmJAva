
public class TesteDeReferencias {
	
	public static void main(String[] args) {
		
        Conta primeiraConta = new Conta(); 
        primeiraConta.saldo = 300;

        System.out.println("saldo da primeira: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;

        System.out.println("saldo da segunda conta: " + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("saldo da segunda conta " + segundaConta.saldo); 

        System.out.println(primeiraConta.saldo);

        if(primeiraConta == segundaConta) {
        	
            System.out.println("é a mesma conta");  
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);                

        Conta terceiraConta = new Conta();
        terceiraConta.saldo = 570;
        
        System.out.println("A terceira conta possui R$ " + terceiraConta.saldo);
        
        Conta quartaConta = terceiraConta;
        quartaConta.saldo += 456;
        
        if(terceiraConta == quartaConta) {
            System.out.println("é a mesma conta");  
        }
        
        Conta quintaConta = new Conta();
        quintaConta.saldo = 670;
        
        System.out.println("Quinta conta tem: R$ " + quintaConta.saldo);
        
        Conta sextaConta = quintaConta;
        sextaConta.saldo *= 670;
        
        System.out.println("Sexta conta é referenciada em quinta conta: "
        		+ "R$ S" + quintaConta.saldo);
        
        if(quintaConta == sextaConta) {
            System.out.println("é a mesma conta");  
            
        }
    }
}
