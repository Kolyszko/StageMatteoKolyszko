/* Scrivere un programma / metodo che data una stringa in input ne stampi le sole vocali. Per esempio, se si
immette la stringa "Viva Java", il programma stampa "iaaa". */

package esercitazione1;

public class Es2Stringhe {
	public static void main(String [] args) {
		
		String parola = "Viva Java";
		String soloVocali = "";
		
		for(int i = 0; i < parola.length(); i++) {
			switch(parola.charAt(i)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					soloVocali += parola.charAt(i);
					break;
			}
		}
		System.out.println(soloVocali);
		
	}

}
