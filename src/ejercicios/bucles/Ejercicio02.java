package ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Variable para guardar el numero y ver cuantos primos 
		int num, primos=0;
		
		// Crear un objeto Scanner para obtener la entrada del usuario
        Scanner sc = new Scanner(System.in);  
		
        // Obtener el numero para ver cunatos primos tiene
        System.out.print("Introduce un número: ");
        num = sc.nextInt(); 
        
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
