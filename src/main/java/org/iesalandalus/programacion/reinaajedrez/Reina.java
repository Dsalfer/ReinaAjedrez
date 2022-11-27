package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

public class Reina {

	private Color color;
	private Posicion posicion;

	public Reina() {
		setColor(Color.BLANCO);
		this.posicion = new Posicion(1, 'd');
	}
	public Reina(Color color) {
		setColor(color);

		switch (color) {
		case BLANCO:
			setPosicion(new Posicion(1, 'd'));
			break;
		case NEGRO:
			setPosicion(new Posicion(8, 'd'));
			break;
		}
	}
	public Color getColor() {
		return color;
	}

	private void setColor(Color color) {
		if (color == null) {
			throw new NullPointerException("Debe ser un color válido");
		}
		this.color = color;
	}

}