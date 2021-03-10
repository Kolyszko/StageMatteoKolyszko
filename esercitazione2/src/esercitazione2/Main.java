package esercitazione2;

public class Main {

	public static void main(String[] args) {
		Person persona = new Person("Kolyszko", "Matteo", "klymtt98l01f205i", "Milano");
		System.out.print("Il nome della persona e': " +persona.getName()+ "\n");
		System.out.print("Il cognome della persona e': " +persona.getSurname()+"\n");
		System.out.print("L'anno di nascita della persona e': " +persona.bornYear(persona.getTaxCode())+"\n");
		
		Stagista stage[] = new Stagista[3];
		stage[0] = new Stagista("Kolyszko", "Matteo", "klymtt98l01f205i", "Milano", 0, 1234 );
		stage[1] = new Stagista("Molisco", "Katteo", "klymtt89l01f205i", "Milano", 0, 5678 );
		stage[2] = new Stagista("Polisco", "Patteo", "klymtt02l01f205i", "Milano", 0, 9101 );
		Stagista piuGiovane = stage[0];
		for(int i = 1; i < 3; i++) {
			if( piuGiovane.bornYear(piuGiovane.getTaxCode()) < stage[i].bornYear(stage[i].getTaxCode())) {
				piuGiovane = stage[i];
			}
		}
		System.out.print("Il piu giovane tra gli stagisti e': " +piuGiovane.getName()+ 
				" Che e' nato nel: " +piuGiovane.bornYear(piuGiovane.getTaxCode()));
	}

}
