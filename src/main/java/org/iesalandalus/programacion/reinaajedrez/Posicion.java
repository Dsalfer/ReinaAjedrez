package org.iesalandalus.programacion.reinaajedrez;

import java.util.Objects;

public class Posicion {

	private int fila;
	private char columna;

	public Posicion(int fila, char columna){

		setColumna(columna);
		setFila(fila);
	
	}
	public Posicion(Posicion posicion) {
		if (posicion == null) {
			throw new NullPointerException("La posición debe ser correcta.");
		}
		setColumna(posicion.getColumna());
		setFila(posicion.getFila());	
		
}
	

	@Override
	public int hashCode() {
		return Objects.hash(columna, fila);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila;
	}

	@Override
	public String toString() {
		return "fila=" + fila + ", columna=" + columna;
	}

	public char getColumna() {
		return columna;
	}
	
	public int getFila() {
		return fila;
	}

	private void setFila(int fila) {
		if(fila < 1 || fila > 8) {
			throw new IllegalArgumentException ("Debes introducir una fila correcta.");
		}
		this.fila= fila;
	}
	
	private void setColumna(char columna) {
		if(columna < 'a'|| columna > 'h' ) {
			throw new IllegalArgumentException ("Debes introducir una columna correcta.");
		}
		this.columna = columna;
	}
	

}