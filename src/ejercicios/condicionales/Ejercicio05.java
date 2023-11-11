package ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio05 {
	/* Introduzco: 1| Espero: 1| Resultado: 1
	 * Introduzco: -1| Espero: 1| Resultado: 1
	 */
	public static void main(String[] args) {
		// Variable para el recoger el numero que introduzca el usuario
		int num;

		//Inicio escaner
		Scanner sc = new Scanner(System.in);
				
		//Le pido al usuario que introuzca el numero
		System.out.println("Introduce el numero: ");
		num = sc.nextInt();
		
		// Ternario para calcular el numero absoluto
			num= num<0? num*-1 : num;
			System.out.println(num);
		
		sc.close();
	}

}
