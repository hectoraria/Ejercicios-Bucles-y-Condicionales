package ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Variable de los numeros
		int num1, num2, MCDiv = 0 ;
		
		// Crear un objeto Scanner para obtener la entrada del usuario
        Scanner sc = new Scanner(System.in);  
		
        // Obtener el numero para ver cunatos primos tiene
        System.out.print("Introduce un número 1: ");
        num1 = sc.nextInt(); 

        // Obtener el numero para ver cunatos primos tiene
        System.out.print("Introduce un número 2: ");
        num2 = sc.nextInt();
        
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
        
	}

}
