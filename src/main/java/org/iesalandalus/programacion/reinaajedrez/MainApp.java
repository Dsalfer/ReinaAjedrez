package org.iesalandalus.programacion.reinaajedrez;



public class MainApp {
	public static void main(String[] args) {
		
	}
	private static void ejecutarOpcion(int opcion) {

		switch (opcion) {
		case 1:
			crearReinaPorDefecto();
			mostrarReina();
			break;
		case 2:
			crearReinaColor();
			mostrarReina();
			break;
		case 3:

			if (reina == null) {
				System.out.println("No es posible mover una reina que no existe.");
			} else {
				mover();
				mostrarReina();
			}
			break;
		case 4:
			Consola.despedirse();
			break;
		}
	}
	private static void crearReinaPorDefecto() {
		reina = new Reina();
	}

	private static void crearReinaColor() {
		reina = new Reina(Consola.elegirColor());
	}

	private static void mover() {
		Consola.mostrarMenuDirecciones();
		try {
			reina.mover(Consola.elegirDireccion(), Consola.elegirPasos());
		} catch (OperationNotSupportedException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void mostrarReina() {
		if (reina == null) {
			throw new NullPointerException("Reina no extiste");
		} else {
			System.out.println(reina.toString());
		}
	}

	
	
}


	
