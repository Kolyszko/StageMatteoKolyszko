
/* Scrivere una classe Employee (dipendente) che estende la classe Person.
Ogni dipendente ha un proprio anno di assunzione e un proprio stipendio. Si definiscano costruttori
e vari metodi get e set opportuni. Si ridefinisca inoltre il metodo visualize() opportunamente.
Si definisca inoltre un metodo gainsMore che prende come parametro un altro oggetto Employee e
restituisce true se l’oggetto corrente ha uno stipendio maggiore di quello ricevuto come parametro,
o false altrimenti.
Per testare la classe, scrivere un programma TestEmployee che crea tre oggetti della classe
Employee e li visualizza in ordine di stipendio (usando il nuovo metodo per confrontare gli
stipendi). */

package esercitazione2;

public class TestEmployee {
	public static void main(String[] args) {
		Employee impiegato[]= new Employee[3];
		impiegato[0] = new Employee("Kolyszko", "Matteo", "klymtt98l01f205i", "Milano", 2021, 1200);
		impiegato[1] = new Employee("Molyszko", "Katteo", "klymtt89l01f205i", "Milano", 2021, 1100);
		impiegato[2]= new Employee("Polyszko", "Patteo", "klymtt02l01f205i", "Milano", 2021, 1500);
		
		for(int i = 0; i < 3; i++) {
			for(int j= 1; j < (3-i); j++) {
				if(impiegato[j-1].gainMore(impiegato[j])) {
					Employee fantoccio = impiegato[j-1];
					impiegato[j-1] = impiegato[i];
					impiegato[i] = fantoccio;
				}
			}
		}
		
	    for (int i = 0; i < 3; i++) {
	    	System.out.print(impiegato[i] +"\n");
	    }
	}
}
