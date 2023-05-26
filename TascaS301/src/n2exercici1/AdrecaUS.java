package n2exercici1;

public class AdrecaUS extends Adreca {

	public AdrecaUS(String lineaAdreca, String ciutat, String pais) {
		super(lineaAdreca, ciutat, pais);

	}

	@Override
	public String getDetallsAdreca() {
		return "Adreça US: " + lineaAdreca + ", " + ciutat + ", " + pais;
	}

}
