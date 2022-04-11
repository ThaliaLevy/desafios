package outros;

public class main {

	public static void main(String[] args) {
		dadosEstatisticos de = new dadosEstatisticos();
		double[] vetorResultado;
		double[] vetorExemploEntrada = {1, 2, 2, 4, 2, 1, 8};
		
		vetorResultado = de.verificarDado(vetorExemploEntrada);
		
		for(int i = 0; i < vetorExemploEntrada.length; i++) {
			//System.out.println(vetorResultado[i]);
		}
	}
}
