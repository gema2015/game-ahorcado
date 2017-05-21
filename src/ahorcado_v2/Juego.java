package ahorcado_v2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Juego {
	
	Palabra palabraSecreta;
	Jugador jugador;
	
	private int digitosPS;
	private int digitosCorrectosPS;
	private char [] letras;
	private char [] letrasCorrectas;
	
	Random ran = new Random ();
	Scanner sc = new Scanner (System.in);
	
	List <Palabra> palabras = new ArrayList <Palabra>();

	public void generarPalabras (){// Creo una lista con las palabras que pueden haber en el juego
		palabras.add (new Palabra("canguro"));
		palabras.add (new Palabra("computadora"));
		palabras.add (new Palabra("macri"));
		palabras.add (new Palabra("leyenda"));
		palabras.add (new Palabra("mochila"));
		palabras.add (new Palabra("pastel"));
		palabras.add (new Palabra("pelota"));
		palabras.add (new Palabra("cristal"));
	}

	
	public Palabra elegirPalabraSecretaAleatoriamente (){// Eligo una palabra aelatoria
		palabraSecreta = palabras.get(ran.nextInt(8));
		return palabraSecreta;
	}
	
	public void cargarDatos (){
		digitosPS = palabraSecreta.toString().length();// Cuenta los digitos de la palabra que hay que adivinar
		letras = palabraSecreta.toString().toCharArray();// Transforma la palabra que hay que adivinar a String y luego los guarda en un Array
		letrasCorrectas = new char [digitosPS];// Defino el tamaño del Array que coincida con los digitos de la palabra que hay que adivinar
		
		for (int j=0;j<digitosPS;j++){// transformo cada letra a un guion bajo
			letrasCorrectas[j]='_';
		}	
		
		//Te imprime la palabra que hay que adivinar
		//for (int i=0;i<letras.length;i++){
			//System.out.print(letras[i]+" ");}
	}
	
	
	public void jugar (Jugador jugador){
		
		boolean acierto=false;
		boolean victoria = false;
		char letra;
		int tam=0;
		char intentos []= new char[25];
		
		while (victoria==false){
			
			System.out.print("\n-----------------------------------");
			System.out.println("\nPalabra: ");
			
			for (int j=0;j<digitosPS;j++){// Muestra la palabra que hay que adivinar
				System.out.print(letrasCorrectas[j]+" ");
				
			}
			
			System.out.print("\n\nIngrese Letra: ");
			letra = sc.next().charAt(0);//Toma la primera letra que escribimos
			intentos[tam]=letra;
			tam++;
			
			System.out.println("Intentos: ");
			for (int k=0;k<tam;k++){//Te muestra las letras que vas diciendo
				System.out.print(intentos[k]+"-");
			}

			for (int i=0;i<digitosPS;i++){
				if (letra==letras[i]){// Si la letra coincide
					digitosCorrectosPS++;
					letrasCorrectas[i]=letras[i];
					intentos[tam]=letras[i];
					
					if (letras[0]==letrasCorrectas[0]){// Transforma la inicial a mayuscula
						letrasCorrectas[0] = (char)(letrasCorrectas[0]-32); // Le resto 32 al codigo ASCII
					}
					
					letras[i]='•';
					acierto=true;
				}
			}
			
		
			
			if (acierto==false){ // Si la letra no coincide el jugador pierde una vida
				jugador.pierdeVida();
				System.out.println("\n\nHas fallado (Vidas: "+jugador.getVidas()+")");
				acierto=false;
			}
			
			if (acierto==true){ // Si la letra coincide el jugador no pierde ninguna vida
				System.out.println("\n\nHas acertado(Vidas: "+jugador.getVidas()+")");
				acierto=false;
			}
			
			if (jugador.getVidas()==5){
				Mensaje mensaje = new Mensaje();;
				mensaje.mensaje5Vidas();
			}
			
			if (jugador.getVidas()==3){
				Mensaje mensaje = new Mensaje();;
				mensaje.mensaje3Vidas();
			}
			
			if (jugador.getVidas()==1){
				Mensaje mensaje = new Mensaje();;
				mensaje.mensaje1Vida();
			}
			
			if (jugador.getVidas()==0){
				Mensaje mensaje = new Mensaje();
				mensaje.mensajePerdistes();
				System.out.print(jugador.getUsuario());
				victoria=true;
			}
			
			
			if (digitosCorrectosPS==digitosPS){ // Si el jugador adivina la palabra se termina el juego
				System.out.println("\n\n\n\n\n\n\nFelicidades, has ganado "+jugador.getUsuario());
				victoria=true;
			}
			
			
			
			
		}
		
	}

}
