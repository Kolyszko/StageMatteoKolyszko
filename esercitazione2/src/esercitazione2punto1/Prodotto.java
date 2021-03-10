package esercitazione2punto1;

public class Prodotto {
		
		private int codiceBarre;
		private String descrizioneProdotto;
		private double prezzo;
		
		public Prodotto(int codiceBarre, String descrizioneProdotto, double prezzo) {
			super();
			this.codiceBarre = codiceBarre;
			this.descrizioneProdotto = descrizioneProdotto;
			this.prezzo = prezzo;
		}

		public int getCodiceBarre() {
			return codiceBarre;
		}

		public void setCodiceBarre(int codiceBarre) {
			this.codiceBarre = codiceBarre;
		}

		public String getDescrizioneProdotto() {
			return descrizioneProdotto;
		}

		public void setDescrizioneProdotto(String descrizioneProdotto) {
			this.descrizioneProdotto = descrizioneProdotto;
		}

		public double getPrezzo() {
			return prezzo;
		}

		public void setPrezzo(double prezzo) {
			this.prezzo = prezzo;
		}
		
		public void applicaSconto() {
			this.setPrezzo(this.getPrezzo() - this.getPrezzo() * 0.05);
		}
}
