
public class TestaCondicional2 {

	public static void main(String[] args) {

		System.out.println("Testando condicionais.");

		int idade = 13;
		int quantidadePessoas = 5;

		if (idade >= 18) {

			System.out.println("Você tem mais de 18 anos.");
			System.out.println("Seja bem vindo.");
		}

		else {
			
			if (quantidadePessoas >= 2) {
				
				System.out.println("Você não tem 18 anos, mas pode entrar, "
						+ "pois está acompanhado.");
			} 
			
			else {
				System.out.println("Infelizemente você não pode entarar");
			}

		}

	}

}