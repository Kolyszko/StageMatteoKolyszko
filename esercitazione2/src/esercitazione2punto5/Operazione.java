
/* Definire una interfaccia &#39;operazione&#39; e le sue classi derivate( sub. div, mul) in modo che da ciascuna sia
possibile eseguire la corrispondente operazione aritmetica (di addizione, divisione, moltiplicazione)
istanziando un oggetto di classe &#39;operazione&#39; e due operandi. Realizzare anche, una classe astratta che
implementi le funzionalità comuni come la stampa a video del risultato. */

package esercitazione2punto5;

public interface Operazione {
	public double calcolo();
	public void stampa();
}
