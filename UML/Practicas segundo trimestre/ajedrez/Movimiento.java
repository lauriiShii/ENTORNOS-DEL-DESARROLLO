package Ajedrez;

public class Movimiento {

	private Posicion posicionOrigen;
	private Posicion posicionDestino;
	private Tablero tablero;
	
	public void setPosicionOrigen(Ficha ficha){
		posicionOrigen = ficha.getPosicionActual();
	}
	public void setTablero(Tablero tablero){
		this.tablero = tablero;
	}
	public Posicion getPosicionOrigen() {
		return posicionOrigen;
	}
	public Posicion getPosicionDestino() {
		return posicionDestino;
	}
	public Tablero getTablero() {
		return tablero;
	}
}
