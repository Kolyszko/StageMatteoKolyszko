package esercitazione2punto1;

public class NonAlimentare extends Prodotto {
	
	private String materiale;

	public NonAlimentare(int codiceBarre, String descrizioneProdotto, double prezzo, String materiale) {
		super(codiceBarre, descrizioneProdotto, prezzo);
		this.materiale = materiale;
	}

	public String getMateriale() {
		return materiale;
	}

	public void setMateriale(String materiale) {
		this.materiale = materiale;
	}
	
	public void applicaSconto() {
		if(this.getMateriale().equalsIgnoreCase("carta") || this.getMateriale().equalsIgnoreCase("vetro") 
			|| this.getMateriale().equalsIgnoreCase("plastica"));{
				
			this.setPrezzo(this.getPrezzo() - this.getPrezzo() * 0.10);
		}
	}

}
