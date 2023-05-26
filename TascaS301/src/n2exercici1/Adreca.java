package n2exercici1;

public abstract class Adreca {
	protected String lineaAdreca;
	protected String ciutat;
	protected String pais;

	public Adreca(String lineaAdreca, String ciutat, String pais) {
		super();
		this.lineaAdreca = lineaAdreca;
		this.ciutat = ciutat;
		this.pais = pais;
	}

	public abstract String getDetallsAdreca();
}
