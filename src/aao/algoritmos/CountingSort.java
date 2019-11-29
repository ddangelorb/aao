package aao.algoritmos;

/**
 * CountingSort eh um algoritmo de ordenacao por contagem, sem a necessidade de comparacao entre os elementos.
 * Essa tecnica utiliza a contagem de numeros de elementos atraves de valores-chaves distintos, e utiliza calculos para a posicao adequada de cada elemento.
 * Com relacao a complexidade de tempo o CountingSort eh um algoritmo estavel, portanto, temos O(n + k) em todos os casos (melhor, medio e pior) onde k eh o intervalo de chaves nao negativas.
 * @author ddangelorb
 *
 */
public class CountingSort extends BaseSort {
	public CountingSort() {
		super("CountingSort");
	}

	@Override
	protected void realizarOrdenacao() {
		System.arraycopy(this.arrayInicial, 0, this.arrayOrdenado, 0, this.arrayInicial.length);

		// cria um contador para cada numero possivel e inicializa com zeros
		int valorMaximo = obterMaximo(this.arrayOrdenado);
		int contador[] = new int[valorMaximo+1];
	    
	    // preenche os buckets
	    for (int i : this.arrayOrdenado) {
	      contador[i]++;
	    }
	    
	    // orderna 
	    int indice = 0;
		for (int i = 0; i < contador.length; i++) {
			while (0 < contador[i]) {
				this.arrayOrdenado[indice++] = i;
				contador[i]--;
			}
	    }		
	}
}
