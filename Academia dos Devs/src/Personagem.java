import java.util.Random;
public class Personagem {
	
	String nome;
	int level;
	private	int forca;
	int vida;
	
	void setForca(int forca) {
		
		this.forca = forca;
	} 
	 
	// void -> significa que não está retornando
	
	public void mostrarStatus() {
		
		System.out.format("Personagem: %s (lvl %d) com %d de força.\n",
				nome, level, forca);
		
	}
	
	public int calcularDano() {
		
		Random gerador = new Random();
		int dado20Faces = 1 + gerador.nextInt(19);
		int dano = forca + dado20Faces;
		return dano;
	}
	
	// Método que não retorna nada e recebe um parametro alvo que é do tipo String
	
	public void atacar(String alvo, int vidaDaCriatura, int forcaDaCriatura, String habilidade) {
		int danoCausado = calcularDano();
		int vidaRestanteDoAlvo = vidaDaCriatura - danoCausado;
		int vidaRestanteDoPersonagem = vida - forcaDaCriatura;
		
		if(vidaRestanteDoPersonagem >= 1) {
			 
			if(vidaRestanteDoAlvo >= 1){
				
		System.out.printf("%s atacou a criatura %s, usando a habilidade %s e deu %d de dano."
				+ " \nA vida restante da criatura é: %d. "
				+ "\nDevido a força da criatura ser %d o %s perdeu vida, assim sobrando %d de vida."
				, nome, alvo, habilidade, this.calcularDano(), vidaRestanteDoAlvo, forcaDaCriatura, nome ,vidaRestanteDoPersonagem);
		
			}else {
				
				System.out.printf("%s atacou a criatura %s, usando a habilidade %s e deu %d de dano."
						+ " \n%s morreu."
						+ "\nDevido a força da criatura ser %d o %s perdeu vida, assim sobrando %d de vida."
						, nome, alvo, habilidade, this.calcularDano(), alvo, forcaDaCriatura, nome ,vidaRestanteDoPersonagem);
				
			}
		} else {
			
			if(vidaRestanteDoAlvo >= 1){
				
				System.out.printf("%s atacou a criatura %s, usando a habilidade %s e deu %d de dano."
						+ " \nA vida restante da criatura é: %d. "
						+ "\nDevido a força da criatura ser %d o %s perdeu vida, assim sobrando %d de vida."
						, nome, alvo, habilidade, this.calcularDano(), vidaRestanteDoAlvo, forcaDaCriatura, nome ,vidaRestanteDoPersonagem);
				
					}else {
						
						System.out.printf("%s atacou a criatura %s, usando a habilidade %s e deu %d de dano."
								+ " \n%s morreu."
								+ "\nDevido a força da criatura ser %d o %s perdeu vida, assim sobrando %d de vida."
								, nome, alvo, habilidade, this.calcularDano(), alvo, forcaDaCriatura, nome ,vidaRestanteDoPersonagem);
						
					}
		}
			
		} 
	}
	

