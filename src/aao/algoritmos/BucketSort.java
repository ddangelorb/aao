package aao.algoritmos;

/**
 * BucketSort eh um algoritmo de ordenacao que divide os elementos de entrada em cestos (buckets). Cada cesto eh ordenado individualmente, e no final percorre-se os cestos em ordem listando os elementos e concatenando na ordem final.
 * Essa tecnica pressupoe que a entrada eh uniformemente distribuida e espera-se poucos elementos em cada intervalo.
 * Com relacao a complexidade de tempo, temos o melhor caso e caso medio O(n), pior caso O(n&#178;).
 * @author ddangelorb
 *
 */
public class BucketSort extends BaseSort {
	public BucketSort() {
		super("BucketSort");
	}

	@Override
	protected void realizarOrdenacao() {
		System.arraycopy(this.arrayInicial, 0, this.arrayOrdenado, 0, this.arrayInicial.length);
		
        // obtem o valor maximo para saber o numero de digitos 
        int valorMaximo = obterMaximo(this.arrayOrdenado); 
        int [] balde=new int[valorMaximo+1];

        for (int i=0; i<balde.length; i++) {
            balde[i]=0;
         }
    
         for (int i=0; i<this.arrayOrdenado.length; i++) {
            balde[this.arrayOrdenado[i]]++;
         }
    
         int indiceSaida=0;
         for (int i=0; i<balde.length; i++) {
            for (int j=0; j<balde[i]; j++) {
            	this.arrayOrdenado[indiceSaida++]=i;
            }
         }        
	}
}
