package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05 {
	/* Introduzco: num1=43 num2=222 | Espero:El minimo comun múltiplo es: 9546 | Resultado:El minimo comun múltiplo es: 9546 
	 * Introduzco: num1=60 num2=20 | Espero:El minimo comun múltiplo es: 60 | Resultado:El minimo comun múltiplo es: 60
	 * Introduzco: num1=-1 num2=10 | Espero:Introduzca el numero 1: | Resultado:Introduzca el numero 1: 
	 * Introduzco: num1=10 num2=-1 | Espero:Introduzca el numero 2: | Resultado:Introduzca el numero 2: 
	 */
	public static void main(String[] args) {
		// Variable de los numeros
		int num1=0, num2=0, MCMult = 0 ;
		
		// Crear un objeto Scanner para obtener la entrada del usuario
        Scanner sc = new Scanner(System.in);  
		
        // Obtener el numero 1 y comprobarlo
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
        
        for(int i=num1;i<=num1*num2;i++) {
        	if(i%num1==0) {
        		if(i%num2==0) {
        			MCMult=i;
        			break;
        		}
        	}
        	
        }
        // Compruebo si es minimo comun multiplo
        if(MCMult==0) {
        	System.out.println("No hay minimo comun multiplo");
        }else {
        	System.out.println("El minimo comun múltiplo es: "+MCMult);
        }
        sc.close();
        
	}

}
