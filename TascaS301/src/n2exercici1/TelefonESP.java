package n2exercici1;

public class TelefonESP extends Telefon {
	
	public TelefonESP(String numeroTelefon) {
		super(numeroTelefon);
	}

	@Override
	public String getDetallsNumeroTelefon() {
		return "Numero telefon ESP: " + numeroTelefon;
	}

}
