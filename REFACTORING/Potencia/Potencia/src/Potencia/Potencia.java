package Potencia;

import Interfaz.Multiplicable;

public class Potencia extends PotenciaSimple implements Multiplicable{

	public Potencia(int base, int exponente){
		this.base = base;
		this.exponente = exponente;
		
	}

	/**
	 * Multiplica potencias de la misma base
	 * @param potencia
	 * @throws NiIdeaDeMatesException 
	 */
	public Potencia multiplicar (Potencia potencia) throws NiIdeaDeMatesException{
		Potencia resultado= null;
		if (esBaseIgual(potencia)){
			resultado = new Potencia(this.getBase(), sumaExponente(potencia) );
		} else throw new NiIdeaDeMatesException("La base debe de ser igual");	
		return resultado;
			
	}
	
	/** Calcula la potencia de una potencia
	 * 
	 * @param exponente
	 * @return
	 */
	
	public Potencia potenciaDePotencia(int exponente){
		return new Potencia(this.getBase(), this.getExponente()*exponente);
	}
	
	public boolean esBaseIgual(Potencia potencia){
		boolean igual=false;
		
		if (this.getBase()==potencia.getBase())
			igual=true;
		return igual;
	}
	
	public int sumaExponente (Potencia potencia){
		return this.getExponente()+potencia.getExponente();
	}
	
	@Override
	public String toString() {
		return "Potencia [base=" + base + ", exponente=" + exponente + "]";
	}
	}
