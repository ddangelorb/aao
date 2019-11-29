package aao.algoritmos;

/**
 * BinaryInsertionSort eh uma variacao do {@link aao.algoritmos.InsertionSort} que utiliza uma busca binaria para determinar a correta localizacao dos elementos no processo de ordenacao. Assim como o {@link aao.algoritmos.InsertionSort}, constroi a saida ordenada atraves de um processo individual de cada item da entrada. 
 * Essa tecnica reduz o numero de comparacoes feitas em uma ordenacao realizada no {@link aao.algoritmos.InsertionSort} e, portanto, consegue reduzir o tempo no pior caso.
 * Com relacao a complexidade de tempo, temos o melhor caso O(n), caso medio O(n&#178;) e pior caso O(nlogn).
 * @author ddangelorb
 */
public class BinaryInsertionSort extends BaseSort {
	public BinaryInsertionSort() {
		super("BinaryInsertionSort");
	}
	
	@Override
	protected void realizarOrdenacao() {
		System.arraycopy(this.arrayInicial, 0, this.arrayOrdenado, 0, this.arrayInicial.length);
		
        for (int i=0; i<this.arrayOrdenado.length; ++i){
            int temp=this.arrayOrdenado[i];
            int indiceEsq=0;
            int indiceDir=i;
            while (indiceEsq<indiceDir){
                int indiceMeio=(indiceEsq+indiceDir)/2;
                if (temp>=this.arrayOrdenado[indiceMeio]) {
                	indiceEsq = indiceMeio + 1;
                }
                else {
                    indiceDir=indiceMeio;
                }
            }
            for (int j=i;j>indiceEsq;--j) {
                troca(j-1,j);
            }
        }		
	}
	
	private void troca(int i,int j){
        int k=this.arrayOrdenado[i];
        this.arrayOrdenado[i]=this.arrayOrdenado[j];
        this.arrayOrdenado[j]=k;
    }
}
