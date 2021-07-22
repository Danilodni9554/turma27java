package revisao;

import junit.framework.TestCase;

public class SomaTest extends TestCase {

	Soma soma = new Soma();
	
	public void testSomar() {
		int resultado = soma.somar(10, 10);
		
		assertEquals(20, resultado);
		
	}

}
