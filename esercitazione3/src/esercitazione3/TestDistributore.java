package esercitazione3;

import java.util.HashSet;
import java.util.Scanner;

public class TestDistributore {
	public static void main(String[] args) throws BevandaNonValida, TesseraNonValida {
		
		Scanner in = new Scanner(System.in);
		
		HashSet<Bevanda> elencoBevande = new HashSet <Bevanda>();
		elencoBevande.add(new Bevanda("A", "Acqua", 0.49));
		elencoBevande.add(new Bevanda("B", "Coca", 1.49));
		elencoBevande.add(new Bevanda("C", "Birra", 2.20));
		
		for(Bevanda bevanda: elencoBevande) {
			System.out.print(bevanda.toString() + "\n");
		}
		
		System.out.print("Inserisci codice bevanda \n");
		String codice = in.next();
		boolean codiceTrovato = false;
		
		for(Bevanda bevanda: elencoBevande) {
			if(codice.equalsIgnoreCase(bevanda.getCodice())) {
				System.out.print(bevanda.getNome() + " " + bevanda.getPrezzo() + "\n");
				codiceTrovato = true;
			}
		}
		if(!codiceTrovato) {
			throw new BevandaNonValida("Il codice non esiste");
		}
		
		HashSet <Tessera> elencoTessere = new HashSet <Tessera>();
		elencoTessere.add(new Tessera(12, 0.0));
		elencoTessere.add(new Tessera(21, 0.0));
		elencoTessere.add(new Tessera(99, 0.0));
		
		for(Tessera tessera: elencoTessere) {
			
			System.out.print(tessera.toString() + "\n");
		}
		
		for(Tessera tessera: elencoTessere) {
			System.out.print("Inserisci il credito della tessera: " + tessera.getCodice() + "\n");
			double credito = in.nextDouble();
			tessera.caricaTessera(credito);
		}
		
		for(Tessera tessera: elencoTessere) {
			
			System.out.print(tessera.toString() + "\n");
		}
		
		System.out.print("Inserisci codice della tessera \n");
		int codiceTessera = in.nextInt();
		codiceTrovato = false;
		
		for(Tessera tessera: elencoTessere) {
			if(codiceTessera == tessera.getCodice()) {
				System.out.print("Il credito residuo e': " + tessera.leggiCredito() + "\n");
				codiceTrovato = true;
			}
		}
		
		if(!codiceTrovato) {
			throw new TesseraNonValida("Il codice non e' valido");
		}
		
		//Non capisco la consegna del esercizio 3, i metodi aggiornaColonna() e lattineDisponibili() fanno parte di quale classe?
		
	}
}