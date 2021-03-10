package esercitazione2punto5;

public class Mul extends Opera implements Operazione{

	public Mul(double operando1, double operando2) {
		super(operando1, operando2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcolo() {
		
		return this.getOperando1() * this.getOperando2();
				
	}
	
}
