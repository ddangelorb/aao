package aao.testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import aao.algoritmos.*;

public class ExperimentosTests extends BaseTeste {
	private BinaryInsertionSort binaryInsertionSort;
	private BubbleSort bubbleSort;
	private BucketSort bucketSort;
	private CountingSort countingSort;
	private HeapSort heapSort;
	private InsertionSort insertionSort;
	private MergeSort mergeSort;
	private QuickSort quickSort;
	private RadixSort radixSort;
	private SelectionSort selectionSort;
	
	@BeforeEach
	void setUp() throws Exception {
		binaryInsertionSort = new BinaryInsertionSort();
		bubbleSort = new BubbleSort();
		bucketSort = new BucketSort();
		countingSort = new CountingSort();
		heapSort = new HeapSort();
		insertionSort = new InsertionSort();
		mergeSort = new MergeSort();
		quickSort = new QuickSort();
		radixSort = new RadixSort();
		selectionSort = new SelectionSort();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testeN25000() {
		int n = 25000;
		rodarExperimento(n);
	}
	
	@Test
	void testeN50000() {
		int n = 50000;
		rodarExperimento(n);
	}

	@Test
	void testeN100000() {
		int n = 100000;
		rodarExperimento(n);
	}

	@Test
	void testeN200000() {
		int n = 200000;
		rodarExperimento(n);
	}

	@Test
	void testeN400000() {
		int n = 400000;
		rodarExperimento(n);
	}
	
	private void doSortComTraceTempo(ISortable ordenador, int[] array, String descricao) {
		System.out.println(descricao);
		long tempoInicial = System.nanoTime();
		ordenador.ordenar(array);
		long tempoFinal = System.nanoTime();
		double tempoDiff = (tempoFinal - tempoInicial) / 1000000;
		System.out.println("      tempo total: " + tempoDiff + " milisegundos");
	}
	
	private void traceArrayExperimento(int[] array, String mensagem) {
		System.out.println(" ");
		System.out.println("      ###############      ");
		System.out.println("      " + mensagem + "      ");
		doSortComTraceTempo(binaryInsertionSort, array, "BinaryInsertionSort com " + mensagem);
		doSortComTraceTempo(bubbleSort, array, "BubbleSort com " + mensagem);
		doSortComTraceTempo(bucketSort, array, "BucketSort com " + mensagem);
		doSortComTraceTempo(countingSort, array, "CountingSort com " + mensagem);
		doSortComTraceTempo(heapSort, array, "HeapSort com " + mensagem);
		doSortComTraceTempo(insertionSort, array, "InsertionSort com " + mensagem);
		doSortComTraceTempo(mergeSort, array, "MergeSort com " + mensagem);
		doSortComTraceTempo(quickSort, array, "QuickSort com " + mensagem);
		doSortComTraceTempo(radixSort, array, "RadixSort com " + mensagem);
		doSortComTraceTempo(selectionSort, array, "SelectionSort com " + mensagem);
		System.out.println("      ###############      ");
		System.out.println(" ");
	}
	
	private void rodarExperimento(int n) {
		int[] arrayAleatorio = getArrayAleatorio(n);
		int[] arrayCrescente = getArrayCrescente(n);
		int[] arrayDecrescente = getArrayDecrescente(n);
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("  **********  ");
		System.out.println("Experimento Teste n=" + n);
		
		traceArrayExperimento(arrayAleatorio, "Array Aleatório");
		traceArrayExperimento(arrayCrescente, "Array Crescente");
		traceArrayExperimento(arrayDecrescente, "Array Decrescente");
		
		System.out.println(" ");
		System.out.println("  **********  ");
	}

}
