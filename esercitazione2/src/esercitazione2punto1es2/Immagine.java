package esercitazione2punto1es2;

public class Immagine extends ElementoMultimediale{
	
	private int luminosita;

	public int getLuminosita() {
		return luminosita;
	}

	public void setLuminosita(int luminosita) {
		this.luminosita = luminosita;
	}
	public void brighter() {
		this.setLuminosita (this.getLuminosita() + 1);
	}
	
	public void darker() {
		this.setLuminosita(this.getLuminosita() - 1);
	}
	
	public void show() {
			
			String sequenzaLuminosita = "";
			
			for(int i = 0; i < this.getLuminosita(); i++) {
				sequenzaLuminosita += "*";
			}
			System.out.print(this.getTitolo().concat(sequenzaLuminosita) +"\n");
	}
}
