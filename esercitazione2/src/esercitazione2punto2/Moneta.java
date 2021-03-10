package esercitazione2punto2;

public class Moneta extends Lancio {

	@Override
	public int lancioOggetto() {
		// TODO Auto-generated method stub
		return (int)(Math.random() * 3);
	}
	
}
