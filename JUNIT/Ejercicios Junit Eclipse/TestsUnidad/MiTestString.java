import static org.junit.Assert.*;

import org.junit.Test;


public class MiTestString {

	@Test
	public void testConcat() {
		
		String ies = "IES";
		String saladillo="Saladillo";
		String concatenada=ies.concat(saladillo);
		
		assertEquals("IESSaladillo", concatenada);

		
	}
	
	@Test
	public void  testOperadorSuma(){
		int a= 3;
		int b= 4;
		int suma = a+b;
		
		assertNotEquals(8,suma);
		assertEquals(7,suma);
		assertNotEquals(10,suma);
	}
	

}