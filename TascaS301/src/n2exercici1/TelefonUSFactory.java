package n2exercici1;

public class TelefonUSFactory implements TelefonFactory{

	@Override
	public Telefon creaTelefon(String numeroTelefon) {
		// TODO Auto-generated method stub
		return new TelefonUS(numeroTelefon);
	}

}
