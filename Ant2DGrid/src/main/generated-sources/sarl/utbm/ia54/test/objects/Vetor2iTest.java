/**
 * 
 */
package utbm.ia54.test.objects;

import static org.junit.Assert.*;

import org.junit.Test;

import utbm.ia54.ant2dgrid.objects.Vector2i;

/**
 * @author Michel
 *
 */
public class Vetor2iTest {

	Vector2i vector;
	
	/**
	 * Test method for {@link utbm.ia54.ant2dgrid.objects.Vector2i#Vector2i()}.
	 */
	@Test
	public void testVector2i() {
		vector = new Vector2i(1,1);
		assertEquals(vector.getX(), 1);
		assertEquals(vector.getY(), 1);
	}
	
	@Test
	public void testSetVector2i() {
		vector = new Vector2i();
		assertEquals(vector.getX(), 0);
		assertEquals(vector.getY(), 0);
		vector.setXY(2, 2);
		assertEquals(vector.getX(), 2);
		assertEquals(vector.getY(), 2);
	}

}
