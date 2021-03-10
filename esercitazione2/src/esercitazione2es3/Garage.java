package esercitazione2es3;

public class Garage {
	

	public int repair(Car car) {
		
		int prezzoRiparazione = 50; 
		
		if(car.isGuasto()) {
			car.setGuasto(false);
			prezzoRiparazione += 100;
		}
		
		switch(car.getTipologia()) {
		
			case "Utilitaria":
				prezzoRiparazione += 50;
				break;
			case "Station wagon":
				prezzoRiparazione += 100;
				break;
			case "SUV":
				prezzoRiparazione += 150;
				break;
			case "Lusso":
				prezzoRiparazione += 300;
				break;
		}
		return prezzoRiparazione;
	}
	
public int repair(Motocycle moto) {
		
		int prezzoRiparazione = 30; 
		
		if(moto.isGuasto()) {
			moto.setGuasto(false);
			prezzoRiparazione += 100;
		}
		
		switch(moto.getCilindrata()) {
		
			case 50:
				prezzoRiparazione += 50;
				break;
			case 125:
				prezzoRiparazione += 100;
				break;
			case 250:
				prezzoRiparazione += 150;
				break;
			case 500:
				prezzoRiparazione += 300;
				break;
		}
		return prezzoRiparazione;
	}
}
