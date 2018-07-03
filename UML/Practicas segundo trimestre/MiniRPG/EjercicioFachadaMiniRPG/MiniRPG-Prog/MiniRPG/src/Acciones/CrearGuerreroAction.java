package Acciones;

import Personajes.Guerrero;

public class CrearGuerreroAction implements Action{
	
		private String nombre;
		private int fuerzaAtaque, fuerzaDefensa;
		
	public CrearGuerreroAction(String nombre, int fuerzaAtaque, int fuerzaDefensa){
		this.nombre = nombre;
		this.fuerzaAtaque = fuerzaAtaque;
		this.fuerzaDefensa = fuerzaDefensa;
	}

	public Object execute() {
		return new Guerrero(nombre, fuerzaAtaque, fuerzaDefensa);
	}

}
