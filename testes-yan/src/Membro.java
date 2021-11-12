import java.util.Scanner;
public class Membro {

	String nome;
	int idade;
	Familia familia = new Familia();
	
	public void perfil(){
		
		Scanner genero = new Scanner(System.in);

		char sexo;
         
	        System.out.println("Digite seu sexo: ");
	        sexo = genero.next().charAt(0);
	        sexo = Character.toUpperCase(sexo);
	        

	        switch(sexo){
	          case 'F':
	        	  System.out.format("                                          CARTÃO DE SOLDADO          \n"
		  	   			+ "                        \n"
	  	   				+ "                         ALIANÇA: %s.\n"
	  	   				+ "                         CLÃ: %s.\n"
	  	   				+ "                         NOME: %s.\n"
	  	   				+ "                         SEXO: Femenino.\n"
	  	   				+ "                         IDADE: %d.", 
	  	   				this.familia.aliança,
	  	   				this.familia.cla,
	  	   				this.nome,
	  	   				this.idade);;
	           break;
	           
	          case 'M':
	        	  System.out.format("          CARTÃO DE SOLDADO          \n"
	  	   				+ "ALIANÇA: %s.\n"
	  	   				+ "CLÃ: %s.\n"
	  	   				+ "NOME: %s.\n"
	  	   				+ "SEXO: Masculino.\n"
	  	   				+ "IDADE: %d", 
	  	   			this.familia.aliança,
  	   				this.familia.cla,
  	   				this.nome,
  	   				this.idade);;
	           break;
	           
	          default:
	        	  System.out.format("          CARTÃO DE SOLDADO          \n"
		  	   				+ "ALIANÇA: %s.\n"
		  	   				+ "CLÃ: %s.\n"
		  	   				+ "NOME: %s.\n"
		  	   				+ "SEXO: Indefenido.\n"
		  	   				+ "IDADE: %d", 
		  	   			this.familia.aliança,
	  	   				this.familia.cla,
	  	   				this.nome,
	  	   				this.idade);;
	        	  break;
	           
	           
		     }
		
	}

}
