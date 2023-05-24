package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class Undo {

	private static Undo instance;
	private List<String> ordres;

	private Undo() {
		ordres = new ArrayList<>();
	}

	public static Undo getInstance() {
		if (instance == null) {
			instance = new Undo();
		}
		return instance;
	}

	public void afegirOrdres(String ordre) {
		ordres.add(ordre);
	}

	public void eliminarOrdres(String ordre) {
		ordres.remove(ordre);
	}

	public void llistaOrdres() {
		for (String ordre : ordres) {
			System.out.println(ordre);
		}
	}

}
