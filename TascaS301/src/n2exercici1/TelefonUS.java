package n2exercici1;

public class TelefonUS extends Telefon {

	public TelefonUS(String numeroTelefon) {
		super(numeroTelefon);
	}

	@Override
	public String getDetallsNumeroTelefon() {
		return "Numero telefon US: " + numeroTelefon;
	}

}
