package aao.algoritmos;

/**
 * MergeSort eh um algoritmo de ordenacao que utiliza comparacoes em uma abordagem de divisao e conquista, ou seja, divide um problema em varios subproblemas, atraves da recursividade, e apos os subproblemas serem resolvidos o problema conquista sua solucao agregando todas as solucoes dos subproblemas.
 * Devido a sua caracteristica de "misturar" ou agregar as solucoes dos subproblemas no problema de origem, esse algoritmo recebeu o nome de Merge Sort. Esse metodo de ordenacao possui alto nivel de recursividade, e por isso o algoritmo requisita um alto consumo de memoria. Portanto, essa tecnica pode nao ser muito eficiente em caso de escassez de recurso.
 * Com relacao a complexidade de tempo, temos O(nlog(n)) em todos os casos (melhor, medio e pior). 
 * @author ddangelorb
 *
 */
public class MergeSort extends BaseSort {
	public MergeSort() {
		super("MergeSort");
	}
	
	@Override
	protected void realizarOrdenacao() {
		System.arraycopy(this.arrayInicial, 0, this.arrayOrdenado, 0, this.arrayInicial.length);
		
		doMergeSort(0, this.arrayInicial.length - 1);
	}
	
	private void doMergeSort(int menorIndice, int maiorIndice) {
		if (menorIndice < maiorIndice) {
			int meio = (menorIndice+maiorIndice)/2;
			
			doMergeSort(menorIndice, meio);
			doMergeSort(meio + 1, maiorIndice);
			mergePartes(menorIndice, meio, maiorIndice);
		}
	}
	
	private void mergePartes(int menorIndice, int meio, int maiorIndice) {
        // obtem o tamanho dos 2 sub-arrays de trabalho 
        int tamanhoArrayEsq = meio - menorIndice + 1; 
        int tamanhoArrayDir = maiorIndice - meio; 
  
        // cria os 2 sub-arrays que serão mergeados
        int arrayEsq[] = new int [tamanhoArrayEsq]; 
        int arrayDir[] = new int [tamanhoArrayDir]; 
  
        // copia dos 2 sub-arrays de trabalho 
        for (int i=0; i<tamanhoArrayEsq; ++i)  {
        	arrayEsq[i] = this.arrayOrdenado[menorIndice + i];
        }
        for (int j=0; j<tamanhoArrayDir; ++j) { 
            arrayDir[j] = this.arrayOrdenado[meio + 1+ j];
        }
        
        int indiceEsq = 0;
        int indiceDir = 0; 
        int k = menorIndice;
        
        while (indiceEsq < tamanhoArrayEsq && indiceDir < tamanhoArrayDir) { 
            if (arrayEsq[indiceEsq] <= arrayDir[indiceDir]) { 
            	this.arrayOrdenado[k] = arrayEsq[indiceEsq]; 
                indiceEsq++; 
            } 
            else { 
            	this.arrayOrdenado[k] = arrayDir[indiceDir]; 
                indiceDir++; 
            } 
            k++; 
        } 
  
        // copia se houver valores remanescentes do sub-array esq
        while (indiceEsq < tamanhoArrayEsq) { 
        	this.arrayOrdenado[k] = arrayEsq[indiceEsq]; 
            indiceEsq++; 
            k++; 
        } 
  
        // copia se houver valores remanescentes do sub-array dir
		while (indiceDir < tamanhoArrayDir) { 
	    	this.arrayOrdenado[k] = arrayDir[indiceDir]; 
	        indiceDir++; 
	        k++; 
        } 
	} 
}
