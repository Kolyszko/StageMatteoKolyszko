/* Scrivere un programma / metodo che data una sequenza di interi stampi la media di tutti i numeri inseriti 
che siano divisibili per tre. Per esempio, se si immettono i valori 5, 8, 9, 12, 7, 6 ,1 il risultato stampato
dovrà essere 9. Risolvere questo esercizio senza usare array. */

package esercitazione1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Es2Cicli {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String risposta = "";
		int num = 0;
		float numeratore = 0;
		float denominatore = 0;
		boolean errore = true;
		
		do {
			do {	
				try {
					System.out.println("inserisci un numero");
					num = in.nextInt();
					errore = false;
				}catch(InputMismatchException e) {
					 System.out.print("Il carattere inserito non e' valido \n");
					 errore = true;
				}
				in.nextLine();
			}while(errore);
			
			if(num %3 == 0) {
				numeratore += num;
				denominatore++;
			}
			System.out.println("vuoi continuare?(S/N)");
			risposta = in.next();
		} while(risposta.equals("S"));
		
		System.out.print("La media e':" + numeratore / denominatore);
	}
}
