package esercitazione3punto3;

/* 1. Realizzare il metodo static LinkedList&lt;Integer&gt; mergeOrdinato(Iterator&lt;Integer&gt; a, Iterator&lt;Integer&gt; b)
che effettua il merge ordinato degli elementi dei due iteratori, ritornando il risultato in una lista collegata.
In particolare il merge di due liste ordinate (qui rappresentate dai corrispondenti iteratori, da assumere
come già ordinati) restituisce una nuova lista ordinata contente tutti gli elementi appartenenti alle due liste
di input.
2. Realizzare il metodo static void provaEx3() che crea due liste random ordinate e restituisce il merge
ordinato delle due. Il risultato così ottenuto dovrà essere stampata, insieme ai corrispondenti vettori di
input. */

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Lista3 {
	static LinkedList<Integer> mergeOrdinato(Iterator<Integer> a, Iterator<Integer> b){
		LinkedList <Integer> lista = new LinkedList <Integer>();
		
		while(a.hasNext()) {
	         lista.add(a.next());
	      }
		while(b.hasNext()) {
	         lista.add(b.next());
	      }
		
		Collections.sort(lista);
		
		return lista;
	}
	
	static void provaEx3() {
		LinkedList <Integer> lista = new LinkedList <Integer>();
		
		lista.add((int)(Math.random() * 10));
		for(int i = 1; i < 10; i++) {
			lista.add(lista.getLast() + (int)(Math.random() * 10));
		}
		
		LinkedList <Integer> lista2 = new LinkedList <Integer>();
		
		lista2.add((int)(Math.random() * 10));
		for(int i = 1; i < 10; i++) {
			lista2.add(lista2.getLast() + (int)(Math.random() * 10));
		}
		Iterator itr = lista.iterator();
		Iterator itr2 = lista2.iterator();
		System.out.print(mergeOrdinato(itr, itr2));
	}
}
