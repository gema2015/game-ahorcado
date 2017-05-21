package ahorcado;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class  Palabra  {
	
	private String palabra;
	private int digitosPS;
	private int digitosCorrectosPS;
	Palabra palabraSecreta;
	private char [] letras;
	private char [] letrasCorrectas;
	private char letra;

	
	Scanner sc = new Scanner (System.in);
	Random ran = new Random ();
	
	public Palabra (){}
	public Palabra (String palabra){
		this.palabra=palabra;
	}
	
	List <Palabra> palabras = new ArrayList <Palabra>();

	
	public void generarPalabras (){
		palabras.add (new Palabra("canguro"));
		palabras.add (new Palabra("computadora"));
		palabras.add (new Palabra("macri"));
		palabras.add (new Palabra("leyenda"));
		palabras.add (new Palabra("mochila"));
		palabras.add (new Palabra("pastel"));
		palabras.add (new Palabra("pelota"));
		palabras.add (new Palabra("cristal"));
	}

	
	public Palabra elegirPalabraSecretaAleatoriamente (){
		palabraSecreta = palabras.get(ran.nextInt(7));
		return palabraSecreta;
	}
	
	public void castearPalabraSecreta (){
		digitosPS = palabraSecreta.toString().length();
		letras = palabraSecreta.toString().toCharArray();
		letrasCorrectas = new char [digitosPS];
		
		for (int i=0;i<letras.length;i++){
			System.out.print(letras[i]+" ");}
	}

	
	public void mostrarTablero (){
		System.out.println();
		
		for (int j=0;j<digitosPS;j++){
			letrasCorrectas[j]='_';
			
		}
		
	}
	
	public void ingresarLetras (){
	
		
		while (digitosCorrectosPS!=digitosPS){
			System.out.println("\n-----------------------------------\nIngrese letra: ");
			letra = sc.next().charAt(0);
			System.out.println("\nPalabra: ");
			boolean digitoIncorrectoPS=true;

			for (int i=0;i<digitosPS;i++){
				if (letra==letras[i]){
					digitosCorrectosPS++;	
					letrasCorrectas[i]=letras[i];
					letras[i]='•';
					digitoIncorrectoPS=false;
					
					
				}
				
			}
			
			for (int j=0;j<digitosPS;j++){
				System.out.print(letrasCorrectas[j]+" ");
			}
			
			if (digitoIncorrectoPS==true){
				System.out.println("\n\nIncorrecto");
			}else{
				System.out.println("\n");
			}
			
		}
		
	}
	
	
	public String toString (){
		return palabra;
	}
	
	

}
