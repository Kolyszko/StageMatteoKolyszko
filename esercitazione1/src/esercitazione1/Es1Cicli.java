/* Scrivere un programma / metodo che data una sequenza di interi stampi &quot;Tutti positivi e pari&quot; se i numeri
inseriti sono tutti positivi e pari, altrimenti stampa &quot;NO&quot;. Risolvere questo esercizio senza usare array. */

package esercitazione1;

import java.util.Scanner;

public class Es1Cicli {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String risposta = "S";
		boolean verifica = true;
		int num = 0;
		
		do {
			System.out.println("Inserisci un numero");
			num = in.nextInt();
			if(num %2 != 0 || (num < 0)) {
				verifica = false;
			}
			System.out.println("Vuoi continuare?(S/N)");
			risposta = in.next();
		}while(risposta.equals("S"));
		
		if(!verifica) {
			System.out.println("NO");
		} else {
			System.out.println("Tutti posisivi e pari");
		}
	}
}
