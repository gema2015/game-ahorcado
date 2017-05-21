package ar.edu.davinci.ahorcado;

public class Palabra { // Construyo la clase palabra y luego la inicializo en los items del arraylist
	
	private String palabra;
	private int maximoLetras;
	
	public Palabra (String palabra){ //Constructor con parametro string para que al inicializarla en la lista le paso el parametro
		this.palabra=palabra;
		
		maximoLetras = palabra.length();
		
		if (maximoLetras>12){
			System.out.println("No se puede jugar, hay una palabra demasiada larga");
			System.exit(-1);
		}
	}
	
	public String toString (){
		return palabra;
	}
	
	

}