package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio1 {

	/* 
	 * 1 punto
	 * 
	 * Define, después de este comentario, un método llamado 'contiene' que
	 * reciba dos parámetros: un vector de cadenas de caracteres y una cadena.
	 * El método retornará true si la cadena recibida en el segundo parámetro
	 * se encuentra almacenada en el vector y false en caso contrario.
	 * El método incluirá una única sentencia 'return' y no está permitido el
	 * uso de variables booleanas.
	 */
	
	public static boolean contiene (int cadena) {
			
		Scanner sc= new Scanner (System.in);
						
			char [] vector = {10, 11, 40, 50};
			
			System.out.println("Introduce un numero");
			cadena = sc.nextInt();
			
			for (int i = 0; i >= vector.length; i++) {
				if (cadena == vector[i]) {
					System.out.println("Son iguales");
					return true;
				}else {
					System.out.println("error");
					return false;
				}
			}
			return false;
			
			
			
			
			
				
	}
	
	/*
	 * 0,25 puntos
	 * 
	 * Escribe en el método main las sentencias necesarias para poner a prueba
	 * el método 'contiene' mostrando por pantalla el resultado de su ejecución. 
	 */
	
	public static void main(String[] args) {
		
		contiene(0);

	}

}
