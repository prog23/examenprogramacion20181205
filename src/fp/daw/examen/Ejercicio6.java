package fp.daw.examen;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {

	/* 
	 *  2,5 puntos
	 * 
	 * Escribe en el método 'main' un programa que cree un vector de números enteros de un
	 * tamaño aleatorio comprendido entre 100 y 500. Una vez creado lo llenará llenará con
	 * números aleatorios comprendidos entre 0 y 1000000. Después de llenar el vector 
	 * mostrará la mínima diferencia entre dos valores adyacentes. La diferencia entre dos
	 * valores adyacentes se calcula como el valor almacenado en cada posición [i] (excepto
	 * la primera) menos el valor almacenado en la posición [i-1].
	 */
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n;
		
		do {
			System.out.println("Tamaño del vector (entre 100 y 500): ");
			n = sc.nextInt();
			if (n < 100 || n > 500)
				System.out.println("Tamaño incorrecto, tiene que estar comprendido entre 100 y 500");
		}while (n<100 || n>500);
		
		int [] vector = new int[n];
		Random r = new Random();
	for (int i=0; i<n; i++) {
		int valor;		
		do {
		valor = r.nextInt(2000000) - 999999;
		}while (repetido(vector, valor, i - 1));
		vector [i] = valor;
	}	
	for (int i=0; i<n; i++) {		
		System.out.print(vector [i] + "  ");
	}
	System.out.println();
	}
	

	static boolean repetido (int [] vector, int valor, int p) {
		for (int i=0; i<=p; i++) {
			if (vector[i]==valor) {
		return true;
			}
		}
		return false;
		
	}

}

