package esercitazione2punto3;

public class CalcoloPotenza implements Potenza {

	@Override
	public double cubo(double valore) {
		
		return valore *= valore * valore;
		
	}

	@Override
	public double quadrato(double valore) {
		
		return valore *= valore; 
		
	}
	
}
