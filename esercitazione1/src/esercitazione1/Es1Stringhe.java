/* Scrivere un programma / metodo che data una stringa in input la stampi al contrario. Per esempio, se si
immette la stringa "Viva Java", il programma stampa "avaJ aviV" */

package esercitazione1;

public class Es1Stringhe {
	public static void main(String[] args) {
		
		String parola = "Viva Java";
		String inverti = "";
		
		for(int i = parola.length()-1; i >= 0; i--) {
			inverti += parola.charAt(i);
		}
		
		System.out.println(inverti);
	}
}
