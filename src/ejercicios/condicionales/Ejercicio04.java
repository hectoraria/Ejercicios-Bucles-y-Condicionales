package ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio04 {
	/*
	 * Introduzco:1 | Espero:El numero 1 es :Uno  | Resultado: El numero 1 es :Uno
     * Introduzco:10 | Espero:El numero 10 es :Diez  | Resultado: El numero 10 es :Diez
     * Introduzco:11 | Espero:El numero 11 es :Once  | Resultado: El numero 11 es :Once
     * Introduzco:20 | Espero:El numero 20 es :Veinte  | Resultado: El numero 20 es :Veinte
     * Introduzco:26 | Espero:El numero 26 es :Veintiseis  | Resultado: El numero 26 es :Veintiseis
     * Introduzco:30 | Espero:El numero 30 es :Treinta | Resultado: El numero 30 es :Treinta
     * Introduzco:36 | Espero:El numero 36 es :Treinta y seis  | Resultado: El numero 36 es :Treinta y seis
     * Introduzco:0 | Espero:Valor introducido no válido  | Resultado: Valor introducido no válido
     * Introduzco:100 | Espero:Valor introducido no válido  | Resultado: Valor introducido no válido
	 */
	public static void main(String[] args) {
		// Variable para el número
		int num;

		// Variable para el resultado
		String resto;

		// Variables para el primer dígito y para el segundo
		int dig1, dig2;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Pregunto por el número
		System.out.println("Introduzca un número de 0-99");

		// Leo el número del teclado del teclado
		num = sc.nextInt();

		// Compruebo que el número esté dentro del rango
		if (num >= 1 && num <= 99) {
			dig1 = num / 10;
			dig2 = num % 10;
			if (num > 10 && num <= 15) {
				resto = switch (num) {
				case 11 -> "Once";
				case 12 -> "Doce";
				case 13 -> "Trece";
				case 14 -> "Catorce";
				case 15 -> "Quince";
				default -> "";
				};
			} else {
				if (num < 10) {
					resto = switch (num) {
					case 1 -> "Uno";
					case 2 -> "Dos";
					case 3 -> "Tres";
					case 4 -> "Cuatro";
					case 5 -> "Cinco";
					case 6 -> "Seis";
					case 7 -> "Siete";
					case 8 -> "Ocho";
					case 9 -> "Nueve";
					default -> "";
					};
				} else {
					if (num % 10 == 0) {
						resto = switch (dig1) {
						case 1 -> "Diez";
						case 2 -> "Veinte";
						case 3 -> "Treinta";
						case 4 -> "Cuarenta";
						case 5 -> "Cincuenta";
						case 6 -> "Sesenta";
						case 7 -> "Setenta";
						case 8 -> "Ochenta";
						case 9 -> "Noventa";
						default -> "";
						};
					} else {
						resto = switch (dig1) {
						case 1 -> "Dieci";
						case 2 -> "Veinti";
						case 3 -> "Treinta y ";
						case 4 -> "Cuarenta y ";
						case 5 -> "Cincuenta y ";
						case 6 -> "Sesenta y ";
						case 7 -> "Setenta y ";
						case 8 -> "Ochenta y ";
						case 9 -> "Noventa y ";
						default -> "";
						};
						resto = switch (dig2) {
						case 1 -> resto + "uno";
						case 2 -> resto + "dos";
						case 3 -> resto + "tres";
						case 4 -> resto + "cuatro";
						case 5 -> resto + "cinco";
						case 6 -> resto + "seis";
						case 7 -> resto + "siete";
						case 8 -> resto + "ocho";
						case 9 -> resto + "nueve";
						default -> "";
						};
					}
				}
			}
			System.out.println("El numero "+num+" es :" + resto);

		} else {
			System.out.println("Valor introducido no válido");
		}

		// Cierro el Scanner
		sc.close();
	}
}