package esercitazione2punto4;

public class TestDistributore {

	public static void main(String[] args) {
		
		Distributore distributore1 = new Distributore("Milano", "Matteo", 1500, 1500, 0);
		Distributore distributore2 = new Distributore("Bergamo", "Erling", 1320, 1200, 156);
		
		
		distributore1.erogazioneBenzina();
		System.out.print(distributore1.getBenzinaRimanente()+"\n");
		System.out.print(distributore1.getIncassi()+"\n");
		Distributore dis1 = distributore1.confronto(distributore2);
		System.out.print(dis1.getCitta()+" ");
		System.out.print(dis1.getProprietario()+" ");
		System.out.print(dis1.getCapacita()+" ");
		System.out.print(dis1.getBenzinaRimanente()+" ");
		System.out.print(dis1.getIncassi()+" ");
	}

}
