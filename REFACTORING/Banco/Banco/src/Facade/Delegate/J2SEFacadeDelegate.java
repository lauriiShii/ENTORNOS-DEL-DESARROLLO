package Facade.Delegate;
import Banco.Cuenta;

public interface J2SEFacadeDelegate {

	Cuenta CerrarCuenta (Cuenta cuenta);
	Cuenta CrearCuenta (double saldoInicial);
	Cuenta IngresarDinero (Cuenta cuenta, double ingreso);
	Cuenta TransferirDinero (Cuenta deaqui, Cuenta aaqui, double transferencia);
}
