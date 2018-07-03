package Arena;

import Personajes.Personaje;

public class Arena {

	public Personaje combate(Personaje heroe, Personaje villano){
		while (heroe.getVida()>0 && villano.getVida()>0){
		
			heroe.atacar(villano);
			if (villano.getVida()>0)
				villano.atacar(heroe);
			
			/* For testing purposes */
			System.out.println("Heroe:"+heroe.toString());
			System.out.println("Villano:"+villano.toString());	
		}	
		if (heroe.getVida()>villano.getVida())
			return heroe;
		
		return villano;
			
		}
	
	}
	
	

