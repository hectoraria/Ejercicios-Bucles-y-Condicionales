package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {

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

	}

}
