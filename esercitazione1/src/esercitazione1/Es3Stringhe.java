/* Scrivere un programma / metodo che data una sequenza di stringhe, conclusa dalla stringa vuota, stampi
la somma delle lunghezze delle stringhe che iniziano con una lettera maiuscola. Per esempio, se si
immettono le stringhe &quot;Albero&quot;, &quot;foglia&quot;, &quot;Radici&quot;, &quot;Ramo&quot;, &quot;fiore&quot; (e poi &quot;&quot; per finire), il programma
stampa 16. */

package esercitazione1;

public class Es3Stringhe {
	public static void main(String[] args) {
		
		String [] parole = {"Albero", "fiore", "Radici", "Ramo", "fiore", ""};
		int contaMaiuscola = 0;
		
		for(int i = 0; i < parole.length; i++) {
			
			if(Character.isUpperCase(parole[i].charAt(0))) {
				contaMaiuscola += parole[i].length();
			}
		}
		System.out.println(contaMaiuscola);
	}
	
}
// Mi dare errore index out of bounds ma non capisco perche'