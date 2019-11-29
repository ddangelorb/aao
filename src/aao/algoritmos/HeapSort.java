package aao.algoritmos;

/**
 * HeapSort eh um algoritmo de ordenacao por selecao. Considerado uma evolucao do {@link aao.algoritmos.SelectionSort}, esse algoritmo divide a entrada em regioes ordenadas e nao ordenadas, e interativamente diminui as regioes nao ordenadas movendo seus elementos para regioes ordenadas.
 * Essa tecnica utiliza a estrutura de dados Heap, representada por uma arvore binaria hierarquica com algumas condicoes: folhas "encostadas" obrigatoriamente a esquerda; conteudo de todos os nohs sao maiores ou iguais aos filhos; e os nodos sao numerados de cima para baixo, da esquerda para a direita.
 * Com relacao a complexidade de tempo, temos O(nlogn) em todos os casos (melhor, medio e pior).
 * @author ddangelorb
 *
 */
public class HeapSort extends BaseSort {
	public HeapSort() {
		super("HeapSort");
	}
	
	@Override
	protected void realizarOrdenacao() {
		System.arraycopy(this.arrayInicial, 0, this.arrayOrdenado, 0, this.arrayInicial.length);
		constroiHeap();
		ordenaHeap();
	}
	
	private void constroiHeap() {
	    for (int i = this.arrayOrdenado.length / 2-1; i >= 0; i--)
	    	restauraHeap(this.arrayOrdenado.length, i);
	}
	
	private void ordenaHeap() {
	    for (int i = this.arrayOrdenado.length-1; i >= 0; i--) {
	        int temp = this.arrayOrdenado[0];
	        this.arrayOrdenado[0] = this.arrayOrdenado[i];
	        this.arrayOrdenado[i] = temp;

	        restauraHeap(i, 0);
	    }		
	}
	
	private void restauraHeap(int tamanho, int i) {
	    int leftChild = 2*i+1;
	    int rightChild = 2*i+2;
	    int largest = i;

	    // se o filho da esquerda é maior que seu pai...
	    if (leftChild < tamanho && this.arrayOrdenado[leftChild] > this.arrayOrdenado[largest]) {
	        largest = leftChild;
	    }

	    // se o filho da direita é maior que seu pai...
	    if (rightChild < tamanho && this.arrayOrdenado[rightChild] > this.arrayOrdenado[largest]) {
	        largest = rightChild;
	    }

	    // se a troca deve ocorrer...
	    if (largest != i) {
	        int temp = this.arrayOrdenado[i];
	        this.arrayOrdenado[i] = this.arrayOrdenado[largest];
	        this.arrayOrdenado[largest] = temp;
	        restauraHeap(tamanho, largest);
	    }		
	}
}
