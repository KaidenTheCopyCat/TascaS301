package n2exercici1;

public abstract class Telefon {

	protected String numeroTelefon;

	public Telefon(String numeroTelefon) {
		this.numeroTelefon = numeroTelefon;
	}

	public abstract String getDetallsNumeroTelefon();

}
