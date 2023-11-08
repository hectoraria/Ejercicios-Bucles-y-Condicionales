package ejercicios.condicionales;

import java.util.Scanner;  
import java.util.Random;   

public class Ejercicio08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // Crear un objeto Scanner para obtener la entrada del usuario

        Random random = new Random();  // Crear un objeto Random para generar números aleatorios

        int numero1 = random.nextInt(99) + 1;  // Generar un número aleatorio entre 1 y 99
        int numero2 = random.nextInt(99) + 1;  // Generar otro número aleatorio entre 1 y 99

        System.out.println("Bienvenido al juego de la suma");  // Mostrar un mensaje de bienvenida al juego
        System.out.println("Por favor, sume los siguientes números: ");
        System.out.println(numero1 + " + " + numero2);  // Mostrar los números que el usuario debe sumar

        int respuestaUsuario = scanner.nextInt();  // Obtener la respuesta del usuario

        int sumaCorrecta = numero1 + numero2;  // Calcular la suma correcta de los números generados

	// Esta condicional comprueba si la suma es correcta o incorrecta
        if (respuestaUsuario == sumaCorrecta) {
            System.out.println("¡Correcto! La suma es " + sumaCorrecta);  // Mostrar un mensaje si la respuesta es correcta
        } else {
            System.out.println("¡Incorrecto! La suma es " + sumaCorrecta);  // Mostrar un mensaje si la respuesta es incorrecta
        }

        scanner.close();  // Cerrar el objeto Scanner para liberar recursos
    }
}