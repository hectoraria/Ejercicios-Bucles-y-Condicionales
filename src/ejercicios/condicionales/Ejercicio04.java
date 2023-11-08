package ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Atributo de para recoger un numero
		int num;
		// Atributo para revoger el digito1 y 2
		int dig1,dig2;
		// Atributo de string para poder recgoer los datos
		String res;
		//Inicio escaner
		Scanner sc = new Scanner(System.in);
				
		//Le pido al usuario que introuzca la comida que ha comprado
		System.out.println("Introduce el numero : ");
		num = sc.nextInt();
		
		if(num>0 && num<=99) {
			dig2=num/10;
			dig1=num%10;
			
			 res=switch (dig1){
		
			case 1->"uno";
			case 2->"dos";
			case 3->"tres";
			case 4->"cuatro";
			case 5->"cinco";
			case 6->"seis";
			case 7->"siete";
			case 8->"ocho";
			case 9->"nueve";
			default ->"";
			};
			
			
			System.out.println("El numero es: "+ res);
		}
		
	}

}
