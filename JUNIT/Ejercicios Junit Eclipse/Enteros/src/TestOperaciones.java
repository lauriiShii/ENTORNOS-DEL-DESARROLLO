import static org.junit.Assert.*;

import org.junit.Test;


public class TestOperaciones {

	@Test
	//Test del metodo anterior de la clase operaciones
	public void TestAnterior() {
		Operaciones o =new Operaciones();
		assertEquals(o.anterior(3),2);
		assertEquals(o.anterior(1),0);
		assertEquals(o.anterior(0),-1);
	}
	
	@Test
	//Test para el metodo siguiente de la clase operaciones
	public void TestSiguiente() {
		Operaciones o =new Operaciones();
		assertEquals(o.siguiente(4),5);

	}
	
	@Test
	//Test para el metodo siguiente de la clase operaciones
	public void TestFactoriar() {
		Operaciones o =new Operaciones();
		assertEquals(o.factorial(5),120);
		assertEquals(o.factorial(3),6);
	}
	
	@Test
	//Test para el metodo esPrimo de la clase operaciones
	public void TestEsPrimo(){
		Operaciones o =new Operaciones();
		assertTrue(o.esPrimo(2),2);
		
	}

	private void assertTrue(boolean esPrimo, int i) {
		// TODO Auto-generated method stub
		
	}

}
