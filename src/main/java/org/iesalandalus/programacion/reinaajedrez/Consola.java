package org.iesalandalus.programacion.reinaajedrez;
public class Consola {

	private Consola() {
	}
	      
	public void mostrarMenu()
    {
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Menú para crear y/o mover a la reina");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("1.- Crear Reina.");
        System.out.println("2.- Crear reina eligiendo color.");
        System.out.println("3.- Mover.");
        System.out.println("0.- Cerrar.");
        System.out.println("");
    }
}

