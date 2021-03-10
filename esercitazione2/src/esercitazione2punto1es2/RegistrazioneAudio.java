package esercitazione2punto1es2;

public class RegistrazioneAudio extends ElementoMultimediale{
	
	private int volume;

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void weaker() {
		this.setVolume (this.getVolume() - 1);
	}
	
	public void louder() {
		this.setVolume(this.getVolume() + 1);
	}
	
	public void play() {
		
		String sequenza = "";
		
		for(int i = 0; i < this.getVolume(); i++) {
			sequenza += "!";
		}
		
		for(int i = 0; i < this.getDurata(); i++) {
			System.out.print(this.getTitolo().concat(sequenza) +"\n");
		}
	}
	
}
