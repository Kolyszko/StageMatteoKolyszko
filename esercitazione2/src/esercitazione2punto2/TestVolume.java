package esercitazione2punto2;

public class TestVolume {
	public static void main(String[] args) {
		
		Cilindro cilindro = new Cilindro("Matteo", 5.0, 7.0);
		cilindro.stampaVolume();
		
		Parallelepipedo para = new Parallelepipedo("Kolyszko", 5.0, 6.0);
		para.stampaVolume();
	}
}
