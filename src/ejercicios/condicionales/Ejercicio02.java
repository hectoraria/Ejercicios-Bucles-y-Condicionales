package ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio02 {
	/* Introduzco: 11111111| Espero: 11111111H| Resultado: 11111111H 
	 * Introduzco: 11111113| Espero: 11111113C| Resultado: 11111113C
	 * Introduzco: 0| Espero: El valor introducido no es valido| Resultado: El valor introducido no es valido
	 * Introduzco: 123456789| Espero: El valor introducido no es valido| Resultado: El valor introducido no es valido
	 */
	public static void main(String[] args) {
		// Variable para el recoger el numero que introduzca el usuario
		int num;
		// Variable para ver la letra
		char letra = 0;
		//Inicio escaner
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por el numero y lo recogo en la variable
		System.out.println("Introduce tu los numeros del dni (solo 8 digitos) : ");
		num = sc.nextInt();
		// Comprueblo si el numero es valido
		if(num>99999999|| num<=0 ) {
			System.out.println("El valor introducido no es valido");
		}else {
			// Compruebo la letra del dni
			letra = switch (num%23){
			case 0->'T';
			case 1->'R';
			case 2->'W';
			case 3->'A';
			case 4->'G';
			case 5->'M';
			case 6->'Y';
			case 7->'F';
			case 8->'P';
			case 9->'D';
			case 10->'X';
			case 11->'B';
			case 12->'N';
			case 13->'J';
			case 14->'Z';
			case 15->'S';
			case 16->'Q';
			case 17->'V';
			case 18->'H';
			case 19->'L';
			case 20->'C';
			case 21->'K';
			case 22->'E';
			default -> 'Ñ';
				};
				//Imprimo el DNI
				System.out.println("El DNI es: " + num+letra);
			}

		
		
		
		
		sc.close();

	}

}
