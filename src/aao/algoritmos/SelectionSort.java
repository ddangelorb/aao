package aao.algoritmos;

/**
 * SelectionSort eh um algoritmo de ordenacao que organiza a entrada atraves de repetitivas buscas por menores elementos, movendo-os para a primeira posicao, segunda posicao e assim sucessivamente com os elementos restantes.
 * Essa tecnica eh conhecida por sua simplicidade, entretanto, torna-se ineficiente em entradas grandes.
 * Com relacao a complexidade de tempo, temos O(n&#178;) em todos os casos (melhor, medio e pior).
 * @author ddangelorb
 *
 */
public class SelectionSort extends BaseSort {
	public SelectionSort() {
		super("SelectionSort");
	}

	@Override
	protected void realizarOrdenacao() {
		System.arraycopy(this.arrayInicial, 0, this.arrayOrdenado, 0, this.arrayInicial.length);
        int tamanhoArray = this.arrayOrdenado.length; 
        
        // varre o array movendo para a fronteira do sub-array não ordenado
        for (int i=0; i<tamanhoArray-1; i++) 
        { 
            // obtem o minimo indice do array não ordenado 
            int indiceMinimo = i; 
            for (int j = i+1; j<tamanhoArray; j++) { 
                if (this.arrayOrdenado[j] < this.arrayOrdenado[indiceMinimo]) { 
                    indiceMinimo = j; 
                }
            }
            // realiza a troca do menor elemento com o primeiro
            int temp = this.arrayOrdenado[indiceMinimo]; 
            this.arrayOrdenado[indiceMinimo] = this.arrayOrdenado[i]; 
            this.arrayOrdenado[i] = temp; 
        } 		
	}
}
