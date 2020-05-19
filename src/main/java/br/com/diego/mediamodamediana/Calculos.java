/**
 * 
 */
package br.com.diego.mediamodamediana;

import java.util.List;

/**
 * @author dcandido
 *
 */
public class Calculos {
	
	public static Double avarage(final List<Integer> lista) {
		 return lista
				 .stream()
				 .mapToDouble(Integer::doubleValue)
				 .average()
				 .orElse(0.0);
	}
	
	public static Integer mode(int[] elements) {
		int mode = elements[0];
		int total = 0;
		
		for (int i = 0; i < elements.length; i++) {
			int count = 0;
	        for (int j = 0; j < elements.length; j++) {
	            if (elements[j] == elements[i]) ++count;
	        }
	        if (count > total) {
	        	mode = elements[i];
	        	total = count;
	        }
		}
		
		return mode;
	}
	
	public static Integer median(final List<Integer> lista) {
		
		int tamanhoLista = lista.size();
		if(tamanhoLista % 2 != 0) {
			return lista.get((tamanhoLista -1) /2); 
		}
		return lista.get((tamanhoLista) /2);
	}
}
