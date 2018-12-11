package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio5 {

	/* 
	 * 2,5 puntos
	 * 
	 * Escribe en el método 'main' un programa que obtenga el desglose en billetes
	 * y monedas de una cantidad exacta de euros que el usuario introducirá por teclado.
	 * Hay billetes de 500, 200, 100, 50, 20, 10 y 5 euros y monedas de 1 y 2 euros.
	 * Por ejemplo, si deseamos conocer el desglose de 434 euros, el programa mostrará
	 * por pantalla el siguiente resultado:
	 * 
	 * 		2 billetes de 200 euros.
	 * 		1 billete de 20 euros.
	 * 		1 billete de 10 euros.
	 * 		2 monedas de 2 euros.
	 * 
	 * Una vez ejecutado el programa, el usuario podrá realizar tantos desgloses como
	 * desee hasta que decida finalizar su ejecución. 
	 * El programa comprobará que la cantidad introducida sea una cantidad positiva
	 * mayor que 0. En caso contrario mostrará un mensaje de error y volverá a pedirla.
	 */
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		int cantidad;
		//int c500 = 0, c200 = 0, c100 = 0, c50 = 0, c20 = 0, c10 = 0, c5 = 0, c2 = 0, c1 = 0;
		do {			
			do {
				System.out.println("Introduce una cantidad exacta de euros ");	
				cantidad = s.nextInt();
				if (cantidad <= 0)
					System.out.println("Cantidad Incorrecta. Vuelve a introducirla");	
			}while(cantidad <= 0);
			
			if (cantidad > 500) {
				System.out.println("Billetes de 500: "+ (cantidad / 500));
				//c500 = cantidad / 500;
				cantidad %= 500;
			}
			if (cantidad > 200) {
				System.out.println("Billetes de 200: "+ (cantidad / 200));
				//c200 = cantidad / 200;
				cantidad %= 200;
			}
			if (cantidad > 100) {
				System.out.println("Billetes de 100: "+ (cantidad / 100));
				//c100 = cantidad / 100;
				cantidad %= 100;
			}
			
			if (cantidad > 50) {
				System.out.println("Billetes de 50: "+ (cantidad / 50));
				//c50 = cantidad / 50;
				cantidad %= 50;
			}
			
			if (cantidad > 20) {
				System.out.println("Billetes de 20: "+ (cantidad / 20));
				//c20 = cantidad / 20;
				cantidad %= 20;
			}
			
			if (cantidad > 10) {
				System.out.println("Billetes de 10: "+ (cantidad / 10));
				//c10 = cantidad / 10;
				cantidad %= 10;
			}
			
			if (cantidad > 5) {
				System.out.println("Billetes de 5: "+ (cantidad / 5));
				//c5 = cantidad / 5;
				cantidad %= 5;
			}
			
			if (cantidad > 2) {
				System.out.println("Monedas de 2: "+ (cantidad / 2));
				//c2 = cantidad / 2;
				cantidad %= 2;
			}
			if (cantidad > 1) {
				System.out.println("Monedas de 1: "+ (cantidad / 1));
				//c1 = cantidad / 1;
				cantidad %= 1;
			}
			
			System.out.println("¿Deseas realizar otro desglose? (S/N) ");			
		} while (s.next().toLowerCase().equals("s"));

	}

}
