/* Realizzare un programma che sia in grado di valutare il volume di oggetti tridimensionali come cilindri e
parallelepipedi basandosi sul valore della loro area e dell&#39;altezza. Delegare i metodi comuni, come il calcolo
e la stampa del volume ad una classe astratta. */

package esercitazione2punto2;

public abstract class VolumeOggetti {
	
	private String nomeOggetto;
	private double area;
	private double altezza;

	public VolumeOggetti(String nomeOggetto, double area, double altezza) {
		super();
		this.nomeOggetto = nomeOggetto;
		this.area = area;
		this.altezza = altezza;
	}
	
	public String getNomeOggetto() {
		return nomeOggetto;
	}



	public void setNomeOggetto(String nomeOggetto) {
		this.nomeOggetto = nomeOggetto;
	}



	public double getArea() {
		return area;
	}



	public void setArea(double area) {
		this.area = area;
	}



	public double getAltezza() {
		return altezza;
	}



	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double calcolaVolume() {
		return this.getAltezza() * this.getArea();
	}
	public void stampaVolume() {
		System.out.print("Il volume dell'oggetto e': " +calcolaVolume()+ "\n");
	}
}
