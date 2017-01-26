package Ejercicio31;

import java.util.Arrays;

public class Ejercicio31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARIABLE
		int[] array1 = {5,6,2,4,8};
		int[] array2 = {2,3,7};
		int[] arrayConcatenado;
		
		//PROCESO
		arrayConcatenado = concatenacion(array1, array2);
		
		//SALIDA
		for(int aux : arrayConcatenado){
			System.out.print(aux +" ");
		}
		
	}
	public static int[] concatenacion(int[] array1, int[] array2){
		int[] result = new int [array1.length + array2.length];
		
		result = Arrays.copyOf(array1, array1.length + array2.length);
		
		for(int i = 0; i < array2.length; i++){
			result[array1.length + i] = array2[i];
		} 
		
		return result;
	}

}
