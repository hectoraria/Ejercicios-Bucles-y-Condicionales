package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio06 {
	/* Introduzco: 3 | Resultado:1
	 *							 22
	 *							 333
	 * Introduzco: -1 | Espero:Introduzca el numero: | Resultado:Introduzca el numero:
	 * Introduzco: fest | Espero:El dato introducido no es del tipo correcto | Resultado:El dato introducido no es del tipo correcto
	 */
	public static void main(String[] args) {
		// Creo variable para recoger el número
		int num=0;
		
		// Creo un string de linea 
		String linea="";
		// Crear un objeto Scanner para obtener la entrada del usuario
        Scanner sc = new Scanner(System.in);  
        
        do {
        	try {
        		System.out.println("Introduzca el numero: ");
        		num = sc.nextInt();
        	}catch(InputMismatchException e) {
        		System.out.println("El dato introducido no es del tipo correcto");
        		sc.nextLine();
        	}
        }while(num<=0);
        
        //Muestro la pirámide de números
      		for(int i=1; i<=num; i++) {
      			for(int j=1; j<=i; j++) {
      				linea+=i;
      			}
      			System.out.println(linea);
      			linea="";
      		}
      	// Cerrar el Scanner
      	sc.close();
	}

}
