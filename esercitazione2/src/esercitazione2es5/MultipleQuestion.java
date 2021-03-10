package esercitazione2es5;

import java.util.Scanner;

public class MultipleQuestion extends NumericQuestion{

	private int rangeDiValori;
	
	public MultipleQuestion(String domanda, int punteggio, int rispostaCorretta, int rangeDiValori) {
		super(domanda, punteggio, rispostaCorretta);
		this.rangeDiValori = rangeDiValori;
	}

	public int getRangeDiValori() {
		return rangeDiValori;
	}

	public void setRangeDiValori(int rangeDiValori) {
		this.rangeDiValori = rangeDiValori;
	}

	public int ask(MultipleQuestion quest) {
		
		System.out.print(quest.getDomanda()+"\n");
		Scanner in = new Scanner(System.in);
		int risposta = 0;
		
		do {
			System.out.print("Inserisci la risposta: ");
			risposta = in.nextInt();
			if(risposta != (int)risposta) {      //Restituisce errore a prescindere non so come fare 
				System.out.print("Puoi solo inserire numeri interi \n");
			}
			if((risposta < 1 || risposta > quest.getRangeDiValori())) {   // Non funziona il controllo non capisco il perche'
				System.out.print("Puoi inserire solo i valori compresi nel range /n");
			}
		} while(risposta != (int)risposta && (risposta < 1 || risposta > quest.getRangeDiValori()));
		
		if(quest.getRispostaCorretta() == risposta) {
			System.out.print("Risposta coretta! \n");
			return quest.getPunteggio();
		}
		return 0;
	}
}
