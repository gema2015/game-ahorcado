package ahorcado;

public class Test {

	public static void main(String[] args) {
		
		Juego ahorcado = new Juego();

		ahorcado.generarPalabras();
		ahorcado.elegirPalabraSecretaAleatoriamente();
		ahorcado.castearPalabraSecreta();
		ahorcado.mostrarTablero();
		ahorcado.ingresarLetras();
		

	}
	
	

}
