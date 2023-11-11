package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {
	/* Introduzco: 4 | Resultado:      * 
	 *								  * * 
	 *								 * * * 
	 *								* * * *
	 *Introduzco: -1 | Resultado: El dato introducido no es del tipo correcto
	 */
	public static void main(String[] args) {
		// Declaro las variables del numero para calcular la piramide
		int num=0;
		
		// Variable para poder hacer el triangulo con asteriscos
		String espacios= "",asteriscos="";
		
		// Crear un objeto Scanner para obtener la entrada del usuario
        Scanner sc = new Scanner(System.in);  
		
        // Obtener el numero para saber de cunato tiene que ser la piramide y comprobarlo
        do {
        	try {
        		System.out.println("Introduzca el numero: ");
        		num = sc.nextInt();
        	}catch(InputMismatchException e) {
        		System.out.println("El dato introducido no es del tipo correcto");
        		sc.nextLine();
        	}
        }while(num<=0); 
        
        // Bucle para poder calcular el triangulo y que lo muestre en pantalla
        for(int i=1;i<=num;i++) {
        	for(int j=num;j>=i;j--) {
        		espacios=espacios+" ";
        		
        	}
        		        		
        	asteriscos=asteriscos+"* ";
        	System.out.println(espacios+asteriscos);
        	espacios="";
        }
   
        
        
        
        
        sc.close();

	}

}
