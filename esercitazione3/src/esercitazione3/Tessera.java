package esercitazione3;

public class Tessera {
	
	private int codice;
	private double credito;
	
	public Tessera(int codice, double credito) {
		super();
		this.codice = codice;
		this.credito = credito;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public double leggiCredito() {
		return credito;
	}

	public void caricaTessera(double credito) {
		this.credito = credito;
	}

	@Override
	public String toString() {
		return "Tessera [Codice = " + codice + ", Credito = " + credito + "]";
	}
	
	
	
}
