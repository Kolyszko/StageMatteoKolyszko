
/* Il gestore di un negozio associa a tutti i suoi Prodotti un codice a barre univoco, una descrizione
sintetica del prodotto e il suo prezzo unitario. Realizzare una classe Prodotti con le opportune
variabili d&#39;istanza e metodi get.
Aggiungere alla classe Prodotti un metodo applicaSconto che modifica il prezzo del prodotto
diminuendolo del 5%.
Aggiungere alla classe Prodotti un&#39;implementazione specifica dei metodi ereditati dalla
classe Object.
Il gestore del negozio vuole fare una distinzione tra i prodotti Alimentari e quelli Non Alimentari .
Ai prodotti Alimentari viene infatti associata una data di scadenza (si veda la classe Data), mentre a
quelli Non Alimentari il materiale principale di cui sono fatti. Realizzare le sottoclassi Alimentari e
NonAlimentari estendendo opportunamente la classe Prodotti.
Modificare le due sottoclassi dell&#39;esercizio specializzando il metodo applicaSconto in modo che nel
caso dei prodotti Alimentari venga applicato uno sconto del 20% se la data di scadenza è a meno di
10 giorni dalla data attuale (si usi il metodo getDifference della classe Data), mentre nel caso dei
prodotti Non Alimentari venga applicato uno sconto del 10% se il prodotto è composto da un
materiale riciclabile (carta, vetro o plastica).
Realizzare una classe ListaSpesa che chieda all&#39;utente di inserire i prodotti acquistati e calcoli il
totale della spesa applicando gli opportuni sconti se il cliente ha la tessera fedeltà. */

package esercitazione2punto1;

import java.util.Scanner;

public class ListaSpesa {
	public static void main(String[] args) {
		
		Prodotto listaProdotti[] = new Prodotto[5];
		
		//listaProdotti[0] = new Alimentare(123, "Mela", 0.99,); Non so cosa passare come parametro Date 
		
		listaProdotti[0] = new NonAlimentare(123, "Finestra", 7.99, "Vetro");
		listaProdotti[1] = new NonAlimentare(456, "Cacciavite", 4.99, "Ferro");
		listaProdotti[2] = new NonAlimentare(789, "Fazzoletto", 1.99, "Carta");
		listaProdotti[3] = new NonAlimentare(135, "Bottiglia", 2.99, "Plastica");
		listaProdotti[4] = new NonAlimentare(246, "Tavolo", 14.99, "Legno");
		double spesaTotale = 0;
		Scanner in = new Scanner(System.in);
		String continuare = "";
		for(int i = 0; i < listaProdotti.length; i++) {
			System.out.print(listaProdotti[i].getDescrizioneProdotto()+ "\n");
		}
		System.out.print("Ha la tessera? ");
		String tessera = in.next();
		
		do {
			System.out.print("Scrivere i prodotti che si vuole comprare \n");
			String oggetto = in.next();
			for(int i = 0; i < listaProdotti.length; i++) {
				if(listaProdotti[i].getDescrizioneProdotto().equalsIgnoreCase(oggetto)) {
					if(listaProdotti[i] instanceof Alimentare) {
						Alimentare alimento = (Alimentare) listaProdotti[i];
						if(tessera.equalsIgnoreCase("si")) { // Stesso problema con la data :(
							alimento.applicaSconto();
							spesaTotale += alimento.getPrezzo();
						}else {
							spesaTotale += alimento.getPrezzo();
						}
					}else {
						NonAlimentare prodotto = (NonAlimentare) listaProdotti[i];
						if(tessera.equalsIgnoreCase("si") && (prodotto.getMateriale().equalsIgnoreCase("carta") ||
							prodotto.getMateriale().equalsIgnoreCase("vetro") 
							|| prodotto.getMateriale().equalsIgnoreCase("plastica"))) {
							prodotto.applicaSconto();
							spesaTotale += prodotto.getPrezzo();
						}else {
							spesaTotale += prodotto.getPrezzo();
						}
					}
				}
			}
			System.out.print("Vuoi continuare? \n");
			continuare = in.next();
		}while(!(continuare.equalsIgnoreCase("no")));
		
		
		
		
		System.out.print("Il saldo da pagare e': " +spesaTotale);
	}
	
}
