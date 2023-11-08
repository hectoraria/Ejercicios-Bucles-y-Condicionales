package ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		// Declaro variables segundos, minutos y horas
		int seg,min,horas;
		//Variable para sumar un segundo
		
		
		//Inicio escaner
		Scanner sc = new Scanner(System.in);
		
		//Le pido al usuario que introuzca la comida que ha comprado
		System.out.println("Cantidad de segundos: ");
		seg = sc.nextInt();
		//Le pido al usuario que introuzca la comida que ha comprado
		System.out.println("Cantidad de minutos: ");
		min = sc.nextInt();
		//Le pido al usuario que introuzca la comida que ha comprado
		System.out.println("Cantidad de horas: ");
		horas = sc.nextInt();
		
		//Le sumo un segundo
		seg++;
		if(seg<0 && min<0 && horas<0) {
			System.out.println("No puedes introducir estos valores");
		}else {
			if(seg>=60) {
				min=min+seg/60;
				seg=seg%60;
				
			}if(min>=60) {
				horas=horas+min/60;
				min=min%60;
				
			}if (horas>=24) {
				horas=0;
			}
			
			System.out.println("La hora es: "+horas+":"+min+":"+seg);
		}
		

	}

}
