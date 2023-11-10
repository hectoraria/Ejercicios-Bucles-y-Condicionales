package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Variable del numero incial es decir el mayor
		int mayor = 0;
		// Variable del numero introducido para comparar con el mayor
		int num = 0;
		// Contadores
		int contadorFallos = 0, contadorIntentos = 0;

		// Creamos escaner para leer el teclado
		Scanner sc = new Scanner(System.in);
		// Pedimos un numero y lo comprobamos
		do {
			try {
				System.out.println("Introduzca el numero inicial:");
				mayor = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}
		} while (mayor <= 0);

		// Un bucle para cumplir el ejercicio
		do {
			// Contador de intentos
			contadorIntentos++;
			// Le pido que introduzca un numero y lo recoje en la variable num
			System.out.println("Introduzca un numero: ");
			num = sc.nextInt();
			// Condicional si introduce 0 se sale del bucle
			if (mayor == 0) {
				break;
			}
			// Condicional para ver si el num es menor y si es menor que de error 
			
			if (num < mayor) {
				System.out.println("Error, es menor");
				// Contador de fallos
				contadorFallos++;
			}

		} while (num != 0);
		// Imprimir los resultados
		System.out.println("Total de numeros introducidos: " + contadorIntentos);
		System.out.println("Total de fallos: " + contadorFallos);
	}

}
