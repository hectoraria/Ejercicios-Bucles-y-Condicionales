package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Declaramos variable del numero
		int num=0;
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
		 
		 // Creamos el for para crear el programa
		 // For para los saltos de linea
		 for(int fila=1;fila<=num;fila++) {
			 
			 for(int columna=1;columna<=fila;columna++) {
				 System.out.print(columna);
			 }// for
			 for( int k=fila-1;k>=1;k--) {
				 System.out.print(k);
			 }// for
			 
			 System.out.println("");
		 }// for
		 
		 
		 sc.close();
	}

}
