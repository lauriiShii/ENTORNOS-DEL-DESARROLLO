package Ajedrez;

public class Tablero {

	private Ficha fichas[];
	private Posicion casillas[][] = new Posicion[8][8];
	private Movimiento movimiento[];
	private int i, j;
	
	public Tablero (Ficha fichas[]){
		this.fichas = fichas;
		for (i = 0; i<casillas.length; i++)
			for (j = 0; j<casillas[i].length; j++)
				casillas[i][j] = new Posicion(i,j);
	}
	
	public Tablero(){
		for (i = 0; i<casillas.length; i++)
			for (j = 0; j<casillas[i].length; j++)
				casillas[i][j] = new Posicion(i,j);
	}

	public void imprimirTablero(){
		int i, j, k;
		boolean imprimir = true; 
		for (i = 0; i < getCasillas().length; i++){
			for (j = 0; j < getCasillas()[i].length; j++) {
				for (k = 0; k<fichas.length; k++){
					if ((i == fichas[k].getPosicionActual().getPosX()) && (j == fichas[k].getPosicionActual().getPosY())){
							System.out.printf("%c%s ", fichas[k].getLetra(), (fichas[k].isEsBlanca())?"b":"n");
							imprimir = false;
					}
				}
				if ((j + i) % 2 == 0 && imprimir)
					System.out.print("B  ");

				else if (imprimir)
					System.out.print("N  ");
				
				imprimir = true;
			}
			System.out.println();
		}
	}
	
	public Posicion[][] getCasillas() {
		return casillas;
	}

	public void setCasillas(Posicion[][] casillas) {
		this.casillas = casillas;
	}

	public void limpiarTablero(){
		for (i = 0; i<fichas.length; i++)
			fichas[i].setPosicionActual(fichas[i].getPosicionInicial());
	}

	public Ficha[] getFichas() {
		return fichas;
	}
	public void setFichas(Ficha[] fichas) {
		this.fichas = fichas;
	}
	
	public Movimiento[] getMovimiento() {
		return movimiento;
	}
	public void setMovimiento(Movimiento[] movimiento) {
		this.movimiento = movimiento;
	}
}
