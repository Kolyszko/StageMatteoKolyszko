
/*Scrivere un programma / metodo che preveda un array di 10 numeri interi contenente valori random. Tale
programma dovrà stampare la dicitura &quot;Pari e dispari uguali&quot; se la somma dei numeri in posizioni pari
dell’array è uguale alla somma dei numeri in posizioni dispari, altrimenti il programma dovrà stampare la
dicitura &quot;Pari e dispari diversi&quot;.*/

package esercitazione1;

public class es2Array {
	public static void main(String[]args) {

	    int[] arr = new int[10];
	    for (int i = 0; i < arr.length; i++) {
	    	arr[i] = (int) (Math.random() * 100);
	    	System.out.println(arr[i]);
	    }
	    
	    int sommaPari = 0;
	    int sommaDispari = 0;
	    for (int i = 0; i < arr.length-1; i++) {
	    	sommaPari += arr[i];
	    	sommaDispari += arr[i+1];
	    	i++;
	    }
	    
	    if(sommaPari == sommaDispari) {
	    	System.out.println("Pari e dispari uguali");
	    } else {
	    	System.out.println("Pari e dispari diversi");
	    }
	    
	}
}
