package Interfaz;
import Potencia.NiIdeaDeMatesException;
import Potencia.Potencia;


public interface Multiplicable {

	abstract public Potencia multiplicar(Potencia potencia) throws NiIdeaDeMatesException;
}
