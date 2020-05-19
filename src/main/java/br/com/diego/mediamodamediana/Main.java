/**
 * 
 */
package br.com.diego.mediamodamediana;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dcandido
 *
 */
public class Main {
	public static void main(String[] args) {
		List<Integer> nums = lista(9);
		nums.stream().forEach(System.out::print);
		System.out.println("\nMediana: " + Calculos.median(nums));
	}
	private static List<Integer> lista(final int tamanho) {
		List<Integer> lista = new ArrayList<Integer>();
		for(int i=0; i< tamanho; i++)
			lista.add(i);
		return lista;
	}
}
