
/* Scrivere una classe Garage che prevede solo un metodo repair() che utilizza veicoli (come definiti
nell’esercizio precedente). Tale metodo prende un veicolo come parametro, ne cambia (se
necessario) il valore della variabile booleana che descrive lo stato di guasto e restituisce come
risultato il prezzo dell’intervento. Il prezzo deve variare a seconda che il veicolo fosse guasto o
meno, e a seconda della tipologia di veicolo.
Per testare le classi, scrivere un programma TestGarage che crea un certo numero di veicoli e un
oggetto di tipo Garage, e usa il metodo repair() varie volte su oggetti diversi (guasti o meno)
stampando i prezzi ottenuti. */

package esercitazione2es3;

public class TestGarage {
	public static void main(String[] args) {
		
		Vehicle daRiparare[] = new Vehicle[7];
		Garage ripara = new Garage();
		
		daRiparare[0] = new Car("abc","Fiat","Punto", true, "Utilitaria");
		daRiparare[1] = new Car("cde","Ford","Fiesta", false, "Utilitaria");
		daRiparare[2] = new Car("klo","Ferrari","Fer", true, "Lusso");
		daRiparare[3] = new Car("pou","Lamborghini","Aventador", false, "Lusso");
		daRiparare[4] = new Motocycle("fgh","Yamaha","yama", false, 50);
		daRiparare[5] = new Motocycle("dha","Honda","hond", true, 125);
		daRiparare[6] = new Motocycle("dha","Ducati","Duca", false, 125);
		
		
		for(int i = 0; i < daRiparare.length; i++) {
			if(daRiparare[i] instanceof Car) {
				System.out.println("Il prezzo della ripazione per il veicolo: " 
						+daRiparare[i].getMarca()+ " e' " +ripara.repair((Car) daRiparare[i]));
			} else {
				System.out.println("Il prezzo della ripazione per il veicolo: " 
						+daRiparare[i].getMarca()+ " e' " +ripara.repair((Motocycle)daRiparare[i]));
			}
		}			
	}
}
