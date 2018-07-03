package Acciones;

import Personajes.Personaje;
import Arena.Arena;

public class CombatirAction implements Action{
	
	Personaje villano;
	Personaje heroe;
	
	public CombatirAction(Personaje heroe, Personaje villano){
		this.heroe = heroe;
		this.villano = villano;
	}

	public Object execute() {
		return new Arena().combate(heroe, villano);
	}
	
}
