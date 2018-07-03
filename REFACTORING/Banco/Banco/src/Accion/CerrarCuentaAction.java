package Accion;
import Banco.Cuenta;
import Interfaz.Accion;

public class CerrarCuentaAction implements Accion{
	
	Cuenta cuenta;
	
	public CerrarCuentaAction (Cuenta cuenta){
		cuenta=null;
	}
	
	public Object ejecutar() {
		
		return true;
	}
}
