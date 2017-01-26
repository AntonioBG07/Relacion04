package Ejercicio32;

import java.util.Arrays;

public class Ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARIABLE
		int[] a = {2,5,4,6,3};
		int[] b;
		
		//PROCESO
		b = arrayCopiado(a);
		
		//SALIDA
		System.out.print("Array original: ");
		for(int aux : a){
			System.out.print(aux+ " ");
		}
		System.out.println("");
		
		System.out.print("Array copiado: ");
		for(int aux : b){
			System.out.print(aux+ " ");
		}
	}

	public static int[] arrayCopiado(int[] a){
		int[] copia;
		
		copia = Arrays.copyOf(a, a.length);
		
		return copia;
	}
}
