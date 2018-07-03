package Personajes;

import java.util.Random;

public class Mago extends Personaje{

	public Mago(String nombre, int fuerzaAtaque, int fuerzaDefensa){
		super(nombre, fuerzaAtaque, fuerzaDefensa);
	
	}
	
	
	//El mago ataca la mitad de su fuerza menos la defensa de su enemigo
	
	public Personaje atacar(Personaje enemigo){
		Random aleatorio = new Random();
		int destreza = (aleatorio.nextInt(20) + 1);
		
		//Si la destreza es igual o mayor que la probalidad de destreza hace el ataque
		//Sino no acierta el ataque.
		if(destreza < getProbalidadDestreza())
			if ((getFuerzaAtaque()/2 > enemigo.getFuerzaDefensa()))
				enemigo.setVida(enemigo.getVida()-(getFuerzaAtaque()/2-enemigo.getFuerzaDefensa()));
	
		return enemigo;	
	}
	
	public String toString() {
		return String.format(super.toString());
	}
}
