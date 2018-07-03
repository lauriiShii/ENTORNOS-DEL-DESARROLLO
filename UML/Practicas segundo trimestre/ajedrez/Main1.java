package Ajedrez;

import Ajedrez.Ficha.Imagenes;

public class Main1 {

	public static void main(String[] args) {
		
		Ficha fichas[] = new Ficha[32];
		Tablero tablero = new Tablero(fichas);
		int i, j, recorreFichas = 0;
		boolean blanca;
		
		for(i=0; i<tablero.getCasillas().length; i++)
			for (j=0; j<tablero.getCasillas()[i].length; j++){
				if (i==0 || i==1)
					blanca = true;
				else
					blanca = false;
				
				if ((i == 0 && j == 0)||(i==0 && j==7)||(i==7 && j==0)||(i==7 && j==7))
					fichas[recorreFichas] = new Ficha(tablero.getCasillas()[i][j], tablero.getCasillas()[i][j], blanca, Imagenes.TORRE, Imagenes.TORRE.getLETRA());
				else if (i==1 || i == 6)
					fichas[recorreFichas] = new Ficha(tablero.getCasillas()[i][j], tablero.getCasillas()[i][j], blanca, Imagenes.PEON, Imagenes.PEON.getLETRA());
				else if ((i == 0 && j == 1)||(i==0 && j==6)||(i==7 && j==1)||(i==7 && j==6))
					fichas[recorreFichas] = new Ficha(tablero.getCasillas()[i][j], tablero.getCasillas()[i][j], blanca, Imagenes.CABALLO, Imagenes.CABALLO.getLETRA());
				else if ((i == 0 && j == 2)||(i==0 && j==5)||(i==7 && j==2)||(i==7 && j==5))
					fichas[recorreFichas] = new Ficha(tablero.getCasillas()[i][j], tablero.getCasillas()[i][j], blanca, Imagenes.ALFIL, Imagenes.ALFIL.getLETRA());
				else if ((i == 0 && j == 3)||(i==7 && j==4))
					fichas[recorreFichas] = new Ficha(tablero.getCasillas()[i][j], tablero.getCasillas()[i][j], blanca, Imagenes.REY, Imagenes.REY.getLETRA());
				else if ((i == 0 && j == 4)||(i==7 && j==3))
					fichas[recorreFichas] = new Ficha(tablero.getCasillas()[i][j], tablero.getCasillas()[i][j], blanca, Imagenes.REINA, Imagenes.REINA.getLETRA());
				
				if (i==0 || i==1 || i==7 || i==6)
					recorreFichas++;
			}
	}
}