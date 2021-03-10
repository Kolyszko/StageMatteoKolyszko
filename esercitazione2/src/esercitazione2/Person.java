
/* Creare una classe di nome Person con le variabili di istanza: surname, name, tax code e city di tipo
stringa.
La classe deve contenere un costruttore di default che inizializzi le variabili di istanza con NULL;
un costruttore parametrico; i metodi set e get ed un metodo chiamato bornYear che a partire dal
codice fiscale ricavi e restituisca l&#39;anno di nascita di una persona.
Creare un&#39;applicazione Java che istanzi un oggetto della classe Person e ne visualizzi in seguito
nome, cognome ed anno di nascita.
Costruire una sottoclasse di Person, chiamata Stagista, che contiene 2 variabili di istanza entrambe
di tipo intero:
 numberOfPresence, che registra il numero di ore di presenza
 idNumber (numero identificativo).
La sottoclasse deve contenere un costruttore parametrico ed i metodi set e get.
Creare tre oggetti di tipo Stagista memorizzarli in un array e visualizzare lo Stagista più giovane. */

package esercitazione2;

public class Person {
	
	private String surname;
	private String name;
	private String taxCode;
	private String city;
	
	
	public Person() {
		super();
		this.surname = null;
		this.name = null;
		this.taxCode = null;
		this.city = null;
	}
	
	public Person(String surname, String name, String taxCode, String city) {
		super();
		this.surname = surname;
		this.name = name;
		this.taxCode = taxCode;
		this.city = city;
	}

	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int bornYear(String taxCode) {
		int anno = Integer.parseInt(taxCode.substring(6, 8));
		if(anno > 21) {
			return anno += 1900;
		}
			return anno += 2000;
	}
	@Override
	public String toString() {
		return "Person [surname=" + surname + ", name=" + name + ", taxCode=" + taxCode + ", city=" + city + "]";
	}
}
