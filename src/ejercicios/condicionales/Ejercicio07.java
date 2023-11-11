package ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio07 {
	/* Introduzco: 1,1,1| Espero: La hora es: 1:1:2| Resultado: 1:1:2
	 * Introduzco: 59,1,1| Espero: La hora es: 1:2:0| Resultado: 1:2:0
	 * Introduzco: 59, 59, 1| Espero: La hora es: 2:0:0| Resultado: 2:0:0
	 * Introduzco: 59, 59, 23| Espero: La hora es: 0:0:0| Resultado: 0:0:0
	 * Introduzco: 62, 0, 0| Espero:La hora es: 0:1:3 | Resultado: La hora es: 0:1:3
	 * Introduzco: -2, 0, 0| Espero: No puedes introducir estos valores| Resultado: No puedes introducir estos valores
	 */
	public static void main(String[] args) {
		
		// Declaro variables segundos, minutos y horas
		int seg,min,horas;
		
		
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
		if(seg<0 || min<0 || horas<0) {
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
		sc.close();
		

	}

}
