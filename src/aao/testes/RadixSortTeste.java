package aao.testes;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import aao.algoritmos.RadixSort;

public class RadixSortTeste extends BaseTeste {
	@BeforeEach
	void setUp(TestInfo testInfo) throws Exception {
		System.out.println("RadixSortTeste." + testInfo.getDisplayName());
	}
	
	@Test
	void testeAmostra() {
		int arrayEntrada[] = {64, 34, 25, 12, 22, 11, 90};
		int arrayEntradaOrdenado[] = {11, 12, 22, 25, 34, 64, 90};
		
		RadixSort classeOrd = new RadixSort();
		classeOrd.ordenar(arrayEntrada);
		int arraySaida[] = classeOrd.getArrayOrdenado();
		
		assertTrue(Arrays.equals(arrayEntradaOrdenado, arraySaida));
		toPrintArrays(arrayEntrada, classeOrd.getArrayOrdenado());
	}
	
	@Test
	void testeArrayAleatorio() {
		int[] arrayEntrada = getArrayAleatorio(8);
		RadixSort classeOrd = new RadixSort();
		classeOrd.ordenar(arrayEntrada);
		toPrintArrays(arrayEntrada, classeOrd.getArrayOrdenado());
	}
	
	@Test
	void testeArrayCrescente() {
		int[] arrayEntrada = getArrayCrescente(8);
		RadixSort classeOrd = new RadixSort();
		classeOrd.ordenar(arrayEntrada);
		toPrintArrays(arrayEntrada, classeOrd.getArrayOrdenado());
	}
	
	@Test
	void testeArrayDecrescente() {
		int[] arrayEntrada = getArrayDecrescente(8);
		RadixSort classeOrd = new RadixSort();
		classeOrd.ordenar(arrayEntrada);
		toPrintArrays(arrayEntrada, classeOrd.getArrayOrdenado());
	}
}
