package esercitazione2es5;

import java.util.Scanner;

public class NumericQuestion extends Question {
	
	private int rispostaCorretta;

	public NumericQuestion(String domanda, int punteggio, int rispostaCorretta) {
		super(domanda, punteggio);
		this.rispostaCorretta = rispostaCorretta;
	}

	public int getRispostaCorretta() {
		return rispostaCorretta;
	}

	public void setRispostaCorretta(int rispostaCorretta) {
		this.rispostaCorretta = rispostaCorretta;
	}
	
	public int ask(NumericQuestion quest) {
		System.out.print(quest.getDomanda()+"\n");
		Scanner in = new Scanner(System.in);
		int risposta;
		
		do {
			System.out.print("Inserisci la risposta: ");
			risposta = in.nextInt();
			if(risposta != (int)risposta) {
				System.out.print("Puoi solo inserire numeri interi");
			}
		} while(risposta != (int)risposta);
		
		if(quest.getRispostaCorretta() == risposta) {
			System.out.print("Risposta coretta! \n");
			return quest.getPunteggio();
		}
		return 0;
	}
}
