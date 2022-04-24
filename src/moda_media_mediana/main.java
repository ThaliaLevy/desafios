package moda_media_mediana;

import java.text.DecimalFormat;

public class main {

	public static void main(String[] args) {
		dadosEstatisticos de = new dadosEstatisticos();
		String[] vetorResultado;
		double[] vetorExemploEntrada = { 9, 10, 1, 4, 7, 7, 9, 1, 8 };
		DecimalFormat df = new DecimalFormat("#.#");

		vetorResultado = de.verificarDado(vetorExemploEntrada);

		System.out.println("Média" + "\t" + "Mediana" + "\t" + "Moda");
		for (int i = 0; i < vetorResultado.length; i++) {
			if (i != vetorResultado.length-1) {
				System.out.print(df.format(Double.parseDouble(vetorResultado[i])) + "\t");
			} else {
				System.out.print(vetorResultado[i] + "\t");
			}
		}
	}
}
