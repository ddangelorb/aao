package aao.algoritmos;

/**
 * BubbleSort eh um algoritmo que executa repetidas trocas de elementos adjacentes para corrigir a ordenacao.
 * Considerado o jeito mais simples para a tarefa de ordenacao, o BubbleSort percorre o vetor a ser ordenado diversas vezes, e em cada passagem faz os elementos flutarem aproximando-se das suas devidas posicoes. O movimento de flutuacao lembra como as bolhas em um tanque fazem, por isso o nome BubbleSort. O algoritmo executa as trocas ate percorrer o array de entrada sem nenhum troca, pois nesse momento teremos a certeza que o array esta ordenado.
 * Com relacao a complexidade de tempo, temos o melhor caso O(n), caso medio e pior caso O(n&#178;).
 * @author ddangelorb
 *
 */
public class BubbleSort extends BaseSort {
	
	public BubbleSort() {
		super("BubbleSort");
	}
	
	@Override
	protected void realizarOrdenacao() {
		System.arraycopy(this.arrayInicial, 0, this.arrayOrdenado, 0, this.arrayInicial.length);
		
		int len = this.arrayOrdenado.length; 
		for (int i = 0; i < len-1; i++) {
			for (int j = 0; j < len-i-1; j++) {
				if (this.arrayOrdenado[j] > this.arrayOrdenado[j+1]) {
					int aux = this.arrayOrdenado[j]; 
					this.arrayOrdenado[j] = this.arrayOrdenado[j+1];
					this.arrayOrdenado[j+1] = aux; 
				}
			}
		}
	}
}
