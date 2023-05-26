package n2exercici1;

public class AdrecaUSFactory implements AdrecaFactory{

	@Override
	public Adreca creaAdreca(String lineaAdreca, String ciutat, String pais) {
		return new AdrecaUS(lineaAdreca, ciutat, pais);
	}

}
