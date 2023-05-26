package n2exercici1;

public class Main {

	public static void main(String[] args) {

		AdrecaFactory adrecaESPFactory = new AdrecaESPFactory();
		Adreca adrecaESP = adrecaESPFactory.creaAdreca("Carrer Major 1", "Barcelona", "España");
		adrecaESP.getDetallsAdreca();
		
		AdrecaFactory adrecaUSFactory = new AdrecaUSFactory();
		Adreca adrecaUS = adrecaUSFactory.creaAdreca("Oak Street 31", "Springfield", "United States");
		adrecaUS.getDetallsAdreca();
	
		TelefonFactory telefonESPFactory = new TelefonESPFactory();
		Telefon telefonESP = telefonESPFactory.creaTelefon("34 912 345 678 ");
		telefonESP.getDetallsNumeroTelefon();
		
		TelefonFactory telefonUSFactory = new TelefonUSFactory();
		Telefon telefonUS = telefonUSFactory.creaTelefon("+1 555-123-4567");
		telefonUS.getDetallsNumeroTelefon();

	}
}