package Personajes;

import Constantes.ConstantesMiniRPG;

public abstract class Personaje {

	private int fuerzaAtaque;
	private int fuerzaDefensa;
	private String nombre;
	private int vida;
	private int probalidadDestreza;

	public Personaje(String nombre, int fuerzaAtaque, int fuerzaDefensa) {
		this.fuerzaAtaque = fuerzaAtaque;
		this.fuerzaDefensa = fuerzaDefensa;
		this.nombre = nombre;
		vida=ConstantesMiniRPG.VIDA;
		probalidadDestreza=ConstantesMiniRPG.PROBALIDAD_DESTREZA;

	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getFuerzaAtaque() {
		return fuerzaAtaque;
	}

	public void setFuerzaAtaque(int fuerzaAtaque) {
		this.fuerzaAtaque = fuerzaAtaque;
	}

	public int getFuerzaDefensa() {
		return fuerzaDefensa;
	}

	public void setFuerzaDefensa(int fuerzaDefensa) {
		this.fuerzaDefensa = fuerzaDefensa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProbalidadDestreza() {
		return probalidadDestreza;
	}
	
	public void setProbalidadDestreza (int probalidadDestreza) {
		this.probalidadDestreza = probalidadDestreza;
	}

	public String toString() {
		return "Nombre: " + nombre + " At:" + fuerzaAtaque + " Df:"
				+ fuerzaDefensa + " vida =" + vida;

	}

	public abstract Personaje atacar(Personaje enemigo);

}
