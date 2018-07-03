import static org.junit.Assert.*;

import org.junit.Test;


public class TestMasOperaciones {

	@Test
	public void testEsPar() {
		MasOperaciones o =new MasOperaciones();
		assertTrue(o.esPar(2));
		assertTrue(o.esPar(3));
		
	}
	
	@Test
	public void testPotencia() {
		MasOperaciones o =new MasOperaciones();
		assertEquals(o.potencia(2, 0),1);
		assertEquals(o.potencia(2, 1),2);
		
	}
}
