package ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Variable de los numeros
		int num1, num2, MCMult = 0 ;
		
		// Crear un objeto Scanner para obtener la entrada del usuario
        Scanner sc = new Scanner(System.in);  
		
        // Obtener el numero para ver cunatos primos tiene
        System.out.print("Introduce un número 1: ");
        num1 = sc.nextInt(); 

        // Obtener el numero para ver cunatos primos tiene
        System.out.print("Introduce un número 2: ");
        num2 = sc.nextInt();
        
        for(int i=1;i<=num1*num2;i++) {
        	if(num1%i==0) {
        		if(num2%i==0) {
        			MCMult=i;
        		}
        	}
        	
        }
        if(MCMult==0) {
        	System.out.println("No hay minimo comun multiplo");
        }else {
        	System.out.println("El minimo comun múltiplo es: "+MCMult);
        }
        
	}

}
