package unixTac_osProgramadores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class unixtac {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String caminhoMusica = System.getProperty("user.dir") + "\\src\\unixtac\\caminhoMusica.txt";

		verificarArquivo(caminhoMusica);

		System.out.println(
				"Digite o comando 'cat' para exibição correta do conteúdo do .txt ou 'tac' para exibição invertida. \n");
		String opcao = ler.nextLine();
		switch (opcao) {
		case "cat": {
			imprimirLetra(caminhoMusica, ler);
		}
			break;
		case "tac": {
			imprimirLetraInvertida(caminhoMusica, ler);
		}
			break;
		default:
			System.out.println("Opção inexistente!");
			break;
		}
	}

	public static void verificarArquivo(String caminho) {
		try {
			File f = new File(caminho);
			if (!f.exists()) {
				String auxCaminho = caminho.substring(0, caminho.lastIndexOf("\\"));
				File fDir = new File(auxCaminho);
				fDir.mkdir();
				f.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String[] imprimirLetra(String caminhoMusica, Scanner ler) {
		try {
			BufferedReader ler2 = new BufferedReader(new FileReader(caminhoMusica));
			System.out.println("Letra de cima para baixo: \n");
			while (ler2.ready()) {
				System.out.println(ler2.readLine());
			}
			ler2.close();

			return null;

		} catch (IOException e) {
			System.out.println("Erro no programa.");
		}
		ler.close();
		return null;
	}

	public static String[] imprimirLetraInvertida(String caminhoMusica, Scanner ler) {
		try {
			BufferedReader ler2 = new BufferedReader(new FileReader(caminhoMusica));
			String[] guardarLinhas = new String[6];
			int contador = 0;
			System.out.println("\nLetra de baixo para cima: \n");
			while (ler2.ready()) {
				guardarLinhas[contador] = ler2.readLine();
				contador++;
			}

			for (int i = guardarLinhas.length - 1; i >= 0; i--) {
				System.out.println(guardarLinhas[i]);
			}
			ler2.close();

			return null;

		} catch (IOException e) {
			System.out.println("Erro no programa.");
		}
		ler.close();
		return null;
	}
}
