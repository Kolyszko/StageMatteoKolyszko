
/* Un Elemento Multimediale è una Immagine, un Filmato o una registrazione Audio identificato da
un titolo (una stringa non vuota).
Un elemento è riproducibile se ha una durata (un valore positivo di tipo int) e un metodo play().
Una registrazione Audio è riproducibile e ha associato anche un volume (un valore positivo di tipo
int) e i metodi weaker() e louder() per regolarlo.
Se riprodotta, ripete per un numero di volte pari alla durata la stampa del titolo concatenato a una
sequenza di punti esclamativi di lunghezza pari al volume (una stampa per riga).
Un Filmato è riproducibile e ha associato un volume regolabile analogo a quello delle registrazioni
audio e anche una luminosità (un valore positivo di tipo int) e i metodi brighter() e darker() per
regolarla.
Se riprodotta, ripete per un numero di volte pari alla durata la stampa del titolo concatenato a una
sequenza di punti esclamativi di lunghezza pari al volume e poi a una sequenza di asterischi di
lunghezza pari alla luminosità (una stampa per riga).
Una Immagine non è riproducibile, ma ha una luminosità regolabile analoga a quella dei filmati e
un metodo show() che stampa il titolo concatenato a una sequenza di asterischi di lunghezza pari
alla luminosità.

Eseguire un oggetto multimediale significa invocarne il metodo show() se è un&#39;immagine o il
metodo play() se è riproducibile.

Organizzare opportunamente con classi astratte, interfacce e classi concrete il codice di un lettore
multimediale che memorizza 5 elementi (creati con valori letti da tastiera) in un array e poi chiede
ripetutamente all&#39;utente quale oggetto eseguire (leggendo un intero da 1 a 5 oppure 0 per finire) e
dopo ogni esecuzione fornisce la possibilità di regolarne eventuali parametri (volume / luminosità). */

package esercitazione2punto1es2;

import java.util.Scanner;

public class TestMultimediale {
	public static void main(String[] args) {
	
		ElementoMultimediale lettore[] = new ElementoMultimediale[3]; 
		Scanner in = new Scanner(System.in);
		int sceltaDurata, sceltaVolume, sceltaLuminosita;
		
		for(int i = 0; i < lettore.length; i++) {
			
			System.out.print("Quale elemento vuoi inserire? 1)Registrazione Audio 2)Filmato 3)Immagine \n");
			String scelta;
			int scelta1 = in.nextInt();
			
			switch(scelta1) {
			
				case 1:
					lettore[i] = new RegistrazioneAudio();
					System.out.print("Inserisci il titolo \n");
					scelta = in.next();
					lettore[i].setTitolo(scelta);
					
					System.out.print("Inserisci la durata \n");
					sceltaDurata = in.nextInt();
					lettore[i].setDurata(sceltaDurata);
					
					System.out.print("Inserisci il volume \n");
					sceltaVolume = in.nextInt();
					((RegistrazioneAudio) lettore[i]).setVolume(sceltaVolume);
					break;
					
				case 2:
					lettore[i] = new Filmato();
					System.out.print("Inserisci il titolo \n");
					scelta = in.next();
					lettore[i].setTitolo(scelta);
					
					System.out.print("Inserisci la durata \n");
					sceltaDurata = in.nextInt();
					lettore[i].setDurata(sceltaDurata);
					
					System.out.print("Inserisci il volume \n");
					sceltaVolume = in.nextInt();
					((Filmato) lettore[i]).setVolume(sceltaVolume);
					
					System.out.print("Inserisci la luminosita \n");
					sceltaLuminosita = in.nextInt();
					((Filmato) lettore[i]).setLuminosita(sceltaLuminosita);
					break;
					
				case 3:
					lettore[i] = new Immagine();
					System.out.print("Inserisci il titolo \n");
					scelta = in.next();
					lettore[i].setTitolo(scelta);
					
					System.out.print("Inserisci la luminosita \n");
					sceltaLuminosita = in.nextInt();
					((Immagine) lettore[i]).setLuminosita(sceltaLuminosita);
					break;
			}
		}
		int sceltaOpzioni;
		String regolazione;
		
		do {
			System.out.print("Quale elemento vuoi eseguire?  Digita 0 per uscire \n");
			int j = 1;
			for(int i = 0; i < lettore.length; i++) {
				System.out.print(+j+ ")" +lettore[i].getTitolo() +"\n");
				j++;
			}
			
			sceltaOpzioni = in.nextInt();
			if(sceltaOpzioni == 0) break;
			if(lettore[sceltaOpzioni - 1] instanceof RegistrazioneAudio) {
				
				((RegistrazioneAudio)lettore[sceltaOpzioni - 1]).play();
				
				System.out.print("Vuoi alzare/abbassare il volume? \n");
				regolazione = in.next();
				if(regolazione.equalsIgnoreCase("alzare")) {
					
					((RegistrazioneAudio)lettore[sceltaOpzioni - 1]).louder();
					
				}else if(regolazione.equalsIgnoreCase("abbasare")){
					
					((RegistrazioneAudio)lettore[sceltaOpzioni - 1]).weaker();
				}
				
			}else if(lettore[sceltaOpzioni - 1] instanceof Filmato) {
				
				((Filmato)lettore[sceltaOpzioni - 1]).play();
				
				System.out.print("Vuoi alzare/abbassare il volume? \n");
				regolazione = in.next();
				if(regolazione.equalsIgnoreCase("alzare")) {
					
					((Filmato)lettore[sceltaOpzioni - 1]).louder();
					
				}else if(regolazione.equalsIgnoreCase("abbassare")){
					
					((Filmato)lettore[sceltaOpzioni - 1]).weaker();
				}
				
				System.out.print("Vuoi alzare/abbassare la luminosita? \n");
				regolazione = in.next();
				if(regolazione.equalsIgnoreCase("alzare")) {
					
					((Filmato)lettore[sceltaOpzioni - 1]).brighter();
					
				}else if(regolazione.equalsIgnoreCase("abbassare")) {
					
					((Filmato)lettore[sceltaOpzioni - 1]).darker();
					
				}
				
			}else {
				
				((Immagine)lettore[sceltaOpzioni - 1]).show();
				
				System.out.print("Vuoi alzare/abbassare la luminosita? \n");
				regolazione = in.next();
				if(regolazione.equalsIgnoreCase("alzare")) {
					
					((Immagine)lettore[sceltaOpzioni - 1]).brighter();
					
				}else if(regolazione.equalsIgnoreCase("abbassare")) {
					
					((Immagine)lettore[sceltaOpzioni - 1]).darker();
					
				}
			}
			
		}while(sceltaOpzioni != 0);
	}
}
