package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio04 {
	/* Introduzco: num1=10 num2=5 | Espero:El minimo comun múltiplo es: 10 | Resultado:El minimo comun múltiplo es: 10 
	 * Introduzco: num1=5 num2=10 | Espero:El minimo comun múltiplo es: 10 | Resultado:El minimo comun múltiplo es: 10
	 * Introduzco: num1=-1 num2=10 | Espero:Introduzca el numero 1: | Resultado:Introduzca el numero 1: 
	 * Introduzco: num1=10 num2=-1 | Espero:Introduzca el numero 2: | Resultado:Introduzca el numero 2: 
	 */
	public static void main(String[] args) {
		// Variable de los numeros
		int num1=0, num2=0, MCDiv = 0 ;
		
		// Crear un objeto Scanner para obtener la entrada del usuario
        Scanner sc = new Scanner(System.in);  
		
        // Obtener el numero 2 y comprobarlo
        do {
        	try {
        		System.out.println("Introduzca el numero 1: ");
        		num1 = sc.nextInt();
        	}catch(InputMismatchException e) {
        		System.out.println("El dato introducido no es del tipo correcto");
        		sc.nextLine();
        	}
        }while(num1<=0); 

        // Obtener el numero 2 y comprobarlo
        do {
        	try {
        		System.out.println("Introduzca el numero 2: ");
        		num2 = sc.nextInt();
        	}catch(InputMismatchException e) {
        		System.out.println("El dato introducido no es del tipo correcto");
        		sc.nextLine();
        	}
        }while(num2<=0); 
        
        // For para poder calcular el mcd de los números
        for(int i=2;i<=num1;i++) {
        	if(num1%i==0) {
        		if(num2%i==0) {
        			MCDiv=i;
        		}
        	}
        	
        }
        if(MCDiv==0) {
        	System.out.println("No hay maximo comun divisor");
        }else {
        	System.out.println("El maximo comun divisor es: "+MCDiv);
        }
     // Cerrar el Scanner
        sc.close();
	}

}
