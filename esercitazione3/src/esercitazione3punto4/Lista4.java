package esercitazione3punto4;

/* 1. Realizzare il metodo static LinkedList&lt;LinkedList&lt;Integer&gt; insiemeDiInsiemi(int n) che costruisce una
lista di liste così definita:
a. Il primo elemento della lista contiene una lista con il solo valore 0;
b. Il secondo elemento contiene una lista con gli elementi 0 e 1
c. Il terzo contiene una lista con gli elementi 0,1,2
d. … e così via fino ad n-1
2. Realizzare il metodo static void stampa(LinkedList &lt;LinkedList&lt;Integer&gt;&gt; a) in grado di stampare il
contenuto della lista */

import java.util.LinkedList;

public class Lista4 {
	static LinkedList<LinkedList<Integer>> insiemiDiInsiemi(int n){
		
		LinkedList <LinkedList<Integer>> lista = new LinkedList <LinkedList<Integer>>();
		
		for(int i = 0; i < n; i++) {
			lista.add(i, new LinkedList<Integer>());
			for(int j = 0; j <= i; j++) {
				lista.get(i).add(j);
			}
		}
		return lista;
	}
	
	static void stampa() {
		System.out.print(insiemiDiInsiemi(6));
	}
}
