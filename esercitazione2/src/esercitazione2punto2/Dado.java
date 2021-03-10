package esercitazione2punto2;

public class Dado extends Lancio {

	@Override
	public int lancioOggetto() {
		
		return (int)(Math.random() * 7);
		
	}
	
}
