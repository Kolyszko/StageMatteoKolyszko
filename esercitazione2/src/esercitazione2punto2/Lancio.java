/* Scrivere un programma che simuli il lancio di un dado e di una moneta stampandone il risultato; con e
senza l&#39;utilizzo di una classe astratta che rappresenti i comportamenti comuni degli oggetti dado e moneta
istanziati. */

package esercitazione2punto2;

public abstract class Lancio {
	
	public abstract int lancioOggetto();
	public void stampaLancio() {
		System.out.print("Il valore e': " +lancioOggetto()+ "\n");
	}
}
