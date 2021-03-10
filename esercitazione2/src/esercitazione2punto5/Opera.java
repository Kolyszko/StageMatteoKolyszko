package esercitazione2punto5;

public abstract class Opera implements Operazione{
	
	private double operando1;
	private double operando2;
	
	public Opera(double operando1, double operando2) {
		super();
		this.operando1 = operando1;
		this.operando2 = operando2;
	}

	public double getOperando1() {
		return operando1;
	}

	public void setOperando1(double operando1) {
		this.operando1 = operando1;
	}

	public double getOperando2() {
		return operando2;
	}

	public void setOperando2(double operando2) {
		this.operando2 = operando2;
	}

	@Override
	public abstract double calcolo();
	public void stampa() {
		System.out.print("Il valore e': " +calcolo()+ "\n");
	}
	
}
