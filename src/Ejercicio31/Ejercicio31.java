package Ejercicio31;

import java.util.Arrays;

public class Ejercicio31 {

	public static void main(String[] args) {
		//VARIABLE
		int[] array1 = {5,6,2,4,8};
		int[] array2 = {2,3,7};
		int[] arrayConcatenado;
		
		//PROCESO
		arrayConcatenado = concatenacion(array1, array2);
		
		//SALIDA
		imprimirArray(arrayConcatenado);
		
	}
	public static int[] concatenacion(int[] array1, int[] array2){
		int[] result = new int [array1.length + array2.length];
		
		result = Arrays.copyOf(array1, array1.length + array2.length);
		
		for(int i = 0; i < array2.length; i++){
			result[array1.length + i] = array2[i];
		} 
		
		return result;
	}
	
	/**
	 * Funcion para imprimir un array por pantalla
	 * @param array
	 */
	public static void imprimirArray(int[] array){
		System.out.print("[");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i]);
			if (i != array.length - 1){
				System.out.print(",");
			}
		}
		System.out.print("]");
	}

}
