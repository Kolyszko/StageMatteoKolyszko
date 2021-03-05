/* Scrivere un programma / metodo che date due sequenze di stringhe, ciascuna di 5 elementi, stampi il
messaggio &quot;OK&quot; se almeno una stringa della prima sequenza compare anche nella seconda, altrimenti sarà
stampato il messaggio &quot;KO&quot;. Qualora vengano trovate due stringhe uguali i confronti tra le sequenze
devono essere interrotti. */

package esercitazione1;

public class Es4Array {
	public static void main(String[] args) {
		
		String [] arr1 = {"ciao", "come", "va", "tutto","bene"};
		String [] arr2 = {"prova", "prova", "va", "prova","prova"};
		String [] arr3 = {"prova", "prova", "prova", "prova","prova"};
		int presente = 0;
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j< arr2.length;j++) {
				if(arr1[i] == arr2[j]) {
					presente++;
				}
			}
		}
		if(presente > 0) {
			System.out.println("OK");
		} else {
			System.out.println("KO");
		}
	}
}
