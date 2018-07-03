package Accion;
import Banco.Cuenta;
import Interfaz.Accion;

public class IngresarDineroAction implements Accion {

		Cuenta cuenta;
		double ingreso;
		
		public IngresarDineroAction(Cuenta cuenta,double ingreso){
			this.cuenta=cuenta;
			this.ingreso=ingreso;
		}

		public Object ejecutar() {
			cuenta.setSaldo(cuenta.getSaldo()+ingreso);
			return cuenta;
		}
		
}
