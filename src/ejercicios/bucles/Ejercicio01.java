package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;  

public class Ejercicio01 {
    public static void main(String[] args) {
    	// Creo la variables de tiempo
    	int hora=0, minutos=0,segundos=0,segundosIncremento;
    	
    	
    	// Crear un objeto Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);  
        
        // Obtener las horas y comprobar si el valor introducido es correcto
        do {
        	try {
        		System.out.println("Introduzca las horas:");
        		hora = scanner.nextInt();
        	}catch(InputMismatchException e) {
        		System.out.println("El dato introducido no es del tipo correcto");
        		scanner.nextLine();
        	}
        }while(hora<0 || hora>23);
        
     // Obtener los minutos y comprobar si el valor introducido es correcto
        do {
        	try {
        		System.out.println("Introduzca los minutos:");
        		minutos = scanner.nextInt();
        	}catch(InputMismatchException e) {
        		System.out.println("El dato introducido no es del tipo correcto");
        		scanner.nextLine();
        	}
        }while(minutos<0 || minutos>59);
        
        // Obtener los segundos y comprobar si el valor introducido es correcto
        do {
        	try {
        		System.out.println("Introduzca los segundos:");
        		segundos = scanner.nextInt();
        	}catch(InputMismatchException e) {
        		System.out.println("El dato introducido no es del tipo correcto");
        		scanner.nextLine();
        	}
        }while(segundos<0 || segundos>59); 
        
        // Obtener la cantidad de segundos a incrementar desde el usuario
        System.out.print("Introduce la cantidad de segundos a incrementar: ");
        segundosIncremento = scanner.nextInt(); 

        // Calcular el total de segundos actual
        int totalSegundos = hora * 3600 + minutos * 60 + segundos;

        // Incrementar el total de segundos usando un bucle for
        for (int i = 0; i < segundosIncremento; i++) {
            totalSegundos++;  // Incrementar el total de segundos en cada iteración
        }

        // Calcular la nueva hora, minutos y segundos
        int nuevaHora = totalSegundos / 3600;
        int nuevosMinutos = (totalSegundos % 3600) / 60;
        int nuevosSegundos = totalSegundos % 60;
        
        while(nuevaHora>=24) {
        	nuevaHora-=24;
        }

        // Mostrar la nueva hora
        System.out.println("Nueva hora: " + nuevaHora + ":" + nuevosMinutos + ":" + nuevosSegundos);

        scanner.close();  // Cerrar el objeto Scanner para liberar recursos
    }
}

