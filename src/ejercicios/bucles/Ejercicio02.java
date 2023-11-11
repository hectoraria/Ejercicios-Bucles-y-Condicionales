package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {
	/* Introduzco: 21 | Espero: El numero 21 tiene 8 primos | Resultado: El numero 21 tiene 8 primos 
	 * Introduzco: 1 | Espero: Introduzca el numero: | Resultado: Introduzca el numero:
	 * Introduzco: 3 | Espero: El numero 3 tiene 1 primos | Resultado: El numero 3 tiene 1 primos
	 * Introduzco: -1 | Espero: Introduzca el numero: | Resultado: Introduzca el numero:
	 */
	public static void main(String[] args) {
		// Variable para guardar el numero y ver cuantos primos 
		int num=0, primos=0;
		
		// Crear un objeto Scanner para obtener la entrada del usuario
        Scanner sc = new Scanner(System.in);  
		
        // Obtener el numero para ver cuantos primos hay y comprobarlo
        do {
        	try {
        		System.out.println("Introduzca el numero: ");
        		num = sc.nextInt();
        	}catch(InputMismatchException e) {
        		System.out.println("El dato introducido no es del tipo correcto");
        		sc.nextLine();
        	}
        }while(num<=2); 
        
        // Calculo cuantos primos hay en el número introducido
        for(int i=2;i<num;i++) {
        	
        	primos++;
        	
        	for(int j=2;j<=Math.sqrt(i);j++) {
        		if(i%j==0) {
        		primos--;
        		break;
        		}
        	}
        }
        System.out.println("El numero "+ num+ " tiene "+primos+ " primos");
		
        
        // Cierro escaner
        sc.close();
	}

}
