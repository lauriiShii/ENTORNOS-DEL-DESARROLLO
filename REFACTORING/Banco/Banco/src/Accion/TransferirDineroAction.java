package Accion;
import Banco.Cuenta;
import Interfaz.Accion;

public class TransferirDineroAction implements Accion {
	
	Cuenta deaqui;
	Cuenta aaqui;
	double transferencia;
	
	public TransferirDineroAction(Cuenta deaqui, Cuenta aaqui,double transferencia){
		this.deaqui=deaqui;
		this.aaqui=aaqui;
		this.transferencia=transferencia;
	}
	public Object ejecutar() {
		deaqui.setSaldo(deaqui.getSaldo()-transferencia);
		aaqui.setSaldo(aaqui.getSaldo()+transferencia);
		return deaqui;
	}

}
