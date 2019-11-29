package aao.testes;

import java.util.Random;

/**
 * Classe base para rodas os testes e experimentos
 * @author ddangelorb
 *
 */
public class BaseTeste {
	/**
	 * Obtém um array aleatorio para os testes
	 * @param n Tamanho do array
	 * @return Retorna um array aleatorio de tamanho n
	 */
	protected int[] getArrayAleatorio(int n) {
		if (n==0)
			return null;
		
		Random rand = new Random();
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = rand.nextInt(Math.abs(((n*n) - 1) + 1)) + 1;
		}
		return arr;
	}
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	protected int[] getArrayCrescente(int n) {
		if (n==0)
			return null;
		
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = i;
		}
		return arr;
	}
	
	protected int[] getArrayDecrescente(int n) {
		if (n==0)
			return null;
		
		int[] arr = new int[n];
		int j = 0;
		for (int i=n-1; i>=0; i--) {
			arr[j] = i;
			j++;
		}
		return arr;
	}
	
	protected void toPrintArrays(int[] arrayOriginal, int[] arrayOrdenado) {
		System.out.print("Array original: ");
		toStringArray(arrayOriginal);
		System.out.print("Array ordenado: ");
		toStringArray(arrayOrdenado);
	}
	
	protected void toStringArray(int arr[]) {
		int len = arr.length; 
		for (int i=0; i<len; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(); 
	}
}
