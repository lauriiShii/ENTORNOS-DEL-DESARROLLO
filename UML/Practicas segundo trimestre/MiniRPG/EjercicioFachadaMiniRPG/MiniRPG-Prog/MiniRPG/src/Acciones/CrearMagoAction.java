package Acciones;

import Personajes.Mago;

public class CrearMagoAction implements Action{

	private String nombre;
	private int fuerzaAtaque, fuerzaDefensa;
	
	public CrearMagoAction(String nombre, int fuerzaAtaque, int fuerzaDefensa){
		this.nombre = nombre;
		this.fuerzaAtaque = fuerzaAtaque;
		this.fuerzaDefensa = fuerzaDefensa;
	}
	
	public Object execute() {
		return new Mago(nombre, fuerzaAtaque, fuerzaDefensa);
	}
}
