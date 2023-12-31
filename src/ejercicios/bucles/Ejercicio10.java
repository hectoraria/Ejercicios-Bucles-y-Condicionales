package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {
	/* Introduzco: 1| Espero: Es capicua| Resultado: Es capicua
	 * Introduzco: 33| Espero: Es capicua | Resultado: Es capicua
	 * Introduzco: 56| Espero: No es capicua | Resultado: No es capicua
	 * Introduzco: 212| Espero: Es capicua | Resultado: Es capicua
	 * Introduzco: 777| Espero: Es capicua | Resultado: Es capicua
	 * Introduzco: 732| Espero: No es capicua | Resultado: No es capicua
	 * Introduzco: 1111| Espero: Es capicua | Resultado: Es capicua
	 * Introduzco: 2442| Espero: Es capicua | Resultado: Es capicua
	 * Introduzco: 1231| Espero: Es capicua | Resultado: Es capicua
	 * Introduzco: 1223| Espero: Es capicua | Resultado: Es capicua
	 * Introduzco: 1234| Espero: No es capicua | Resultado: No es capicua
	 * Introduzco: -4| Espero: Introduzca el numero:| Resultado: Introduzca el numero:
	 * Introduzco: fest | Espero:El dato introducido no es del tipo correcto | Resultado:El dato introducido no es del tipo correcto
	 */
	public static void main(String[] args) {
		// Declaro una variable para el numero que voy a introducir un auxiliar, la ultima cifra y el numero de reves.
		int num=0, auxiliar, numReves=0, ultimaCifra;
		// Creamos escaner para leer el teclado
		Scanner sc = new Scanner (System.in);
		
		//Pedimos un numero y lo comprobamos que sea mayor que 0
		 do {
	        	try {
	        		System.out.println("Introduzca el numero:");
	        		num = sc.nextInt();
	        	}catch(InputMismatchException e) {
	        		System.out.println("El dato introducido no es del tipo correcto");
	        		sc.nextLine();
	        	}
	        }while(num<=0); 
		// Auxiliar igual que el numero.
		auxiliar =num;
		
		// Resuelvo el numero para ver si es capicua
		while(auxiliar>0) {
			ultimaCifra = auxiliar%10;
			numReves= numReves *10 + ultimaCifra;
			auxiliar /= 10;
			
		}
		// Compruebo si es capicua
		if(numReves == num) {
			System.out.println("Es capicua");
		}else {
			System.out.println("No es capicua");
		}
		// Cerrar escaner
		sc.close();
	}

}
