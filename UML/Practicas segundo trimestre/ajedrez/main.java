package Ajedrez;

import Ajedrez.Ficha.Imagenes;

public class main {

	public static void main(String[] args) {

		Posicion posIn = new Posicion(0, 0);
		Posicion posAc = posIn;
		Posicion posn = new Posicion(5,5);
		Ficha torre = new Ficha(posIn, 2, 2, posAc, true, Imagenes.TORRE);
		Ficha fichitas[] = { torre };
		Tablero tablero = new Tablero(fichitas);
		int i, j;
		final char BLANCO = 'B', NEGRO = 'N', TORRE = 'T';
		
		torre.setPosicionActual(posn);
		
		for (i = 0; i < tablero.getDimensiones().length; i++){
			for (j = 0; j < tablero.getDimensiones()[i].length; j++) {
				// opcines de impresion
				// Alfil
				if ((i == torre.getPosicionActual().getPosX())
						&& (j == torre.getPosicionActual().getPosY()))
					System.out.print("T ");

				// Blanca
				else if ((j + i) % 2 == 0)
					System.out.print("B ");

				// Negra
				else
					System.out.print("N ");
			}
			System.out.println();
		}
	}
}