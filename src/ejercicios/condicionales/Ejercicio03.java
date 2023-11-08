package ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Varible para recoger la comida, animales y la consumicion de estos
		int comida, animales, consumicion ;
		
		float racion;
		//Inicio escaner
		Scanner sc = new Scanner(System.in);
		
		//Le pido al usuario que introuzca la comida que ha comprado
		System.out.println("Introduce la cantidad de comida que se ha comprado: ");
		comida = sc.nextInt();
		//Le pido al usuario los animales que tiene
		System.out.println("Introduce los animales que tienes en la granja: ");
		animales = sc.nextInt();
		//Le pido al usuario la consumicion de todos los animales
		System.out.println("Introduce la consumicion de todos los animales en total: ");
		consumicion = sc.nextInt();
		
		if(animales<=0) {
			System.out.println("Introduce un numero de animales validos : ");
			animales = sc.nextInt();
		}
		
		if(comida<=consumicion) {
			racion= (float) comida / animales;
			System.out.println("Como no tienes comida suficiente a cada animal le pertenece "+ racion);
		}else {
			System.out.println("Tiene comida suficiente");
		}
		
		
		
		//Cierro escaner
		sc.close();

	}

}
