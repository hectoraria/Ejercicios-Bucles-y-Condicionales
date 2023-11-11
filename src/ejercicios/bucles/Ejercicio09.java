package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio09 {
	/* Introduzco: 1| Espero: El número 1 tiene 1 digito| Resultado: El número 1 tiene 1 digito
	 * Introduzco: 10| Espero: El número 10 tiene 2 digitos| Resultado: El número 10 tiene 2 digitos
	 * Introduzco: 55| Espero: El número 55 tiene 2 digitos| Resultado: El número 55 tiene 2 digitos
	 * Introduzco: 100| Espero: El número 100 tiene 3 digitos| Resultado: El número 100 tiene 3 digitos
	 * Introduzco: 1234567| Espero: El número 1234567 tiene 7 digitos| Resultado: El número 1234567 tiene 7 digitos
	 * Introduzco: -4| Espero: Introduzca el numero:| Resultado: Introduzca el numero:
	 * Introduzco: fest | Espero:El dato introducido no es del tipo correcto | Resultado:El dato introducido no es del tipo correcto
	 */
	public static void main(String[] args) {
		// Variable para guardar un número
		int num=0, dig=0;
		
		// Creamos escaner para leer el teclado
		Scanner sc = new Scanner (System.in);
		
		//Pedimos un numero y lo comprobamos
		 do {
	        	try {
	        		System.out.println("Introduzca el numero:");
	        		num = sc.nextInt();
	        	}catch(InputMismatchException e) {
	        		System.out.println("El dato introducido no es del tipo correcto");
	        		sc.nextLine();
	        	}
	        }while(num<=0); 
		 
		 
		 
		 // Compruebo la cantidad de dígitos del número
		 
		 
		 for(int i=1;i<=num;i*=10) {
			 dig++;
		 }
		 
		 // Compruebo el resultado
		 System.out.println("El número "+ num+" tiene "+dig+" digitos.");
		 // Cerrar el Scanner
		 sc.close();
	}

}
