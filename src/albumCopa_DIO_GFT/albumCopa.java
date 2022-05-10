package albumCopa_DIO_GFT;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class albumCopa {

	// TODO: Complete os espaços em branco com uma solução possível para o problema
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1º valor: inserir total de figurinhas para o album 
		int numTotal = scan.nextInt();
		//2° valor: inserir quantidade de figurinhas que foram compradas
		int numFigCompradas = scan.nextInt();
		Set<Integer> setFig = new HashSet<>();

		//Recebendo a numeração das figurinhas compradas
		for (int i = 0; i < numFigCompradas; i++) {
			//Obs.: "Set" não guarda valores repetidos
			setFig.add(scan.nextInt());
			// System.out.println(setFig);
		}

		System.out.println(numTotal - setFig.size());
		scan.close();
	}
}
