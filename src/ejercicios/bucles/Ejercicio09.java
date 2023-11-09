package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio09 {

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

	}

}
