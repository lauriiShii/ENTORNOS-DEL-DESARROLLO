package Facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import Accion.*;
import Banco.Cuenta;
import Facade.Delegate.J2SEFacadeDelegate;
import Interfaz.Accion;
import Constantes.Constante;

public class J2SEFacade implements J2SEFacadeDelegate {

	@Override
	public Cuenta CerrarCuenta(Cuenta cuenta) {
		Accion accion=new CerrarCuentaAction(cuenta);
		return (Cuenta) accion.ejecutar();
	}

	public Cuenta CrearCuenta(double saldoInicial) {
		Accion accion= new CrearCuentaAction(saldoInicial);
		return (Cuenta) accion.ejecutar();
	}

	@Override
	public Cuenta IngresarDinero(Cuenta cuenta, double ingreso) {
		Accion accion=new IngresarDineroAction(cuenta, ingreso);
		return (Cuenta) accion.ejecutar();
	}

	@Override
	public Cuenta TransferirDinero(Cuenta deaqui, Cuenta aaqui,
			double transferencia) {
		Accion accion=new TransferirDineroAction(deaqui,aaqui,transferencia);
		return (Cuenta) accion.ejecutar();
	}

	public static void main(String[] args) {
		Cuenta cuenta1;
		Cuenta cuenta2;
		
		Properties prop = new Properties();
		InputStream is = null;

		/*
		 * Cargamos un fichero de configuración con el nombre de la clase de la
		 * fachada para cargarla dinámicamente
		 */
		try {
			is = new FileInputStream(Constante.FICHERO_CONFIGURACION);
			prop.load(is);
		} catch (IOException e) {
			System.out.println(e);
		}
		J2SEFacadeDelegate fachada = null;

		/*
		 * Obtenemmos el cargador de clases del sistema.
		 */
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		try {

			/*
			 * Cargamos la fachada en tiempo de ejecución y creamos una
			 * instancia.
			 */
			@SuppressWarnings("rawtypes")
			Class loadedClass = classLoader.loadClass(prop
					.getProperty(Constante.FACHADA_MODELO));
			fachada = (J2SEFacadeDelegate) loadedClass.newInstance();
		} catch (Exception e) {

			System.out.println(e);
		}
		cuenta1=fachada.CrearCuenta(0);
		cuenta2=fachada.CrearCuenta(100);
		fachada.TransferirDinero (cuenta2,cuenta1,20.0);
		fachada.IngresarDinero(cuenta1, 30.0);
		
		double cuent1=cuenta1.getSaldo();
		double cuent2=cuenta2.getSaldo();
		System.out.println("cuenta1: "+cuent1+"\nCuenta2: "+cuent2);
		
	}
}