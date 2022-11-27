package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

public class Reina {

	private Color color;
	private Posicion posicion;

	public Reina() {
		setColor(Color.BLANCO);
		this.posicion = new Posicion(1, 'B');
	}
	public void Reina(Color color) {
		setColor(color);

		switch (color) {
		case BLANCO:
			setPosicion(new Posicion(1, 'B'));
			break;
		case NEGRO:
			setPosicion(new Posicion(8, 'B'));
			break;
		}
	}
}