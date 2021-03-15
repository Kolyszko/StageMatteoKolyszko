package esercitazione3punto2;

/* Realizzare il metodo static LinkedList&lt;Integer&gt; creaRandomCrescente(int n) che genera una lista collegata
costituita da n valori random crescenti.
Parte 2
Realizzare un metodo static LinkedList&lt;Integer&gt; parseString(LinkedList&lt;String&gt; a) che ritorna una lista
Collegata di interi ottenuti applicando il metodo Integer.parseInt(…) agli elementi dell’iteratore passato
come parametro.
a. Per il test generare una lista di stringhe opportuna con almeno 10 elementi
b. Individuare almeno un input in cui il metodo genera una eccezione
3. Realizzare il metodo static void provaEx2() per il test dei metodi */

import java.util.Iterator;
import java.util.LinkedList;

public class Lista {
	
	static LinkedList <Integer> creaRandomCrescente(int n){
		LinkedList <Integer> lista = new LinkedList <Integer>();
		
		lista.add((int)(Math.random() * 10));
		for(int i = 1; i < n; i++) {
			lista.add(lista.getLast() + (int)(Math.random() * 10));
		}
		return lista;
	}
	
	static LinkedList<Integer> parseString(LinkedList<String> a){
		LinkedList <Integer> lista = new LinkedList <Integer>();
		Iterator<String> iterator = a.iterator();
		
		while(iterator.hasNext()) {
	         lista.add(Integer.parseInt(iterator.next()));
	      }
		return lista;
	}
	
	static void provaEx2() {
		LinkedList <String> a = new LinkedList <String>();
		a.add("1");
		a.add("4");
		a.add("5");
		a.add("2");
		a.add("7");
		a.add("9");
		a.add("3");
		a.add("0");
		//a.add("banana");
		System.out.print(parseString(a));
	}	
}
