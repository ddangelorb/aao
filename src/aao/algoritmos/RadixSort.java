package aao.algoritmos;

import java.util.Arrays;

/**
 * RadixSort eh um algoritmo de ordenacao de numeros inteiros que utiliza o digito para a tarefa principal. 
 * Essa tecnica realiza a ordenacao por colunas, a partir dos digitos menos significativos ao mais significativo utilizando um algoritmo estavel.
 * Com relacao a complexidade de tempo, temos O(dn) em todos os casos (melhor, medio e pior) onde temos d como o numero de digitos dos elementos de entrada.
 * @author ddangelorb
 *
 */
public class RadixSort extends BaseSort {
	public RadixSort() {
		super("RadixSort");
	}

	@Override
	protected void realizarOrdenacao() {
		System.arraycopy(this.arrayInicial, 0, this.arrayOrdenado, 0, this.arrayInicial.length);
		
        // obtem o valor maximo para saber o numero de digitos 
        int valorMaximo = obterMaximo(this.arrayOrdenado); 
  
        // ordena para cada digito
        for (int exp = 1; valorMaximo/exp > 0; exp *= 10) 
        	ordenaContagem(exp);		
		
	}
	
	private void ordenaContagem(int exp) 
    { 
        int saida[] = new int[this.arrayOrdenado.length];
        int i; 
        int contador[] = new int[10]; 
        Arrays.fill(contador,0); 
  
        // armazena a contagem de ocorrencias no array contador 
        for (i = 0; i < this.arrayOrdenado.length; i++) 
            contador[ (this.arrayOrdenado[i]/exp)%10 ]++; 
  
        // muda o array contador para que contenha a posicao atual de seu digito na saida
        for (i = 1; i < 10; i++) 
            contador[i] += contador[i - 1]; 
  
        // constroi o array saida
        for (i = this.arrayOrdenado.length - 1; i >= 0; i--) 
        { 
            saida[contador[ (this.arrayOrdenado[i]/exp)%10 ] - 1] = this.arrayOrdenado[i]; 
            contador[ (this.arrayOrdenado[i]/exp)%10 ]--; 
        } 
  
        // reorganiza o array ordenado de saida
        for (i = 0; i < this.arrayOrdenado.length; i++) 
        	this.arrayOrdenado[i] = saida[i]; 
    } 	
}
