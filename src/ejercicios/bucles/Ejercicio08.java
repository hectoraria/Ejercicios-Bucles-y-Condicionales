package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio08 {
	/* Introduzco: 1, 0| Espero: Total de numeros introducidos: 1, Total de fallos: 0| Resultado:Total de numeros introducidos: 1, Total de fallos: 0
	 * Introduzco: 1, 2, 0| Espero: Total de números introducidos: 2 Números fallados: 0| Resultado: Total de números introducidos: 2 Números fallados: 0
	 * Introduzco: 1, 2, 1, 0| Espero: Total de números introducidos: 3 Números fallados: 1| Resultado: Total de números introducidos: 3 Números fallados: 1
	 * Introduzco: 0| Espero: Introduzca el numero inicial:| Resultado: Introduzca el numero inicial:
	 * Introduzco: a| Espero: El dato introducido no es del tipo correcto| Resultado: El dato introducido no es del tipo correcto
	 */
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
			
			if (num < mayor && num!=0) {
				System.out.println("Error, es menor");
				// Contador de fallos
				contadorFallos++;
			}

		} while (num != 0);
		// Imprimir los resultados
		System.out.println("Total de numeros introducidos: " + contadorIntentos);
		System.out.println("Total de fallos: " + contadorFallos);
		sc.close();
	}

}
