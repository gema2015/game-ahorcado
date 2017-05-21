package ahorcado_v2;

import java.util.Scanner;

public class Menu {
	
	Scanner sc = new Scanner (System.in);
	
	public Menu (){
		
		int opcion;
		boolean fin=false;
		
		
		while (fin==false){
		
		System.out.println("---------------------------------");
		System.out.println("Ahorcado: \n\n");
		System.out.println("1- Jugar");
		System.out.println("2- Creditos");
		System.out.println("3- Cambiar dificultad");
		System.out.println("4- Cambiar usuario");
		System.out.println("5- Salir");
		System.out.print("\nIngrese opcion: ");
		
		opcion = sc.nextInt();
		
		switch (opcion){
		
		case 1: 
			
			Jugador player1 = new Jugador ("Alex94","Normal");
			Juego ahorcado = new Juego();
			
			ahorcado.generarPalabras();
			ahorcado.elegirPalabraSecretaAleatoriamente();
			ahorcado.cargarDatos();
			ahorcado.jugar(player1);
			fin=true;
			break;
		
		case 2:
			System.out.println("\n\nJuego creado por: \n\n\n\n");
			System.out.println("Tomas Medero\nPablo Fernandez\nMartin Bobbio\n");
			break;
			
		case 3:
			System.out.println("\n\nProximamente..\n\n\n\n");
			break;
			
		case 4:
			System.out.println("\n\nProximamente..\n\n\n\n");
			break;
			
		case 5:
			
			System.out.println("\n\n\n\n\nHas salido del juego ");
			fin=true;
			break;
			
		default:
			System.out.println("\n\nOpcion invalida \n\n\n\n");

		}
		}
		
		}
		
	}


