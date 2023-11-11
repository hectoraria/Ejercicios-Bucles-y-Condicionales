package ejercicios.condicionales;

import java.util.Random;
import java.util.Scanner;
public class Ejercicio06 {
	/* Introduzco: Suma Correcta| Espero: El resultado es correcto| Resultado: El resultado es correcto
	 * Introduzco: Suma Incorrecta| Espero: El resultado es incorrecto| Resultado: El resultado es incorrecto
	 */
	public static void main(String[] args) {
		// Variable de dos numeros generados por la maquina
		int num1,num2;
		// Variable para que recoga la suma del usuario
		int sumaUsuario;
		//Inicio escaner
		Scanner sc = new Scanner(System.in);
		
		// Ininicio un ramdom y le doy un ramdom a los dos numeros
		Random r = new Random();
		// Random n1
		num1 = r.nextInt(1,100);
		// Random n2
		num2 = r.nextInt(1,100);
		
		//Suma de los dos numeros
		System.out.println("Cual es la suma de: "+num1+" + "+ num2 );
		sumaUsuario = sc.nextInt();
		// Condicional para que el programa te compruebe la suma
		if(num1+num2 == sumaUsuario) {
			System.out.println("El resultado es correcto");
		}else {
			System.out.println("El resultado es incorrecto");
		}
		

	}

}
