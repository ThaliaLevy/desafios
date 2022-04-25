package fracoesSimples_osProgramadores;
import java.util.Scanner;

public class fracoesSimples {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numerador, denominador, resto, resultadoDivisao;

		System.out.println("Digite a fração que deseja simplificar (obs.: com a /): ");
		String fracaoRecebida = ler.nextLine();
		String vetor[] = fracaoRecebida.split("/");

		numerador = Integer.parseInt(vetor[0]);
		denominador = Integer.parseInt(vetor[1]);

		if (denominador == 0) {
			System.out.println("ERRO!");
		} else {
			resultadoDivisao = numerador / denominador;

			if (numerador % denominador == 0) {
				System.out.println(resultadoDivisao);
			} else {
				if (Math.abs(numerador) < denominador) {
					System.out.println(fracaoRecebida);
				} else {
					resto = numerador % denominador;
					System.out.print(resultadoDivisao + " " + resto + "/" + denominador);
				}
			}
		}
		ler.close();
	}

}
