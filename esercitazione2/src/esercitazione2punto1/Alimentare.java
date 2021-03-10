package esercitazione2punto1;

import java.util.Date;

public class Alimentare extends Prodotto {
	
	private Date dataDiScadenza;

	public Alimentare(int codiceBarre, String descrizioneProdotto, double prezzo, Date dataDiScadenza) {
		super(codiceBarre, descrizioneProdotto, prezzo);
		this.dataDiScadenza = dataDiScadenza;
	}

	public Date getDataDiScadenza() {
		return dataDiScadenza;
	}

	public void setDataDiScadenza(Date dataDiScadenza) {
		this.dataDiScadenza = dataDiScadenza;
	}
	
	public void applicaSconto() {
		// non ho trovato il metodo getDifference nella classe Date
		this.setPrezzo(this.getPrezzo() - this.getPrezzo() * 0.20);
	}
	
}
