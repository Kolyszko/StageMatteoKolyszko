package esercitazione2punto1es2;

public class Filmato extends ElementoMultimediale{
	
	private int volume;
	private int luminosita;
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getLuminosita() {
		return luminosita;
	}
	public void setLuminosita(int luminosita) {
		this.luminosita = luminosita;
	}
	
	public void weaker() {
		this.setVolume (this.getVolume() - 1);
	}
	
	public void louder() {
		this.setVolume(this.getVolume() + 1);
	}
	
	public void brighter() {
		this.setLuminosita (this.getLuminosita() + 1);
	}
	
	public void darker() {
		this.setLuminosita(this.getLuminosita() - 1);
	}
	
	public void play() {
		
		String sequenzaVolume = "";
		String sequenzaLuminosita = "";
		
		for(int i = 0; i < this.getVolume(); i++) {
			sequenzaVolume += "!";
		}
		for(int i = 0; i < this.getLuminosita(); i++) {
			sequenzaLuminosita += "*";
		}
		for(int i = 0; i < this.getDurata(); i++) {
			System.out.print(this.getTitolo().concat(sequenzaVolume).concat(sequenzaLuminosita) +"\n");
		}
	}
}
