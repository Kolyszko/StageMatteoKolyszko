package esercitazione2;

public class Employee extends Person{
	private int annoAssunzione;
	private int stipendio;
	
	public Employee(String surname, String name, String taxCode, String city, int annoAssunzione, int stipendio) {
		super(surname, name, taxCode, city);
		this.annoAssunzione = annoAssunzione;
		this.stipendio = stipendio;
	}

	public int getAnnoAssunzione() {
		return annoAssunzione;
	}

	public void setAnnoAssunzione(int annoAssunzione) {
		this.annoAssunzione = annoAssunzione;
	}

	public int getStipendio() {
		return stipendio;
	}

	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}
	
	public boolean gainMore(Employee impiegato) {
		if(this.stipendio < impiegato.stipendio) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Employee [surname = " + getSurname() + ", name = " + getName() + ", taxCode = " + getTaxCode() +
				", city = " + getCity() +" annoAssunzione = " + annoAssunzione + ", stipendio = " + stipendio +"]";
	}

	
	

}
