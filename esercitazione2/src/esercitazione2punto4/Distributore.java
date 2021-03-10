
/* Scrivere un programma che sia in grado di istanziare degli oggetti &#39;distributori di benzina&#39; di cui sia nota la
città, il proprietario, la capacità e la benzina attualmente contenuta nel distributore. Dell&#39;oggetto
Distributore, deve essere possibile simulare le operazioni di erogazione del carburante e dei corrispondenti
incassi. Implementa una interfaccia Comparable, in modo da consentire il confronto tra 2 distributori in
base alla capacità del serbatoio di carburante. */

package esercitazione2punto4;

import java.util.Scanner;

public class Distributore implements Comparable {
	
	private String citta;
	private String proprietario;
	private int capacita;
	private int benzinaRimanente;
	private double incassi;
	
	public Distributore(String citta, String proprietario, int capacita, int benzinaRimanente, double incassi) {
		super();
		this.citta = citta;
		this.proprietario = proprietario;
		this.capacita = capacita;
		this.benzinaRimanente = benzinaRimanente;
		this.incassi = incassi;
		
		
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public int getCapacita() {
		return capacita;
	}

	public void setCapacita(int capacita) {
		this.capacita = capacita;
	}

	public int getBenzinaRimanente() {
		return benzinaRimanente;
	}

	public void setBenzinaRimanente(int benzinaRimanente) {
		this.benzinaRimanente = benzinaRimanente;
	}

	public double getIncassi() {
		return incassi;
	}

	public void setIncassi(double incassi) {
		this.incassi = incassi;
	}
	
	public void erogazioneBenzina() {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Quanti litri di benzina ti servono?\n");
		int benzinaRichiesta = in.nextInt();
		
		this.setBenzinaRimanente(this.getBenzinaRimanente() - benzinaRichiesta);
		this.setIncassi(benzinaRichiesta * 1.56);
	}

	@Override
	public Distributore confronto(Distributore dis2) {
		
		if (this.getCapacita() > dis2.getCapacita()) {
			return this;
		}
		return dis2;
		
	}
	
}
