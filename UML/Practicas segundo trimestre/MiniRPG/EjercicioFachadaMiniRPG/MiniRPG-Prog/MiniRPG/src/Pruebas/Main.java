package Pruebas;

import Personajes.Guerrero;
import Personajes.Mago;
import Personajes.Sanador;
import Fachada.MiniRPG_J2SEFacade;

public class Main {

	public static void main(String[] args) {

		/** PRUEBA DE LAS ACCIONES **/
		// Zeratul luchara contra lux
		MiniRPG_J2SEFacade fachada = new MiniRPG_J2SEFacade();
		String zeratul = "[Zeratul]: ", lux = "[Lux]: ", soraka = "[Soraka]: ", narrador = "[Narrador]: ";

		Guerrero Guerrero1 = fachada.crearGuerrero("Zeratul", 8, 2);
		System.out.println(zeratul
				+ "Lux eres una hija bastarda !! Vas a morir !!\n");
		Mago Mago1 = fachada.crearMago("Lux", 20, 6);
		System.out.println(lux
				+ "Zeratul !! Sera tu sangre la que corra en esta arena.\n");
		Sanador Sanador1 = fachada.crearSanador("Soraka", 10, 20);
		System.out.println(soraka
				+ "Lux, hermana mia. Nunca dejare que mueras !!\n");

		System.out.println(zeratul + "Te matare de un solo golpe !!\n\n");
		System.out.println("-- ¡¡ COMIENZA LA BATALLA !! --\n");
		System.out
				.println("\nVICTORIOSO:" + fachada.combatir(Mago1, Guerrero1) + "\n");

		// Si gana Lux, Soraka es fiel y la cura
		if (Mago1.getVida() > 0) {
			System.out.println(narrador+"Lux se encuentra gravemente herida.\n\n"+Mago1.toString()+"\n");
			System.out
					.println(soraka
							+ "Lux !! No te muevas, Deja que mi magia actue sobre tu ser !!\n\nREALIZANDO CURA\n");
			Sanador1.sanar(Mago1);
			System.out.println(lux + "Me siento tan vivo !!\n\nCURA REALIZADA\n\n"+ Mago1.toString()+"\n");
			System.out.println(lux + "Gracias Soraka. Te debo una !!");
		}
		// Si pierde Lux es traicionada y Soraka acepta un cambio de fidelidad
		// curando a Zeratul.
		else {
			System.out.println(narrador+"Zeratul se encuentra gravemente herida.\n\n"+Guerrero1.toString()+"\n");
			System.out.println(soraka + "Lux !! No !!\n");
			System.out
					.println(zeratul
							+ "Ya no hay marcha atras. He cumplido mi objetivo !!La bastarda ha muerto.\n");
			System.out
					.println(zeratul
							+ "Soraka, vendria bien una sanadora en mi grupo ... Tu ya no tienes más rumbo ya que tu hermana ha muerto. Propongo qe te unas a mi, sino tu tambien moriras.\n");
			System.out.println(soraka + "No tengo opción ...\n");
			System.out
					.println(soraka
							+ "Aqui tienes una muestra de mi fidelidad\n\nREALIZANDO CURA\n");
			Sanador1.sanar(Guerrero1);
			System.out.println(zeratul + "Me siento tan viva !!\n\nCURA REALIZADA\n\n"+ Guerrero1.toString()+"\n");
			System.out.println(zeratul + "Gracias Soraka. Te debo una !!");
		}
	}
}
