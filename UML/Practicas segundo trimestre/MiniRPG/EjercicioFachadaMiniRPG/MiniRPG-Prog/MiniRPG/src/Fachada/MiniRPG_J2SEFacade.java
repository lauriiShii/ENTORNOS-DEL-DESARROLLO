package Fachada;

import Acciones.CombatirAction;
import Acciones.CrearGuerreroAction;
import Acciones.CrearMagoAction;
import Acciones.CrearSanadorAction;
import Personajes.Guerrero;
import Personajes.Mago;
import Personajes.Personaje;
import Personajes.Sanador;

public class MiniRPG_J2SEFacade implements MiniRPGFacadeDelegate{
	
	public Guerrero crearGuerrero(String nombre, int fuerzaAtaque, int fuerzaDefensa){
		return (Guerrero) new CrearGuerreroAction(nombre,fuerzaAtaque,fuerzaDefensa).execute();
	}
	public Mago crearMago(String nombre, int fuerzaAtaque, int fuerzaDefensa){
		return (Mago) new CrearMagoAction(nombre,fuerzaAtaque,fuerzaDefensa).execute();
	}
	public Sanador crearSanador(String nombre, int fuerzaAtaque, int fuerzaDefensa){
		return (Sanador) new CrearSanadorAction(nombre,fuerzaAtaque,fuerzaDefensa).execute();
	}
	public Personaje combatir(Personaje heroe, Personaje villano){
		return (Personaje) new CombatirAction(heroe, villano).execute();
	}
}
