public class TestaGetESet {

	public static void main(String[] args) { 
		
        Conta conta = new Conta();

        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        cliente paulo = new cliente();
        paulo.setNome("paulo silveira");

        conta.setTitular(paulo);
        System.out.println(conta.getTitular().getNome());
        conta.getTitular().setProfissao("programador"); 
        

        System.out.println(paulo);
        System.out.println(conta.getTitular());
        
    }
	
} 