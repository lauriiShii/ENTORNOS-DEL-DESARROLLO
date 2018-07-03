package Fachada;

import Personajes.Guerrero;
import Personajes.Mago;
import Personajes.Personaje;
import Personajes.Sanador;

public interface MiniRPGFacadeDelegate {
	public Guerrero crearGuerrero(String nombre, int fuerzaAtaque, int fuerzaDefensa);
	public Mago crearMago(String nombre, int fuerzaAtaque, int fuerzaDefensa);
	public Sanador crearSanador(String nombre, int fuerzaAtaque, int fuerzaDefensa);
	public Personaje combatir(Personaje heroe, Personaje villano);
}
