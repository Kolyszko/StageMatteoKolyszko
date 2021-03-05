
/* Scrivere un programma / metodo che preveda un array di 10 numeri interi contenente valori a piacere e ne
stampa gli elementi secondo il seguente ordine: il primo, l’ultimo, il secondo, il penultimo, il terzo, il
terz’ultimo, ecc. */

package esercitazione1;

public class Es1Array {
	public static void main(String[] args) {
		
		int [] narray = {1,2,3,4,5,6,7,8,9,10};
		int j = narray.length - 1;
		int i = 0;
		while(i < narray.length/2){
			System.out.println(narray[i]);
			System.out.println(narray[j]);
			i++;
			j--;
			}
		}
		
	}
