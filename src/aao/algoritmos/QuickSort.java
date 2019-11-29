package aao.algoritmos;

/**
 * QuickSort eh um algoritmo de ordenacao que utiliza comparacoes em uma abordagem de divisao e conquista, ou seja, divide um problema em varios subproblemas, atraves da recursividade, e apos os subproblemas serem resolvidos o problema conquista sua solucao agregando todas as solucoes dos subproblemas.
 * Essa tecnica de comparacao elege um elemento no array de entrada denomindo-o como pivo, particionado a entrada sucessivamente ate que as sublistas sejam unitarias (ou vazias) para facilitar a juncao das partes e ordenacao.
 * Com relacao a complexidade de tempo, temos O(nlogn) no melhor e caso medio. Entretanto, no pior caso a complexidade pode ser O(n&#178;), ocorrendo geralmente quando o vetor de entrada ja esta ordenado.
) 
 * @author ddangelorb
 *
 */
public class QuickSort extends BaseSort {
	public QuickSort() {
		super("QuickSort");
	}
	
	@Override
	protected void realizarOrdenacao() {
		System.arraycopy(this.arrayInicial, 0, this.arrayOrdenado, 0, this.arrayInicial.length);
		doQuickSort(0, this.arrayInicial.length - 1);
	}
	
	private void doQuickSort(int menorIndice, int maiorIndice) {
		if (menorIndice < maiorIndice) {
		    int pivot = particiona(menorIndice, maiorIndice);
		    doQuickSort(menorIndice, pivot-1);
		    doQuickSort(pivot+1, maiorIndice);			
		}
	}

	private int particiona(int menorIndice, int maiorIndice) {
	    int pivot = maiorIndice;

	    int contador = menorIndice;
	    for (int i = menorIndice; i<maiorIndice; i++) {
	        if (this.arrayOrdenado[i] < this.arrayOrdenado[pivot]) {
	            int temp = this.arrayOrdenado[contador];
	            this.arrayOrdenado[contador] = this.arrayOrdenado[i];
	            this.arrayOrdenado[i] = temp;
	            contador++;
	        }
	    }
	    int temp = this.arrayOrdenado[pivot];
	    this.arrayOrdenado[pivot] = this.arrayOrdenado[contador];
	    this.arrayOrdenado[contador] = temp;

	    return contador;
	}
}
