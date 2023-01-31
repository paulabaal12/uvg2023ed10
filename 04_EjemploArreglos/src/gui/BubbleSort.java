/**
 * 
 */
package gui;

import java.util.Comparator;

/**
 * @author MAAG
 *
 */
public class BubbleSort<T> {
	
	public void sort(T[] arreglo, Comparator<T> comparador) {
		for (int i = 0; i < arreglo.length - 1; i++) { //TIENE DOS CICLOS ; interior y exterior (externo e interno)
			for (int j = i + 1; j < arreglo.length; j++) { // j inicia desde 1, cuando i se mueva va a ir detrás.
				if (comparador.compare(arreglo[i], arreglo[j]) > 0) { //Van a comparar, si i es mayor a lo que esta en j, Se hace un intercambio
					T aux = arreglo[j];
					arreglo[j] = arreglo[i];
					arreglo[i] = aux;
				} 
			}
		}
	}
}
//LO QUE HACE EL METODO ES ORDENAR BubbleSort