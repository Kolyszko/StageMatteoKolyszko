package esercitazione2punto5;

public class TestOperazione {
	public static void main(String[] args) {
		
		Opera opera = new Mul(5.0, 3.0);
		Opera opera1 = new Add (5.0, 3.0);
		Opera opera2 = new Div(5.0, 3.0);
		
		opera.stampa();
		opera1.stampa();
		opera2.stampa();
	}
	
}
