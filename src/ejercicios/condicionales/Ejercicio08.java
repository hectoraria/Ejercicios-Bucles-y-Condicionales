package ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio08 {
	/* Introduzco: kilómetros: 265, estancia: 12| Espero: 662.5€| Resultado: 662.5€
	 * Introduzco: kilómetros: 900, estancia: 9| Espero: 1575.0€| Resultado: 1575.0€
	 * Introduzco: kilómetros: 1000, estancia: 3| Espero: 1575.0€| Resultado: 2500.0€
	 */
	public static void main(String[] args) {
		// Variable para el precio por kilómetro en euros
		final double PRECIO_KILOMETRO = 2.5; 
		// Variable para la distancia y la estancia
		int distancia, diasEstancia;


		Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para obtener la entrada del usuario

		System.out.print("Introduce la distancia a recorrer en kilómetros: ");
		distancia = scanner.nextInt(); // Obtener la distancia a recorrer desde el usuario
		// Obtener el número de días de estancia desde el usuario
		System.out.print("Introduce el número de días de estancia: ");
		diasEstancia = scanner.nextInt(); // Obtener el número de días de estancia desde el usuario
		// Variable para calcular el precio del billete sin descuento
		double precioBillete = distancia * PRECIO_KILOMETRO; 


		// Verificar si se aplica el descuento del 30%
		if (diasEstancia > 7 && distancia > 800) {
			// Calcular el descuento del 30%
			double descuento = 0.3 * precioBillete; 
			// Aplicar el descuento al precio del billete
			precioBillete -= descuento; 
		}
		// Mostrar el precio del billete
		System.out.println("El precio del billete de tren es: " + precioBillete + "€"); 
		// Cerrar el objeto Scanner para liberar recursos
		scanner.close(); 

	}
}