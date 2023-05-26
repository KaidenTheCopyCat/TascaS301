package n2exercici1;

public class AdrecaESPFactory implements AdrecaFactory{

	@Override
	public Adreca creaAdreca(String lineaAdreca, String ciutat, String pais) {
		// TODO Auto-generated method stub
		return new AdrecaESP(lineaAdreca, ciutat, pais);
	}

}
