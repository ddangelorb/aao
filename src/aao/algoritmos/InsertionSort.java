package aao.algoritmos;

/**
 * InsertionSort eh um algoritmo de ordenacao que constroi a saida ordenada atraves de um processo individual de cada item da entrada. Eh bem menos eficiente em grandes entradas comparado com algoritmos mais avancados como {@link aao.algoritmos.QuickSort}, {@link aao.algoritmos.HeapSort} ou {@link aao.algoritmos.MergeSort}.
 * Analogicamente essa tecnica pode ser comparada com o processo de ordenacao que normalmente fazemos com cartas de um baralho, ou seja, pegamos individualmente cada item e procuramos a posicao correta desse item no conjunto.
 * Com relacao a complexidade de tempo, temos o melhor caso O(n), caso medio e pior caso O(n&#178;).
 * @author ddangelorb
 *
 */
public class InsertionSort extends BaseSort {
	public InsertionSort() {
		super("InsertionSort");
	}
	
	@Override
	protected void realizarOrdenacao() {
		System.arraycopy(this.arrayInicial, 0, this.arrayOrdenado, 0, this.arrayInicial.length);
		
        int temp;
        
        for (int i = 1; i < this.arrayOrdenado.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(this.arrayOrdenado[j] < this.arrayOrdenado[j-1]){
                    temp = this.arrayOrdenado[j];
                    this.arrayOrdenado[j] = this.arrayOrdenado[j-1];
                    this.arrayOrdenado[j-1] = temp;
                }
            }
        }
	}
}
