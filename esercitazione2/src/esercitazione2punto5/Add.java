package esercitazione2punto5;

public class Add extends Opera implements Operazione {

	public Add(double operando1, double operando2) {
		super(operando1, operando2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcolo() {
		// TODO Auto-generated method stub
		return this.getOperando1() + this.getOperando2();
	}
	
}
