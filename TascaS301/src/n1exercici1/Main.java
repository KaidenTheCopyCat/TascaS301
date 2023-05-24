package n1exercici1;

public class Main {

	public static void main(String[] args) {

		Undo undo = Undo.getInstance();
		undo.afegirOrdres("Ordre 1");
		undo.afegirOrdres("Ordre 2");
		undo.afegirOrdres("Ordre 3");

		System.out.println("Llista d'ordres:");
		undo.llistaOrdres();

		undo.eliminarOrdres("Ordre 2");

		System.out.println("Llista d'ordres actualitzada:");
		undo.llistaOrdres();

	}

}
