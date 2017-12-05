package utbm.ia54.test.objects;

import static org.junit.Assert.*;

import org.junit.Test;

import utbm.ia54.ant2dgrid.Enum.CellState;
import utbm.ia54.ant2dgrid.objects.Cell;
import utbm.ia54.ant2dgrid.objects.Vector2i;

public class CellTest {
	
	Cell cell;
	
	@Test
	public void testCell() {
		cell = new Cell();
		
		assertEquals(cell.getState(), CellState.NORMAL);
		if(cell.getState() != CellState.NORMAL) {
			fail("cell State wall");
		}
		assertEquals(cell.getNumberAnt(), 0);
		if(cell.getNumberAnt() != 0) {
			fail("ant number >0");
		}
	}
	
	@Test
	public void testSetCell() {
		cell = new Cell(4, 6, CellState.WALL);
		assertEquals(cell.getPosition().equals(new Vector2i(4,6)), true);
		assertTrue(cell.getPosition().getX() == 4);
		assertTrue(cell.getPosition().getY() == 6);
		assertEquals(cell.getState(), CellState.WALL);
		assertEquals(cell.getNumberAnt(), 0);
		
	}

}
