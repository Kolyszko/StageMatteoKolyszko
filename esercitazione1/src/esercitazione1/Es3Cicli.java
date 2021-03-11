/* Scrivere un programma / metodo che chiede all’utente di inserire una sequenza di caratteri (chiedendo
prima quanti caratteri voglia inserire) e li ristampa man mano che vengono inseriti. L’intero procedimento
(chiedere quanti caratteri voglia inserire, leggere i caratteri e man mano stamparli) dovrà essere ripetuto 5
volte. Risolvere questo esercizio senza usare array. */

package esercitazione1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Es3Cicli {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 0, num2 = 0;
		boolean errore = true;
		for(int i = 0; i < 5; i++) {
			do {	
				try {
					System.out.print("Quanti numeri vuoi inserire? ");
					num = in.nextInt();
					errore = false;
				}catch(InputMismatchException e) {
					 System.out.print("Il carattere inserito non e' valido \n");
					 errore = true;
				}
				in.nextLine();
			}while(errore);
			for(int j = 0; j < num; j++) {
				do {	
					try {
						System.out.println("inserisci un numero");
						num2 = in.nextInt();
						errore = false;
					}catch(InputMismatchException e) {
						 System.out.print("Il carattere inserito non e' valido \n");
						 errore = true;
					}
					in.nextLine();
				}while(errore);
				
				System.out.println("Il numero inserito e': " +num2);
			}
		}
	}
}


