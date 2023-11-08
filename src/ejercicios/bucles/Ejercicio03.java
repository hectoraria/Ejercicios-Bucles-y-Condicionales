package ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Declaro las variables del numero para calcular la piramide
		int num;
		
		// Variable para poder hacer el triangulo con asteriscos
		String espacios= "",asteriscos="";
		
		// Crear un objeto Scanner para obtener la entrada del usuario
        Scanner sc = new Scanner(System.in);  
		
        // Obtener el numero para saber de cunato tiene que ser la piramide
        System.out.print("Introduce un número: ");
        num = sc.nextInt(); 
        
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
