package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;


public class MainApp {

	static Reina reina;

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
				System.out.println("No se puede mover una reina no creada");
			} else {
				mover();
				mostrarReina();
			}
			break;
		case 0:
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
			throw new NullPointerException("Reina inexistente");
		} else {
			System.out.println(reina.toString());
		}
	}

	public static void main(String[] args) {
		int opcion;
		do {
			Consola.mostrarMenu();
			opcion = Consola.elegirOpcionMenu();
			ejecutarOpcion(opcion);

		} while (opcion != 3);
	}
}

