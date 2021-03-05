/* Scrivere un programma / metodo che chiede all’utente di inserire una sequenza di caratteri (chiedendo
prima quanti caratteri voglia inserire) e li ristampa man mano che vengono inseriti. L’intero procedimento
(chiedere quanti caratteri voglia inserire, leggere i caratteri e man mano stamparli) dovrà essere ripetuto 5
volte. Risolvere questo esercizio senza usare array. */

package esercitazione1;

import java.util.Scanner;

public class Es3Cicli {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.print("Quanti numeri vuoi inserire? ");
			int num = in.nextInt();
			for(int j = 0; j < num; j++) {
				System.out.print("Inserisci un numero ");
				num = in.nextInt();
				System.out.println("Il numero inserito e': " +num);
			}
		}
	}
}
