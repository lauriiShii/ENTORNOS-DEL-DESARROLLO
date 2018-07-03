package Acciones;

import Personajes.Sanador;

public class CrearSanadorAction implements Action{

	private String nombre;
	private int fuerzaAtaque, fuerzaDefensa;
	
	public CrearSanadorAction(String nombre, int fuerzaAtaque, int fuerzaDefensa){
		this.nombre = nombre;
		this.fuerzaAtaque = fuerzaAtaque;
		this.fuerzaDefensa = fuerzaDefensa;
	}
	
	public Object execute() {
		return new Sanador(nombre, fuerzaAtaque, fuerzaDefensa);
	}
}
