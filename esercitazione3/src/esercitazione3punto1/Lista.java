package esercitazione3punto1;

/* Realizzare il metodo static LinkedList&lt;Integer&gt; creaRandom(int n, int max) che genera una lista costituita
da n valori interi random tra 0 e max-1.
Realizzare il metodo static void stampa(Iterator&lt;Integer&gt; i) che stampa gli elementi dell’iteratore nella
forma <elem1>;,<elem2>,…., <elemN>;
Realizzare il metodo static void provaEx1() che, utilizzando i metodi appena creati, crei un vettore di 20
elementi random (sia ordinato che non) e li stampa. Questo metodo andrà poi chiamato dal main per i test
di correttezza.
*/

import java.util.Iterator;
import java.util.LinkedList;

public class Lista {
	
	static LinkedList <Integer> creaRandom(int n, int max){
		LinkedList <Integer> lista = new LinkedList <Integer>();
		
		for(int i = 0; i < n; i++) {
			lista.add((int)(Math.random() * max-1));
		}
		return lista;
	}
	
	static void Stampa(Iterator<Integer> i) {
		
		while(i.hasNext()) {
	         Object element = i.next();
	         System.out.print("<" + element + "> ");
	      }
	}
	
	static void provaEx1() {
		creaRandom(20, 20);
		Iterator itr = creaRandom(20, 20).iterator();
		Lista.Stampa(itr);
	}
	
}
