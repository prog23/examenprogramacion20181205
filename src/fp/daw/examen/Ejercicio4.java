package fp.daw.examen;

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
	
	public static void arrayAleatorioOrdenado(int tam, int num) {
		 Random numAzar = new Random();
	        Scanner sc = new Scanner(System.in);	        
	     
	        System.out.println("Ingrese Tamaño");
	        tam=sc.nextInt();
	        if (tam < 975 || tam > 13579) {
	        int a[]=new int[tam];
	         for(int i=0; i<a.length; i++){ 
	            num= (int)(numAzar.nextDouble()*100);
	            a[i]=num;
	         }
	        
	        System.out.println("array A desordenado: "); 
	        for(int i=0; i<a.length; i++) 
	            System.out.println(a[i]);  
	
	        int aux; 
	        for(int i=1; i<=a.length; i++) { 
	            for(int j=0; j<a.length-i; j++) { 
	                if( a[j] > a[j+1] ) { 
	                    aux   = a[j]; 
	                    a[j]  = a[j+1]; 
	                    a[j+1]= aux; 
	                }       
	               
	            
	        
	        }	        
	           
	        }
	        System.out.println("\nArray A ordenado: "); 
            for(int i=0; i<a.length; i++) 
                System.out.println(a[i]); 
	        }
	}
	        
	/*
	 * 0,25 puntos
	 * 
	 * Escribe en el método main las sentencias necesarias para poner a prueba el método
	 * 'arrayAleatorioOrdenado' mostrando por pantalla el resultado de su ejecución. 
	 */
	
	public static void main(String[] args) {
		arrayAleatorioOrdenado(0, 0);
		
	}

}



