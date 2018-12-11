package fp.daw.examen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

	/* 
	 * 1 punto
	 * 
	 * Define, después de este comentario, un método llamado 'arrayAleatorioOrdenado' que
	 * reciba en un parámetro formal un número entero que determinará la dimensión de un
	 * vector de números enteros que tendrá que crear y rellenar con números aleatorios
	 * comprendidos entre 975 y 13579 y ordenados de menor a mayor a partir de la posición 0.
	 * Finalmente retornará el array.
	 */
	
	public static int [] arrayAleatorioOrdenado(int n) {
		int [] vector = new int[n];
		Random r = new Random();
		for (int i = 0; i < n; i++)
			vector[i] = r.nextInt(13579 - 975 + 1) + 975;
		Arrays.sort(vector);
		return vector;
	}
	/*
	 * 0,25 puntos
	 * 
	 * Escribe en el método main las sentencias necesarias para poner a prueba el método
	 * 'arrayAleatorioOrdenado' mostrando por pantalla el resultado de su ejecución. 
	 */
	
	public static void main(String[] args) {
		Ejercicio3.mostrarVector(arrayAleatorioOrdenado(10));
		
	}

}



