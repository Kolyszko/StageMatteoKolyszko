/* Scrivere un programma / metodo che preveda un array di 10 numeri interi contenente valori random e che
stampi la dicitura &quot;Tre valori consecutivi uguali&quot; contiene tre valori uguali in tre posizioni
consecutive,qualora la condizione non dovesse essere verificata dovrà stampare &quot;NO&quot;. */

package esercitazione1;

public class Es3Array {
	public static void main(String[]args) {

	    int[] arr = new int[10];
	    for (int i = 0; i < arr.length; i++) {
	    	arr[i] = (int) (Math.random() * 8);
	    	System.out.println(arr[i]);
	    }
	    
	    int valoriUguali = 0;
	    for(int i = 0; i < arr.length-2; i++) {
	    	if((arr[i] == arr[i+1]) && (arr[i+1] == arr[i+2])) {
	    		valoriUguali++;
	    	}
	    }
	    if(valoriUguali > 0) {
    		System.out.println("Tre valori consecutivi uguali");
    	} else {
    		System.out.println("NO");
    	}
	}
}
