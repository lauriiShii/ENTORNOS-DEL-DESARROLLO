package Accion;
import Banco.Cuenta;
import Interfaz.Accion;

public class CrearCuentaAction implements Accion{

	double saldoInicial;
	Cuenta micuenta=new Cuenta ();
	
	public CrearCuentaAction(double saldoInicial){
		this.saldoInicial=saldoInicial;
	}
	
	public Object ejecutar() {
		micuenta.setSaldo(saldoInicial);
		return micuenta;
	}
}
