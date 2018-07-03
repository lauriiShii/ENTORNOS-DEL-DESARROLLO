package Personajes;
import java.util.Random;

import Constantes.ConstantesMiniRPG;

public class Sanador extends Personaje{

	public Sanador(String nombre, int fuerzaAtaque, int fuerzaDefensa){
		super(nombre, fuerzaAtaque, fuerzaDefensa);
	
	}
	
	
	//El sanador ataca la cuarta parte de su fuerza menos la defensa de su enemigo
	public Personaje atacar(Personaje enemigo){
		Random aleatorio = new Random();
		int destreza = (aleatorio.nextInt(20) + 1);
		
		//Si la destreza es igual o mayor que la probalidad de destreza (10) hace el ataque
		//Sino no acierta el ataque.
		if(destreza < getProbalidadDestreza())
			if ((getFuerzaAtaque()/4 > enemigo.getFuerzaDefensa())){
				enemigo.setVida(enemigo.getVida()-(getFuerzaAtaque()/4-enemigo.getFuerzaDefensa()));
				this.setVida((getFuerzaAtaque()/4-enemigo.getFuerzaDefensa())*ConstantesMiniRPG.REGENERACION_VIDA/100);
			}
		
		return enemigo;	
	}
	
	public Personaje sanar(Personaje herido){
		herido.setVida(ConstantesMiniRPG.VIDA);
		return herido;
		
	}
	
	public String toString() {
		return String.format(super.toString());
	}
}
