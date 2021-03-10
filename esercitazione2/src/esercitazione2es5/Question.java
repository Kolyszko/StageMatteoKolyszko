package esercitazione2es5;

import java.util.Scanner;

public class Question {
	
	private String domanda;
	private int punteggio;
	
	public Question(String domanda,int punteggio) {
		super();
		this.domanda = domanda;
		this.punteggio = punteggio;
	}
	
	
	
	public String getDomanda() {
		return domanda;
	}



	public void setDomanda(String domanda) {
		this.domanda = domanda;
	}

	public int getPunteggio() {
		return punteggio;
	}



	public void setPunteggio(int punteggio) {
		this.punteggio = punteggio;
	}



	public int ask(Question quest) {
		return quest.getPunteggio();
	}
	
}
