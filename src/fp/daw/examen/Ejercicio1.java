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
	
	public static boolean contiene (String [] vector, String cadena) {		
			
	int i = 0;
	while (i < vector.length && !cadena.equals(vector[i])) 
		
		i++;
	return i < vector.length;
				
	}
	
	/*
	 * 0,25 puntos
	 * 
	 * Escribe en el método main las sentencias necesarias para poner a prueba
	 * el método 'contiene' mostrando por pantalla el resultado de su ejecución. 
	 */
	
	public static void main(String[] args) {
		
		String [] vector = {"C1", "C2", "C3", "C4", "C5"};
		System.out.println(contiene(vector, "hola"));
		System.out.println(contiene(vector, "C1"));
		System.out.println(contiene(vector, "C2"));
		System.out.println(contiene(vector, "C3"));
		System.out.println(contiene(vector, "C4"));
		System.out.println(contiene(vector, "C5"));

	}

}
