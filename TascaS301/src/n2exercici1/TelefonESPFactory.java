package n2exercici1;

public class TelefonESPFactory implements TelefonFactory{

	@Override
	public Telefon creaTelefon(String numeroTelefon) {
		// TODO Auto-generated method stub
		return new TelefonESP(numeroTelefon);
	}

}
