package outros;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class dadosEstatisticos {
	public String[] verificarDado(double[] vetor) {
		String[] vetorResposta = new String[3];

		// reordenar valores de entrada - crescente
		Arrays.sort(vetor);

		// calcular media
		vetorResposta[0] = calcularMedia(vetor) + "";

		// verificar mediana
		vetorResposta[1] = verificarMediana(vetor) + "";

		// verificar moda
		Integer[] resultadoModa = verificarModa(vetor);
		String moda = "";
		for (int i = 0; i < resultadoModa.length; i++) {
			if (resultadoModa[i] != 0) {
				if(i == resultadoModa.length-1) {
					moda = moda + resultadoModa[i] + " ";
				}else {
					moda = moda + resultadoModa[i] + ", ";
				}
			}
			
		}
		vetorResposta[2] = moda;

		return vetorResposta;
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

	public Integer[] verificarModa(double[] vetor) {
		int contador = 0, maiorOcorrencia = 0;
		String[] ocorrencias = new String[vetor.length];

		// contar quantidade de repetições de cada valor
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[i] == vetor[j]) {
					contador++;
				}
			}
			ocorrencias[i] = contador + "";
			contador = 0;
		}

		// verificar a maior quantidade de repetições
		for (int i = 0; i < ocorrencias.length; i++) {
			if (i + 1 != ocorrencias.length) {
				int valorI = Integer.parseInt(ocorrencias[i]), valorJ = Integer.parseInt(ocorrencias[i + 1]);
				if (valorI > valorJ) {
					maiorOcorrencia = valorI;
				}
			}
		}

		// guardar todos os valores do vetor ordenado que possuem a maior quantidade de
		// repetições
		double[] guardar = new double[ocorrencias.length];
		int indice = 0;
		for (int i = 0; i < vetor.length; i++) {
			int todasOcorrencias = Integer.parseInt(ocorrencias[i]);
			if (maiorOcorrencia == todasOcorrencias) {
				guardar[indice] = (int) vetor[i];
				indice++;
			}
		}

		// limpando "quantidade de repetições" que mostram mais de uma vez
		Set<Integer> set = new HashSet<>();
		for (double a : guardar) {
			set.add((int) a);
		}
		Integer[] jb = set.toArray(new Integer[set.size()]);

		return jb;
	}
}
