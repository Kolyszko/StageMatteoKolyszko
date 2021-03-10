package esercitazione2es5;

import java.util.Scanner;

public class QuestionYesNo extends Question {

	private String rispostaCorretta;
	
	public QuestionYesNo(String domanda, int punteggio, String rispostaCorretta) {
		super(domanda, punteggio);
		this.rispostaCorretta = rispostaCorretta;
	}

	public int ask(QuestionYesNo quest) {
		System.out.print(quest.getDomanda());
		Scanner in = new Scanner(System.in);
		String risposta;
			do {
				System.out.print("[si/no] \n");
				System.out.print("Inserisci la risposta: ");
				risposta = in.next();
				if(!(risposta.equalsIgnoreCase("si") || risposta.equalsIgnoreCase("no"))) {
					System.out.print("Puoi inserire solo riposte con 'si' e 'no' \n");
				}
			} while(!(risposta.equalsIgnoreCase("si") || risposta.equalsIgnoreCase("no")));
			
			if(quest.getRispostaCorretta().equals(risposta)) {
				System.out.print("Risposta coretta! \n");
				return quest.getPunteggio();
			}
		
		return 0;
	}

	public String getRispostaCorretta() {
		return rispostaCorretta;
	}

	public void setRispostaCorretta(String rispostaCorretta) {
		this.rispostaCorretta = rispostaCorretta;
	}
	
}
