
/* Scrivere la classe Question i cui oggetti rappresentano domande di esami orali. Ogni quesito si
compone di una domanda, di una risposta corretta e di un punteggio, e mette a disposizione un
metodo ask() che stampa la domanda, legge la risposta dell’utente e restituisce il punteggio
conseguito (0 se la risposta dell’utente `e sbagliata).
Scrivere la classe QuestionYesNo che estende la classe Question in modo da rappresentare
domande a cui possa essere risposto solo si o no. Sovrascrivere il metodo ask() in modo da garantire
che l’utente risponda si o no (prima che venga restituito il punteggio conseguito).
Scrivere la classe NumericQuestion che estende la classe Question in modo da rappresentare
domande a cui possa essere risposto solo con un valore intero. Sovrascrivere il metodo ask() in
modo da garantire che l’utente risponda con un valore intero (prima che venga restituito il
punteggio conseguito).
Scrivere la classe MultipleQuestion che estende la classe NumericQuestion in modo da
rappresentare domande che offrono un certo numero di opzioni (prefissato) e alle quali possa essere
risposto solo con un valore intero positivo minore o uguale al numero di opzioni disponibili.
Sovrascrivere il metodo ask() in modo da garantire che l’utente risponda con un valore consentito
(prima che venga restituito il punteggio conseguito).
Scrivere il programma TestQuestion che riempie un array con quesiti di diversa natura e poi simula
un’interrogazione calcolando il punteggio totale ottenuto. A scelta, l’interrogazione può essere fatta
estraendo in modo casuale tre quesiti dall’array. */

package esercitazione2es5;

public class TestQuestion {
	public static void main(String[] args) {
		
		Question listaDomande[] = new Question[6];
		listaDomande[0] = new QuestionYesNo("La terra e' piatta? ", 10, "no");
		listaDomande[1] = new NumericQuestion("Quanto fa 5x3? ", 5, 15);
		listaDomande[2] = new MultipleQuestion("Chi allena il milan? 1) Conte 2) Pioli 3) Pirlo ", 23, 2, 3);
		listaDomande[3] = new QuestionYesNo("La terra e' tonda? ", 15, "si");
		listaDomande[4] = new NumericQuestion("In quale anno e' stata scoperta l'america? ", 20, 1492);
		listaDomande[5] = new MultipleQuestion("Chi allena l'inter? 1) Conte 2) Pioli 3) Pirlo ", 19, 1, 3);
		int punteggio = 0;
			
		for(int i = 0; i < 3; i++) {
			int random = (int)((int)(Math.random() * 5));
			if(listaDomande[random] instanceof QuestionYesNo) {
				QuestionYesNo domanda = (QuestionYesNo) listaDomande[random];
				punteggio += domanda.ask(domanda);
			}else if(listaDomande[random] instanceof NumericQuestion) {
				NumericQuestion domanda = (NumericQuestion) listaDomande[random];
				punteggio += domanda.ask(domanda);
			}else {
				MultipleQuestion domanda = (MultipleQuestion) listaDomande[random];  
				punteggio += domanda.ask(domanda);
			}
		}
		System.out.println("Il tuo punteggio e: " +punteggio);
	}
}
