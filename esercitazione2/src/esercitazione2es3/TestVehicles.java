
/* Scrivere una classe Vehicle (veicolo) che prevede una targa, una marca e un modello.
La classe prevede anche una variabile booleana che descrive se il veicolo è guasto.
Aggiungere un costruttore opportuno e vari metodi get e set opportuni.

Scrivere la classi Car e Motocycle che estendono la classe Vehicle. La classe Car prevede una
stringa che ne descrive la tipologia (&quot;utilitaria&quot;,&quot;station wagon&quot;, &quot;SUV&quot;,....) mentre la classe
Motocycle prevede un numero che ne descrive la cilindrata (50, 125, ....).
Per testare le classi, scrivere un programma TestVehicles che crea un array inizializzato con veicoli
delle varie tipologie. Alcuni dei veicoli inseriti nell’array dovranno diventare guasti. Il programma
deve stampare la lista delle targhe dei veicoli guasti. */

package esercitazione2es3;

public class TestVehicles {

	public static void main(String[] args) {
		
		Vehicle lista[] = new Vehicle[5];
		lista[0] = new Car("abc","Fiat","Punto", false, "utilitaria");
		lista[1] = new Motocycle("fgh","yamaha","yama", false, 50);
		lista[2] = new Motocycle("abc","Fiat","Punto", false, 125);
		lista[3] = new Car("cde","Ford","Fiesta", false, "utilitaria");
		lista[4] = new Motocycle("abc","feee","keeee", false, 250);
		
		lista[1].setGuasto(true);
		lista[3].setGuasto(true);
		
		for(int i = 0; i < 5; i++) {
			if(lista[i].isGuasto()) {
				System.out.print("La targa e': " +lista[i].getTarga()+ "\n");
			}
		}
	}

}
