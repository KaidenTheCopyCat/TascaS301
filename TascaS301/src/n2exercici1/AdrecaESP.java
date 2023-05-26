package n2exercici1;

public class AdrecaESP extends Adreca {

	public AdrecaESP(String lineaAdreca, String ciutat, String pais) {
		super(lineaAdreca, ciutat, pais);

	}

	@Override
	public String getDetallsAdreca() {
		return "Adreça ESP: " + lineaAdreca + ", " + ciutat + ", " + pais;

	}

}
