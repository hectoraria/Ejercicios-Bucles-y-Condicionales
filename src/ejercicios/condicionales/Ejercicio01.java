package ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio01 {
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
	 */
	public static void main(String[] args) {
		// Variable para el recoger el numero que introduzca el usuario
		int num, num1;
		
		// Varibles para saber sus digitos
		int reves, resto;
		//Inicio escaner
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por el numero y lo recogo en la variable
		System.out.println("Introduce el numero entre 0-9999: ");
		num = sc.nextInt();
		
		//Compruebo si es capicua
		if(num>=0 && num<10000) {
			
			if(num<10) {
				System.out.println("Es capicua");
			}
			if(num>=10 && num<100) {
				reves=num%11;
				if(reves==0) {
					System.out.println("Es capicua");
				}else {
					System.out.println("No es capicua");
				}
			
			}
			if(num>=100 && num<1000) {
				resto=num%10;
				reves=num/100;
				if(reves-resto==0) {
					System.out.println("Es capicua");
				}else {
					System.out.println("No es capicua");
				}
			
			}
			if(num>=1000 && num<10000) {
				resto=num%10;
				reves=num/1000;
				if(reves ==resto) {
					num1=num/100;
					num1=num1/10;
					resto=num/10;
					resto=resto%10;
					System.out.println("Es capicua");
				}else {
					System.out.println("No es capicua");
				}
			
			}
			
		}
		sc.close();
		
		
		
	}

}
