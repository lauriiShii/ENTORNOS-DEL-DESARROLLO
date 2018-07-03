package Ajedrez;

public class Ficha {

	public enum Imagenes {
		CABALLO('C'), ALFIL('A'), TORRE('T'), PEON('P'), REY('K'), REINA('Q');
		public final char LETRA;
		Imagenes(char letra){
			LETRA = letra;
		}
		public char getLETRA(){
			return LETRA;
		}
	}
	
	//private float altura;
	//private float anchura;
	private Posicion posicionInicial;
	private Posicion posicionActual;
	private boolean esBlanca;
	private Imagenes imagen;
	private char letra;
	
	public Ficha(Posicion posicionInicial, /*float altura, float anchura,*/Posicion posicionActual, boolean esBlanca, Imagenes imagen, char letra){
		this.esBlanca = esBlanca;
		this.posicionActual = posicionActual;
		this.posicionInicial = posicionInicial;
		//this.anchura = anchura;
		//this.altura = altura;
		this.imagen = imagen;
		this.letra = letra;
	}
	public void calcularMovLegales(Tablero tablero){
		switch(imagen){
		case PEON:
			if (esBlanca)
				
			break;
			
		case ALFIL:
			break;
			
		case REY:
			break;
			
		case REINA:
			break;
			
		case CABALLO:
			break;
			
		case TORRE:
			break;
		}
	}
	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public Posicion getPosicionInicial() {
		return posicionInicial;
	}
	/*public float getAltura() {
		return altura;
	}
	public float getAnchura() {
		return anchura;
	}*/
	public Posicion getPosicionActual() {
		return posicionActual;
	}
	public void setPosicionActual(Posicion posicionActual) {
		this.posicionActual = posicionActual;
	}
	public boolean isEsBlanca() {
		return esBlanca;
	}
	public void setEsBlanca(boolean esBlanca) {
		this.esBlanca = esBlanca;
	}
	public Imagenes getImagen() {
		return imagen;
	}
	public void setImagen(Imagenes imagen) {
		this.imagen = imagen;
	}
}
