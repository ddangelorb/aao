package aao.algoritmos;

/**
 * Classe base para todos os metodos de ordenacao. Implementa a interface ISortable para termos um padrao e polimorfismo na implementacao do metodo ordenar.
 * Nesse estudo de caso estamos considerando 'apenas' ordenacoes atraves de arrays de inteiros, mas os metodos podem ser extensivo a outros tipos de dados.
 * @author ddangelorb
 *
 */
public abstract class BaseSort implements ISortable {
	protected String metodo;
	protected int[] arrayInicial;
	protected int[] arrayOrdenado;
	
	public BaseSort(String metodo) {
		this.metodo = metodo;
	}
	
	public void ordenar(String[] args) {
		inicializarArrayInt(args);
		ordenar(arrayInicial);
	}
	
	public void ordenar(int[] args) {
		arrayInicial = args;
		arrayOrdenado = new int[args.length];
		realizarOrdenacao();
	}
	
	public int[] getArrayOrdenado() {
		return this.arrayOrdenado;
	}
	
	protected void inicializarArrayInt(String[] args) {
		if (args == null || args.length == 0) {
			System.out.println("Por favor, informe um array de numeros inteiros no formato: 'n1,n2,n3,...n'");
			return;
		}
		
		boolean err = false;
		arrayInicial = new int[args.length];
		
		for (int i : arrayInicial) {
			try {
				arrayInicial[i] = Integer.parseInt(args[i]);
			}
			catch (Exception e) {
				err = true;
				System.err.println("Erro na conversão do parâmetro numérico" +  args[i] + " : " + e.getStackTrace());
			}
			finally {
				if (err) {
					System.out.println(".....");
					System.out.println("Por favor, informe um array de numeros inteiros no formato: 'n1,n2,n3,...n'");	
				}
			}
		}
	}
	
	protected int obterMaximo(int arrayComparacao[]) 
    { 
        int valorMaximo = arrayComparacao[0]; 
        for (int i = 1; i < arrayComparacao.length; i++) {
            if (arrayComparacao[i] > valorMaximo) {
                valorMaximo = arrayComparacao[i]; 
            }
        }
        return valorMaximo; 
    } 	
	
	/**
	 * Método abstrato que realizará a ordenação em todas as classes filhas (BubbleSort, BucketSort, etc)
	 */
	protected abstract void realizarOrdenacao();
}
