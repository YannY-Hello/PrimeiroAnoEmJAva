public class App {

	public static void main(String[] args){

		Personagem heroi  = new Personagem();
		heroi.nome = "Hercules";
		heroi.level = 2;
		heroi.setForca(56); 
		heroi.vida = 65;
		
		Personagem heroiTwo  = new Personagem();
		heroiTwo.nome = "Mario";
		heroiTwo.level = 5;
		heroiTwo.setForca(56); 
		heroiTwo.vida = 98;
		
		Personagem heroithree  = new Personagem();
		heroithree.nome = "Hera";
		heroithree.level = 56;
		heroithree.setForca(56); 
		heroithree.vida = 67;
		
		heroi.mostrarStatus();
		
		System.out.println(" ");
		
		// para atacar nomeDoPersonagem.atacar("nomeDaCriatura", VidaDaCriatura, forcaDaCriatura, "habilidade");
		
		heroi.atacar("Hydra", 65 , 45, "Haduken"); 
		System.out.println(" \n");

		heroiTwo.atacar("Gonorreia Ambulante", 88 , 54, "Bilada asassina"); 
		System.out.println(" \n");

		heroithree.atacar("Mantis", 45 , 75, "Lendaria sarrada no ar"); 
		
	}			
	
}
