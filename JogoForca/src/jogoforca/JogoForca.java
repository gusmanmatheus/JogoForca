/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoforca;
import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class JogoForca {

	public static void main(String[] args) {
		String novaPalavra;
		String palavra = "";
		Scanner scan = new Scanner(System.in);

		String add[] = new String[21];
		add[0] = "casaco";
		add[1] = "janela";
		add[2] = "porta";
		add[3] = "forca";
		add[4] = "logica";
		add[5] = "lupa";
		add[6] = "telefone";
		add[7] = "perna";
		add[8] = "carambola";
		add[9] = "faesa";
		add[10] = "pizza";
		add[11] = "palmito";
		add[12] = "chinelo";
		add[13] = "vetor";
		add[14] = "palavras";
		add[15] = "girafas";
		add[16] = "padaria";
		add[17] = "garfo";
		add[18] = "colher";
		add[19] = "lampada";
		add[20] = "ADD UM NOVO PULL PRA RECOMITAR";
		
		boolean upa=true;		 
		while(upa==true){
			System.out.println("nome de usuario");
			String C =scan.next(); 

		boolean condição = true;

		while (condição == true) {
			System.out.println("O que deseja fazer "+ C +"?" 
					+ "\n 1 acrescentar nova palavra " + "\n 2 Jogar"
					+ "\n 3 encerrar o jogo");
			int opção = scan.nextInt();


			switch (opção) {

			// primeira casa
			case 1:
				System.out.println(" Você desejou acrescentar nova palavra\n"
						+ "digite ela:");
				novaPalavra = scan.next();
				add = AumentaVetor(add, add.length + 1,novaPalavra);

				// condição = false;
				break;
			// fim

			// segunda casa
			case 2:
				System.out.println("Você desejou jogar");
				condição = false;

				break;
			// fim

			// terceira casa
			case 3:
				System.out.println(" Você desejou encerrar o jogo");
				System.exit(0);
				condição = false;

				break;
			// fim

			// default
			default: {
				System.out.println("digitou numero errado ");
			}
			}

		}
		int errou =0;
		int conti = 0;
		// INICIO DO JOGO DA FORCA
		
		int aleatorio = (int) (Math.random() * add.length);
		int k =0;
		// variaveis e pá
		palavra = add[aleatorio];
		// System.out.println(palavra);
		int c = palavra.length();

		char vetorletras[] = new char[c];
		char traço[] = new char[c];
        char erros[]=new char[vetorletras.length+10];
		// vetor letras e traços recebem os valores aki
		for (int i = 0; i < traço.length; i++) {
			traço[i] = '_';
			vetorletras[i] = add[aleatorio].charAt(i);
		}
		int erro = 0;
		condição = true;
		while (condição == true) {
			erro=0;

				System.out.println("digite a letra");
				for (int j = 0; j < traço.length; j++) {
					System.out.print(traço[j] + " ");
				}
				System.out.println("");
				char tentativa = scan.next().charAt(0);
for (int i = 0; i < erros.length; i++) {

	if(erros[i]==tentativa){
		erro--;
	}	

}
				
					for (int i = 0; i < traço.length; i++) {
						
					if (tentativa == vetorletras[i]) {
						traço[i] = vetorletras[i];
						}    
				else { erro++;  }}
					
					if(erro>=vetorletras.length){
						k++;
					erros[k-1]=tentativa;
					
					}
				
						
			
					
					
					if(erro>=vetorletras.length){
errou++;
				
					}

			switch (errou) {//switch case com erros , cada numero um membro adicional 

			case 1:
				System.out.println(" ***** ");
				System.out.println(" *   * ");
				System.out.println(" ***** ");
				break;
			case 2:
				System.out.println(" ***** ");
				System.out.println(" *   * ");
				System.out.println(" ***** ");
				System.out.println("  **   ");
				System.out.println("  **   ");
				System.out.println("  **   ");
				System.out.println("  **   ");
				System.out.println("  **   ");
				break;
			case 3:
				System.out.println("  ***** ");
				System.out.println("  *   * ");
				System.out.println("  ***** ");
				System.out.println("  ****   ");
				System.out.println(" * **    ");
				System.out.println("*  **    ");
				System.out.println("   **   ");
				System.out.println("       ");
				break;
			case 4:
				System.out.println("  ***** ");
				System.out.println("  *   * ");
				System.out.println("  ***** ");
				System.out.println("  ****   ");
				System.out.println(" * ** *  ");
				System.out.println("*  **  * ");
				System.out.println("   **    ");
				System.out.println("         ");
				break;
			case 5:
				System.out.println("  ***** ");
				System.out.println("  *   * ");
				System.out.println("  ***** ");
				System.out.println("  ****   ");
				System.out.println(" * ** *  ");
				System.out.println("*  **  * ");
				System.out.println("   *     ");
				System.out.println("  *      ");
				break;
			case 6:
				System.out.println("  ***** ");
				System.out.println("  *   * ");
				System.out.println("  ***** ");
				System.out.println("  ****   ");
				System.out.println(" * ** *  ");
				System.out.println("*  **  * ");
				System.out.println("   * *   ");
				System.out.println("  *   *  ");
				System.out.println("Você foi enforcado!. ");
				break;
			}
            
			
			if(errou==6){condição=false;}
			
for (int i = 0; i < traço.length; i++) {
if(traço[i]=='_'){conti++;}
}
		
if(conti==0){
	System.out.println("Parabens você ganhou");
	condição=false;
	}
else{conti=0;}

		
		}
		System.out.println("Sua palavra era: " + palavra);
		System.out.println("deseja jogar novamente digite n para não qual quer tecla"
				+ "para sim");
		char jogarnovamente = scan.next().charAt(0);
		if(jogarnovamente=='n'){
			upa=false;
		}
	}
		
	}
	
	
	
	public static String[] AumentaVetor(String[] _add, int tamanhoNovo, String novaPalavra) {
		int tamanhoAntigo = _add.length;
		String[] vetor2 = new String[tamanhoAntigo];
		
		for (int i = 0; i < _add.length; i++) {
			vetor2[i] = _add[i];
		}
		_add = new String[tamanhoNovo];

		for (int i = 0; i < tamanhoAntigo; i++) {
			_add[i] = vetor2[i];
		}
		
			_add[tamanhoNovo-1] = novaPalavra;
		
		return _add;

	}
}