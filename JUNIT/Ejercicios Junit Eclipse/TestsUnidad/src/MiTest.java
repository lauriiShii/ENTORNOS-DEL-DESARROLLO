import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;


public class MiTest {
	@Test
	public void  testOperadorResta(){
		int a=2;
		int b= 4;
		int suma = a-b;
		
		assertNotEquals(8,suma);
		assertEquals(7,suma);
		assertNotEquals(10,suma);
	}
}
