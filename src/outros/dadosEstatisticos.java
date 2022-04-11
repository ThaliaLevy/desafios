package outros;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.OptionalDouble;
import java.util.Set;

public class dadosEstatisticos {
	public double[] verificarDado(double[] vetor) {
		double[] vetorResposta = new double[3];

		// reordenar valores - crescente
		Arrays.sort(vetor);

		// calcular media
		vetorResposta[0] = calcularMedia(vetor);

		// verificar mediana
		vetorResposta[1] = verificarMediana(vetor);

		// verificar moda
		int contador = 0;
		double valoresAntigos[] = new double[vetor.length];
		double novosValores[] = new double[vetor.length];

		for (int i = 0; i < vetor.length; i++) {
			contador = 0;
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[i] == vetor[j]) {
					contador++;
				}
			}
			valoresAntigos[i] = contador;
			novosValores[i] = contador;
			System.out.print(" " + contador);
		}

		// colocando vetor em ordem para localizar a maior quantidade de vezes repetidas
		Arrays.sort(novosValores);
		String maiorRepeticao = (int) novosValores[novosValores.length - 1] + "";

		// convertendo em string para conseguir utilizar o indexof e achar o indice
		String valoresAntigosString = valoresAntigos + "";
		int indiceMaiorRepeticao = valoresAntigosString.indexOf(maiorRepeticao);
		System.out.println(indiceMaiorRepeticao);

		// utilizando o index encontrado para achar o indice correspondente no vetor de
		// valores
		String v = vetor + "";

		// System.out.println(vetor[5]);
		
		// restringindo o numero de visualização decimal
		DecimalFormat df = new DecimalFormat(".##");
		return vetorResposta;

		/*
		 * for (int i = 0; i < vetor.length; i++) { // System.out.print(" " + vetor[i]);
		 * }
		 * 
		 * // convertendo double para int int v[] = new int[vetor.length]; for (int i =
		 * 0; i < vetor.length; i++) { v[i] = (int) Math.round(vetor[i]); }
		 * 
		 * int d = 0;
		 * 
		 * // retirando os repetidos Set<Integer> set = new HashSet<>(); for (int a : v)
		 * {
		 * 
		 * set.add(a); v[d] = a;
		 * 
		 * System.out.print(" " + v[d]);d++; }
		 * 
		 * for (int i = 0; i < vetor.length; i++) {
		 * 
		 * }
		 * 
		 * Set<Integer> carlos = set; System.out.println("\n"+ carlos);
		 * 
		 * 
		 * for (int i = 0; i < v.length; i++) { //
		 * System.out.println(valoresAntigos[i]); }
		 * 
		 * for (int i = 0; i < v.length; i++) { for (int j = 0; j < vetor.length; j++) {
		 * if (v[i] == vetor[j]) { contador++; }else { break; } } valoresAntigos[i] =
		 * contador; System.out.println("valoresAntigos[i] " + valoresAntigos[i]);
		 * contador = 0; }
		 * 
		 * double[] valoresAntigos = new double[10]; for (int i = 0; i < vetor.length;
		 * i++) { for (int j = i + 1; j < vetor.length; j++) { if (vetor[i] == vetor[j])
		 * {
		 * 
		 * // System.out.println("contador " + contador); //
		 * System.out.println("valor j " + vetor[j]); contador++;
		 * 
		 * // System.out.println("contador " + contador); } }
		 * 
		 * 
		 * }
		 * 
		 * for(int i = 0; i < valoresAntigos.length; i++) { //
		 * System.out.println(vetor[i]); } //
		 * System.out.println(df.format(vetorResposta[0])); //
		 * System.out.println(df.format(vetorResposta[1])); return vetorResposta;
		 */
	}

	public double calcularMedia(double[] vetor) {
		double resultadoMedia = 0;

		for (int i = 0; i < vetor.length; i++) {
			resultadoMedia = resultadoMedia + vetor[i];
		}

		return resultadoMedia / vetor.length;
	}

	public double verificarMediana(double[] vetor) {
		if (vetor.length % 2 == 0) {
			int meio = vetor.length / 2;
			double valorDireito = vetor[meio];
			double valorEsquerdo = vetor[meio - 1];
			return (valorDireito + valorEsquerdo) / 2;
		} else {
			int meio = vetor.length / 2;
			return vetor[meio];
		}
	}
}
